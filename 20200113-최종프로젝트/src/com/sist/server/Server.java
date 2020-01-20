package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.common.*;

public class Server implements Runnable {
	// 연결 => 접속 처리 => ServerSocket
	// 각 클라마다 통신 담당 (Thread) => Socket <=> Socket
	//1 . 서버가동
	private ServerSocket ss;
	private final int PORT=8888;
	// 접속자 저장 공간
	private Vector<Client> waitVc=new Vector<Server.Client>();  // Server생략 가능
	private Vector<Room> roomVc=new Vector<Room>();
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			System.out.println("Server start....");
		}catch(Exception ex) {}
	}
	// 접속시 처리
	public void run()
	{
		try
		{
			while(true)
			{
				//접속을 했다면 => 클라이언트의 정보 수집 => IP,PORT(Socket)
				Socket s=ss.accept();
				//s ( 클라의 정보 ip, port) => Thread 로 전송 ( 각자통신 가능)
				Client client=new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}
	// 내부 클래스 통신 담당 부분 ( 각 클라이언트마다 따로 작업 )
	class Client extends Thread 
	{
		String id,name,sex,pos;
		//pos=> 방위치
		int avatar;
		//통신
		Socket s; // 통신장비
		// 보내기
		OutputStream out;
		// 받기
		BufferedReader in;
	
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();  // 클라의 저장위치 => 읽어갈 수 있게 만듦
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//Inputstreamreader 필터스트림 => byte 를 2byte로 변환해서 읽어옴
			}catch (Exception ex) {}
		}
		// 클라랑 통신
		public void run()
		{
			 // 100| id | 이름 |성별
			try
			{
				while(true)
				{
					String msg=in.readLine(); // 클라의 전송값
					System.out.println("Client=>"+msg);
					StringTokenizer st=
										new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
							case Function.LOGIN:
							{
								id=st.nextToken();
								name=st.nextToken();
								sex=st.nextToken();
								pos="대기실";
								avatar=Integer.parseInt(st.nextToken());
								
								messageAll(Function.LOGIN+"|"
														+id+"|"+name+"|"+sex+"|"+pos);
								// 먼저 들어와있는 사람들에게 내 정보 뿌리기
								// 나 추가하기
								waitVc.add(this);
								messageTo(Function.MYLOG+"|"+id);
								
								for(Client user:waitVc)
								{
									// 전체적으로 한 번 더 뿌리기 ( +나 포함)
									messageTo(Function.LOGIN+"|"
											+user.id+"|"+user.name+"|"
											+user.sex+"|"+user.pos);
								}
								// 개설된 방 
								for(Room room:roomVc)
								{
									messageTo(Function.MAKEROOM+"|"+room.roomName+"|"+room.roomState+"|"
											+ room.current+"/"+room.maxcount);
								}
								break;
								
							}
							case Function.WAITCHAT:
							{
								messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
								break;
							}
							case Function.EXIT: //나가기를 요청했다면 id를 제거
							{
								String mid=id;
								for (int i=0; i<waitVc.size();i++)
								{
									Client user=waitVc.get(i);
									if (mid.equals(user.id))
										{
											// 윈도우 종료
											messageTo(Function.MYEXIT+"|");
											//Vector 에서 제거 
											waitVc.remove(i);
											//통신닫기
											in.close();
											out.close();
											break;
										}
								}
								// 전체 메세지 => 나가는 유저를 테이블에서 삭제
								messageAll(Function.EXIT+"|"+mid);
								break;
							}
							case Function.MAKEROOM:
							{
								Room room =new Room(st.nextToken(), st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
								room.userVc.add(this);
					
								
								roomVc.add(room);
								pos=room.roomName;   //포지션이 대기실에서 방으로 바뀐다
								//room.bang=id;F
								
								messageAll(Function.MAKEROOM+"|"+room.roomName+"|"+room.roomState+"|"
								+ room.current+"/"+room.maxcount);  // 1/6
								
							//방에 들어가자
								messageTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avatar+"|");
													//??  +room.bang
								// 대기실
								messageAll(Function.POSCHANGE+"|"+id+"|"+pos);
								break;
							}
							case Function.ROOMIN:
							{
								 //	(Function.ROOMIN+"|"+rn)
								String rn=st.nextToken();  // rn만 받아오면 된다
								/*
								 * 		1. 방이름
								 *  		2. 방 찾아서 <=  roomVc
								 *  		3. pos,current변경
								 *  		================================
								 *  		ROOMADD = 이미 방에 들어가 있는 사람
								 *  			1. 방에 입장하는 사람의 정보 전송 (id,avatar)
								 *  			2. 입장메시지 전송
								 *  		ROOMIN = 들어 갈 사람
								 *  			1. 방에 들어가라는 명령 
								 *  			2. 방에 있는 사람들의 정보를 보내줌
								 *  		WAITUPDATE= 웨이팅 리스트 변경  
								 */
								for ( Room room:roomVc)
								{
									if(rn.equals(room.roomName)) // 방찾기
									{
										pos=room.roomName; // 방이름으로 방을 찾아서 들어라가
										room.current++; // 현재인원 +1
										
										for(Client user:room.userVc)
										{
											user.messageTo(Function.ROOMADD+"|"
													+id+"|"+sex+"|"+avatar);
											user.messageTo(Function.ROOMCHAT+"|[알림→]"+id+"님이 입장하셨습니다");
										}
										// 방에 들어가는 사람 처리
										room.userVc.add(this);
										messageTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avatar);
									
										// user= 상대방, this= 나
										for(Client user:room.userVc)
										{  // 내 id아닌 다른 사람들 아이디
											if(!id.equals(user.id))
											{
												messageTo(Function.ROOMADD+"|"
														+user.id+"|"+user.sex+"|"+user.avatar);
											}
										}// ///대기실 정보 갱신
										messageAll(Function.WAITUPDATE+"|"+room.roomName+"|"
												+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
									}
								}
								//대기실 변경
	
								// 전체적으로 전송
								/* 
								 * 대기실 => messageAll
								 * 방 => messageTo
								 * 
								 * => 행위자 처리
								 * => 남아있는 사람
								 * => 대기실
								 */
								break;
							}
							case Function.ROOMCHAT:
							{
								String rn=st.nextToken();
								String strMsg=st.nextToken();
								// 방을 찾는다
								for(Room room:roomVc)
								{
									if(rn.equals(room.roomName))
									{
										for(Client user: room.userVc)
										{ // 나한테 뿌려준다
											user.messageTo(Function.ROOMCHAT+"|["+name+"]"+strMsg);
										}
									}
								}
								break;
							}
							case Function.ROOMOUT:
							{
								/////방찾기
								String rn=st.nextToken();
								for(int i=0; i<roomVc.size();i++)
								{
									Room room=roomVc.get(i);
									if(rn.equals(room.roomName))
									{
										pos="대기실";
										room.current--;
										
										//방에 남아있는 사람
										for(Client user:room.userVc)
										{
											if(!user.id.contentEquals(id))
											{
												user.messageTo(Function.ROOMOUT+"|"+id);
												user.messageTo(Function.ROOMCHAT+"|"+"|[알림→] "+name+"님이 퇴장하였습니다");
											}
										}
										// 실제 나간 사람
										for(int j=0;j<room.userVc.size();j++)
										{
											Client user=room.userVc.get(j);
											if(id.equals(user.id))
											{
												//userVc 에서 제거 = j번째
												room.userVc.remove(j);
												messageTo(Function.MYROOMOUT+"|");
												break;
							
											}
										}
										// 대기실
										messageAll(Function.WAITUPDATE+"|"+room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
										if(room.current==0)
										{
											roomVc.remove(i);
											break;
										}
									}
								}
								break;
							}
							case Function.KANG:
							{
								String rn=st.nextToken();
								String yid=st.nextToken();
								for(Client user:waitVc)
								{
									if(yid.equals(user.id))
										{
											user.messageTo(Function.KANG+"|"+rn);
										}
								}
						      }
					}
				}
			}catch (Exception ex) {}
		}
		// 반복을 제거 => 메소드
		// 서버에서 전송 
		//개인적 msgto      전체 msgall
		public synchronized void messageTo(String msg)
		{
			try
			{									// 한 줄을 읽어오니까!
				out.write((msg+"\n").getBytes());
				// readLine() =>  끝나는 시점 = ( \n)
				
			}catch(Exception ex) {}
		}
		public void messageAll(String msg) //synchronized 생략 가능
		{
			try
			{
				for(Client user:waitVc)
				{
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
}

