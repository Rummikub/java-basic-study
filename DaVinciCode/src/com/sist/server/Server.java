package com.sist.server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.sist.common.Function;
public class Server implements Runnable{
	//연결 => 접속 => ServerSocket
	//각 클라이언트마다 통신담당 (Thread) => Socket <=> Socket
	//1.서버 가동
	private ServerSocket ss;
	private final int PORT = 8888;
	//접속자 저장 공간

	private Vector<Client> waitVc = new Vector<Client>();
	private Vector<Room>	roomVc = new Vector<Room>();
	private Vector<GameRoom> gameRoomVc = new Vector<GameRoom>();
	public Server() {
		try {
			ss = new ServerSocket(PORT); //bind,listen
			System.out.println("Server Start .......");
		}catch (Exception ex) {}
	}
	//접속시 처리
	@Override
	public void run() {
		try {
			while(true) {
				//접속을 했다면 클라이언트의 정보 수집 => IP,PORT(Socket);
				Socket s = ss.accept();
				//s(클라이언트의 정보 (ip,port) => Thread로 전송 (각자마다 통신을 할 수 있다)
				Client client = new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	//통신을 담당하는 부분 (각 클라이언트마다 따로 작업을 한다)
	class Client extends Thread{
		String id,img_name,img_source,pos;
		int ready;
		//int img;
		//pos => 방위치
		//통신
		Socket s; //통신장비
		//보내기
		OutputStream out;
		//받기
		BufferedReader in;

		public Client(Socket s) {
			try {
				this.s = s;
				out = s.getOutputStream(); //클라이언트의 저장위치 => 일어갈수 있게 만든다.
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//inputStreamReader( 필터스트림) => byte -> 2bteㄹ 변환
			}catch (Exception ex) {}
		}
		//반복을 제거 => 메소드
		// 서버에서 => 전송
		// 개인적으로 전송

		//클라이언트와 통신
		@Override
		public void run() {
			try {
				// 100|hong|홍길동|남자\n
				while (true) {
					String msg = in.readLine();
					StringTokenizer st = new StringTokenizer(msg, "|");
					int protocol = Integer.parseInt(st.nextToken());
					switch (protocol) {
					case Function.LOGIN: {
						id = st.nextToken();
						img_name = st.nextToken();
						img_source = st.nextToken();
						pos = "대기실";

						messageAll(Function.LOGIN + "|" + id + "|" + img_name + "|" + pos);
						// img+"|"+
						waitVc.add(this);
						messageTo(Function.MYLOG + "|" + id);
						for (Client user : waitVc) {
							messageTo(Function.LOGIN + "|" + user.id + "|" + user.img_name + "|" + user.pos);
						}

						// 개설된 방 정보 전송
						for (Room room : roomVc) {
							messageTo(Function.MAKEROOM + "|" + room.roomName + "|" + room.current + "/" + room.maxcount
									+ "|" + room.roomState);
						}
						break;
					}
					case Function.WAITCHAT: {
						messageAll(Function.WAITCHAT + "|[" + id + "] " + st.nextToken());
						break;
					}
					case Function.EXIT: {
						String mid = id;
						for (int i = 0; i < waitVc.size(); i++) {
							Client user = waitVc.get(i);
							if (mid.equals(user.id)) {
								// 윈도우 종료
								messageTo(Function.MYEXIT + "|");
								// vector 제거
								waitVc.remove(i);
								// 닫기 (통신종료)
								in.close();
								out.close();
								break;
							}
						}
						// 전체 메세지 => 나가는 유저를 테이블에서 삭제
						messageAll(Function.EXIT + "|" + mid);
						break;
					}
					case Function.MAKEROOM: {
						/*
						 * Function.makeRoom
						 *
						 */
						Room room = new Room(st.nextToken(), st.nextToken(), st.nextToken(),
								Integer.parseInt(st.nextToken()));
						// String roomName, String roomState, String roomPwd, int maxcount)
						room.userVc.add(this);
						roomVc.add(room);
						pos = room.roomName;
						messageAll(Function.MAKEROOM + "|" + room.roomName + "|" + room.current + "/" + room.maxcount
								+ "|" + pos);
						// 방에 들어가게 만든다.
						messageTo(Function.ROOMIN + "|" + room.roomName + "|" + id + "|" + img_name + "|" + img_source);
						// 이미지 파일명 때문에 성별과 아바타 번호를 받는다.
						// 대기실
						messageAll(Function.POSCHANGE + "|" + id + "|" + pos);
						break;
					}
					case Function.ROOMIN: {
						// Function.ROOMIN+"|"+rn
						String rn = st.nextToken();
						/*
						 * 1. 방이름을 받는다. 2. 방을 찾는다 (roomVc) 3. pos.current 를 변경 =================== = 방에
						 * 있는 사람 처리 => ROOMADD 1. 방에 입장하는 사람의 정보를 정보 전송 (id,avata..) 2. 입장메시지 전송 = 방에
						 * 들어가는 사람 처리 => 1. 방에 들어가라 => ROOMIN 2. 방에 있는 사람들에게 정보를 보내준다. = 대기실 변경 인원수가 변경
						 * => 메시지 전송
						 *
						 */
						for (Room room : roomVc) {
							if (rn.equals(room.roomName)) { // 방찾기
								pos = room.roomName;
								room.current++;

								for (Client user : room.userVc) { 
									// uservc들어있는 첫번쨰 값이 true 니까 두번째 공간에다가 userVC에 들어있는 값을 넣어라.
									user.messageTo(Function.ROOMADD + "|" + id + "|" + img_name + "|" + img_source);
									user.messageTo(Function.SRCHAT + "|[알림☞] " + id + "님이 입장하셨습니다.");
								}
								// 본인처리
								room.userVc.add(this);
								messageTo(Function.ROOMIN + "|" + room.roomName + "|" + id + "|" + img_name + "|"
										+ img_source);

								for (Client user : room.userVc) {
									if (!id.equals(user.id)) {
										messageTo(Function.ROOMADD + "|" + user.id + "|" + user.img_name + "|"
												+ user.img_source);
									}
									// 대기실 갱신
									messageAll(Function.WAITUPDATE + "|" + room.roomName + "|" + room.current + "|"
											+ room.maxcount + "|" + id + "|" + pos);
								}
							}
						}
						break;
					}
					case Function.ROOMCHAT: {
						String rn = st.nextToken();
						String strMsg = st.nextToken();
						for (Room room : roomVc) {
							if (rn.equals(room.roomName)) {
								for (Client user : room.userVc) {
									user.messageTo(Function.ROOMCHAT + "|[" + id + "." + img_name + "]" + strMsg);
								}
							}
						}
						break;
					}
					case Function.ROOMOUT: {
						// 방찾기
						String rn = st.nextToken();
						for (int i = 0; i < roomVc.size(); i++) {
							Room room = roomVc.get(i);
							if (rn.equals(room.roomName)) {
								pos = "대기실";
								room.current--;

								// 방에 남아 있는 사람
								for (Client user : room.userVc) {
									if (!user.id.equals(id)) {
										user.messageTo(Function.ROOMOUT + "|" + id);
										user.messageTo(Function.SRCHAT + "|[알림☞] " + id+ "님이 퇴장하셨습니다");
									}
								}
								// 실제 나가는 사람
								for (int j = 0; j < room.userVc.size(); j++) {
									Client user = room.userVc.get(j);
									if (id.equals(user.id)) {
										// userVc에서 제거
										room.userVc.remove(j);
										messageTo(Function.MYROOMOUT + "|");
										break;
									}
								}
								// 대기실
								messageAll(Function.WAITUPDATE + "|" + room.roomName + "|" + room.current + "|"
										+ room.maxcount + "|" + id + "|" + pos);
								if (room.current == 0) 
								{
									roomVc.remove(i);
									break;
								}
							}
						}
						// messageTo(Function.MYROOMOUT+"|");
						 break;
					}
					case Function.GAMEREADY:{
						String rn = st.nextToken();
						//int c= Integer.parseInt(st.nextToken());
						System.out.println();
						for(int i=0;i<roomVc.size();i++) {
							System.out.println(roomVc.size());
							Room room = roomVc.get(i);
							System.out.println(roomVc.get(i));
							if(rn.equals(room.roomName)) {
								System.out.println(room.ready+"1");
								room.ready += 1;
								System.out.println(room.ready+"2");
								if(room.current!=room.maxcount) {
									System.out.println("숫자부족");
									messageTo(Function.ROOMCHAT+"|"+"상대방이 없습니다.");
									break;
								}
								else if(room.current == room.ready) {
									System.out.println(room.ready+"5");
									System.out.println("2명다 레뒤");
									for(Client user:room.userVc)
										user.messageTo(Function.GAMESTART+"|"+room.roomName+"|"+user.id+"|"+user.img_source);
								}
								else if(room.current != room.ready) {
									System.out.println(room.ready+"3");
									System.out.println("한명만 레뒤");  //한명만 레디
								}
								System.out.println(room.ready+"4");
								break;
//									   if(room.current== ) {
//										   messageTo(Function.ROOMCHAT+"|"+"상대방이 레디하지 않았습니다 ");
//										   messageTo(Function.GAMEREADY+"|"+rn+"\n");
//									   }else{
//										   for(Client user:room.userVc) {
//											   user.messageTo(Function.ROOMCHAT+"|"+"게임이 시작할 준비가 되었습니다");
//											   user.messageTo(Function.GAMEREADY+"|"+rn+"\n");
//										   }
//										   break;
//									   }
							}
							break;
						}
						break;
					   }
					   case Function.GAMESTART:{
						   System.out.println("게임 시작하십쇼(서버)");
						   GameRoom gameroom = new GameRoom(st.nextToken());
							//String roomName, String roomState, String roomPwd, int maxcount)
							gameroom.gamerVc.add(this);
							gameRoomVc.add(gameroom);
							//gameroom.roomName = st.nextToken();
							System.out.println(gameroom.roomName);
							System.out.println(id);
							System.out.println(img_source);
						   messageTo(Function.GAMESTART+"|"+gameroom.roomName+"|"+id+"|"+img_source);
						   break;
					   }
					   case Function.SRCHAT: {
							String rn = st.nextToken();
							String strMsg = st.nextToken();
							for (Room room : roomVc) {
								if (rn.equals(room.roomName)) {
									for (Client user : room.userVc) {
										user.messageTo(Function.SRCHAT+"|["+id+"] "+strMsg);
									}
								}
							}
							break;
						}
					   case Function.GRCHAT: {
							String rn = st.nextToken();
							String strMsg = st.nextToken();
							for (Room room : roomVc) {
								if (rn.equals(room.roomName)) {
									for (Client user : room.userVc) {
										user.messageTo(Function.GRCHAT+"|["+id+"] "+strMsg);
									}
								}
								for (Client user : room.userVc) { 
									// uservc들어있는 첫번쨰 값이 true 니까 두번째 공간에다가 userVC에 들어있는 값을 넣어라.
									user.messageTo(Function.ROOMADD + "|" + id + "|" + img_name + "|" + img_source);
									user.messageTo(Function.GRCHAT + "|[알림☞] " + id + "님이 입장하셨습니다.");
								}
							}
							break;
					   }
					   case Function.MYPICKDUMMY: {
							//1. 방이름조회 
							String rn=st.nextToken();
							//2. chatHistory에 id가 2개이면 MYPICKDUMMY를 실행  
							
							break;
						}
						case Function.MYPICKCARD:
						{
							String rn=st.nextToken();
						    // play[] == play2[]이면 MYPICKCARD를 호출 
							break;
						}
						case Function.PICKCARD:
						{	// PICKCARD의 결과가 넘온다? 호출
							String rn=st.nextToken();
							break;
						}
						case Function.MYGUESS:
						{
							// MYGUESS의 결과가 넘어온다?호출
							String rn=st.nextToken();
							break;
						}
						case Function.GUESS:
						{
							// GUESS의 결과가 넘어온다? 호출
							String rn=st.nextToken();
						
							break;
						}
						case Function.FAIL:
						{
							//FAIL의 결과가 넘어
							String rn=st.nextToken();
					
							break;
						}
						case Function.SUCCESS:
						{
							// GUESS 가라 
							String rn=st.nextToken();
							
							break;
						}
						case Function.MYFAIL:
						{
							// MYFAIL의 결과가 넘어 
							String rn=st.nextToken();
							break;
						}
						case Function.MYSUCCESS:
						{
							// MYGUESS를 호출해라 
							String rn=st.nextToken();
							break;
						}
					}
				}
			} catch (Exception ex) {}
		}

		//반복을 제거 => 메소드
		// 서버에서 => 전송
		// 개인적으로 전송
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
				//readLine() => 끝나는 시점 =(\n)
			}catch(Exception ex) {}
		}
		// 전체적으로 전송
		public synchronized void messageAll(String msg) {
			try {
				for(Client user:waitVc) {
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
}
