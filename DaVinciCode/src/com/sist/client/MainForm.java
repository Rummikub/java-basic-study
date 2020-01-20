package com.sist.client;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collections;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.sist.common.Function;
import com.sist.dao.MemberDAO;

public class MainForm extends JFrame implements ActionListener, Runnable, MouseListener { // ActionLister 인터페이스
	Login login = new Login();
	StartRoom sr = new StartRoom(); // 1/12 이름 변경 : WaitRoom → StartRoom
	GameRoom gr = new GameRoom();
	WaitingRoom wr = new WaitingRoom(); // 1/12 신규 생성 : WaitingRoom
	CardLayout card = new CardLayout();
	MakeRoom mr = new MakeRoom();
	//서버 연결과 관련된 라이브러리
	Socket s; //서버 연결
	OutputStream out;// 서버로 데이터 전송 (요청)
	BufferedReader in; //서버에서 응답한 데이터를 받는다.

	Image img,img2;
	String myRoom;
	MainForm() {
		this.setTitle("The Da Vinci Code Game"); // 타이틀에 게임제목 노출
		setLayout(card);
		add("GAME", gr);
		add("LOGIN", login);

		add("SR", sr);
		add("WR", wr );

		setSize(1024, 768); // 윈도우창 사이즈 설정
		setVisible(true); // 윈도우를 보여라.
		setResizable(false); // 창 크기 변경 불가능하게
		setLocationRelativeTo(null); // 창이 정 중앙에 뜨게
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료 시 게임 종료되도록 (그렇지 않으면 게임 꺼도 계속 돌아감...)

		login.b1.addActionListener(this);
		wr.chatInput.addActionListener(this);
		wr.b1.addActionListener(this); //방만들기
		wr.b2.addActionListener(this); //나가기
		wr.table1.addMouseListener(this);
		mr.b1.addActionListener(this);	// 실제방만들기
		mr.b2.addActionListener(this);  // 방만들기 취소
		sr.b1.addActionListener(this); //준비
		sr.b2.addActionListener(this); //시작
		sr.b3.addActionListener(this); //나가기
		sr.chatInput.addActionListener(this);
		sr.b4.addActionListener(this); //강퇴
		gr.chatInput.addActionListener(this);
		gr.confirmGameEnd.addActionListener(this);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Exception e) {
		}
		MainForm mf = new MainForm();
	}

	// ActionEvent Starts
	@Override
	public void actionPerformed(ActionEvent e) {
		// [로그인] 로그인 버튼 - ID/PW 일치여부 판정 
		if(e.getSource()==login.b1) {
			String id = login.tf.getText();
			if(id.length()<1) {
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf.requestFocus();
				return;
			}
			String pwd = String.valueOf(login.pf.getPassword());
			if(pwd.length()<1) {
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				login.pf.requestFocus();
				return;
			}
			MemberDAO dao = new MemberDAO();
			String result = dao.isLogin(id, pwd);
			if(result.equals("NOID")) {
				JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다.");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}else if(result.equals("NOPWD")) {
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다.");
				login.pf.setText("");
				login.pf.requestFocus();
			}else {
				connection(result);
			}

		}
		// [게임방] 게임끝컨펌
		if (e.getSource() == gr.confirmGameEnd) {
			card.show(getContentPane(),"GR");
		}
		// [대기실] 방 만들기
		if (e.getSource() == wr.b1) {
			mr.tf.setText("");
			mr.rb1.setSelected(true);
			mr.box.setSelectedIndex(0);
			mr.la4.setVisible(false);
			mr.pf.setVisible(false);
			mr.pf.setText("");
			mr.tf.requestFocus();
			mr.setVisible(true);
		}
		// [대기실] 채팅입력창 
		else if(e.getSource() == wr.chatInput) { 
			// 입력된 문자열 읽기
			String msg = wr.chatInput.getText();
			if(msg.length()<1) {
				wr.chatInput.requestFocus();
				return;
			}
			// 서버로 전송 
			try {
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			} catch (Exception ex) {}
			wr.chatInput.setText("");
		}
		// [대기실] 게임종료 버튼 
		else if(e.getSource() ==wr.b2) {
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		// [방만들기 JDialog] 방만들기 버튼 
		else if(e.getSource() == mr.b1) {
			//1. 방이름
			String rn = mr.tf.getText();
			if(rn.length() <1) {
				JOptionPane.showMessageDialog(this, "방 이름을 입력하세요");
				mr.tf.requestFocus();
				return;
			}
			System.out.println(wr.model1.getRowCount());
			for (int i=0; i<wr.model1.getRowCount(); i++) {
				String roomName = wr.model1.getValueAt(i, 0).toString();
				if(rn.equals(roomName)) {
					JOptionPane.showMessageDialog(this, "이미 존재하는 방입니다./n다시 입력하세요");
					mr.tf.setText("");
					mr.tf.requestFocus();
					return;
				}
			}
			//공개 비공개
			String rs =""; //상태
			String rp =""; //비밀번호
			if(mr.rb1.isSelected()) {
				rs="공개";
				rp=" ";
			}
			else {
				rs="비공개";
				rs=String.valueOf(mr.pf.getPassword());
			}
			//인원
			int inwon = mr.box.getSelectedIndex()+2;
			//서버로 전송
			try {
				out.write((Function.MAKEROOM+"|"+rn+"|"+rs+"|"+rp+"|"+inwon+"\n").getBytes());
			}catch(Exception ex) {}
				mr.setVisible(false);
		}
		// [방만들기 JDialog]  취소 버튼 
		else if(e.getSource() == mr.b2) {
			mr.setVisible(false);
		}
		// [시작룸] 준비 버튼 
		else if(e.getSource() == sr.b1) {
			try {
				out.write((Function.GAMEREADY+"|"+myRoom+"\n").getBytes());
			}catch (Exception ex) {}
		}
		// [시작룸] 시작 버튼 
		else if(e.getSource() == sr.b2) {
			System.out.println("게임 시작하십쇼(클라)");
			try {
				out.write((Function.GAMESTART +"|"+myRoom+"\n").getBytes());
			}catch(Exception ex) {}
		}
		// [시작룸] 나가기 버튼
		else if(e.getSource()==sr.b3) 
		{
			try
			{
				out.write((Function.ROOMOUT+"|"+myRoom+"\n").getBytes());
			}catch(Exception ex) {}
		}
		// [시작룸] 채팅입력창 
		else if (e.getSource() == sr.chatInput) {
			String msg = sr.chatInput.getText();
			if (msg.length() < 1) {
				sr.chatInput.requestFocus();
				return;
			}
			try {
				out.write((Function.SRCHAT+"|"+myRoom+"|"+msg+"\n").getBytes()); // out.write(); ==> 서버로 값이 넘어감
			} catch (Exception ex) {}
			sr.chatInput.setText(""); // 채팅입력창 비워준다
		}
		// [게임룸] 채팅입력창 
		else if (e.getSource() == gr.chatInput) {
			String msg = gr.chatInput.getText();
			if (msg.length() < 1) {
				wr.chatInput.requestFocus();
				return;
			}
			try {
				out.write((Function.ROOMCHAT+"|"+myRoom+"|"+msg+"\n").getBytes()); // out.write(); ==> 서버로 값이 넘어감
				// 방 이름이 넘어가야 방에 있는 사람들에게만 채팅메시지 보낼 수 있음
				// 방 이름 중복되지 않게 해놨으니까 가능
				// 방 안에 userVc있으니까 방에 들어간 사람 찾을 수 있음!
				// 방 찾으려고 myroom이라고 전역변수 만들어놓았음
			} catch (Exception ex) {}
			gr.chatInput.setText(""); // 채팅입력창 비워준다
		}
		// 화면전환 (card.show) ==> 서버 통신 동작으로 변경 필요 
		if (e.getSource() == sr.b1) {
			card.show(getContentPane(), "GR");
		}
		if (e.getSource() == gr.confirmGameEnd) {
			card.show(getContentPane(),"GR");
		}
// MYPICKDUMMY
				if(gr.dummyClickTurn == false || (gr.tail.size()>=4 || gr. tail2.size()>=4)) {			// 게임이 시작하기 전단계라면    OR   플레이어가 고른 카드수가 둘다 4보다 클떄까지 카드만 가져옴
					for(int j=0; j<24; j++) {
						if(e.getSource()==gr.dummy[j]) {
							if(gr.playerTurn == 0) {
								gr.dummy[j].setVisible(false); 									//기존 버튼 이미지 날리기
								if(gr.su[j]>12)													 //블랙 화이트 구분하기 위한 숫자 변환 12보다 큰수들은 white에 값
									gr.su[j] = gr.su[j]-12+0.5;										//같아진 블랙 화이트 카드를 0.5의 값으로 크기를 구분
								gr.tail.add(gr.su[j]);
								Collections.sort(gr.tail); 											// 리스트 정렬
									//카드를 가져온수만큼 player에 레이블을 뿌린다.
									for(int k=0; k<gr.tail.size();k++) {
										gr.imageBuf1[k] = gr.setCardImage(gr.tail.get(k));
										gr.temp[k] = gr.tail.get(k);
										gr.play1[k].setIcon(new ImageIcon(gr.imageBuf1[k]));
										gr.play1[k].setOpaque( true);
										gr.play1[k].setBorder(gr.borderEmpty);
										if(gr.tail.get(k)%0.5!=0) {										// 게임이 진행되면서 비공개 에서 공개된 값들을 구분하게 뿌려준다.
											double c = gr.tail.get(k)-0.01;
											gr.play1[k].setBorder(gr.borderEmpty);
											gr.play1[k].setIcon(new ImageIcon(gr.reverseCardImage(c)));
										}
									}
									for (int i=0; i<12; i++) {											//현재 선택된 값을 구분하기 위해 count에 위치를 저장해둔다.
										if(gr.su[j]==gr.temp[i]) {
											gr.count =i;
											gr.play1[gr.count].setBorder(gr.border);
											break;
										}
									}
									if((gr.tail.size()<=4 || gr.tail2.size()<=4) &&gr. dummyClickTurn ==false){	//player들이 4장씩 가져오기 전까지 턴을 바꿔가며 가져온다.
										gr.turnChange();
										if(gr.tail.size()!=0 ||gr. tail2.size()!=0) {							//본격적인 게임 시작전 내 레이블과 상대레이블을 만질수 없게 하는 예외처리
											gr.disableLabel_1(gr.tail.size());
											gr.disableLabel_2(gr.tail2.size());
										}
									}
									if(gr.dummyClickTurn ==true) {											//게임이 시작되었다면 Dummy에서 카드를 가져온 이후 추가로 Dummy를 못가져가게 하는 예외처리
										gr.disableDummy();
										System.out.println("내턴 상대방고르기");
										gr.enableLabel_2(gr.tail2.size());
										gr.disableLabel_1(gr.tail.size());
										gr.messageByPlyer(10);
									}
									return;
							}
							try {
								out.write((Function.PICKDUMMY+"|"+myRoom+"\n").getBytes());
							}catch(Exception ex) {}
// PICKDUMMY
							}else if (gr.playerTurn ==1) {
								gr.dummy[j].setVisible(false);
								if(gr.su[j]>12)
									gr.	su[j] = gr.su[j]-12+0.5;
								gr.tail2.add(gr.su[j]);
								Collections.sort(gr.tail2);
									for(int k=0; k<gr.tail2.size();k++) {
										gr.imageBuf2[k] = gr.setCardImage(gr.tail2.get(k));
										gr.temp2[k] =gr. tail2.get(k);
										gr.play2[k].setIcon(new ImageIcon(gr.imageBuf2[k]));
										gr.play2[k].setOpaque(true);
										gr.play2[k].setBorder(gr.borderEmpty);
										if(gr.tail2.get(k)%0.5!=0) {
											double c =gr. tail2.get(k)-0.01;
											gr.play2[k].setIcon(new ImageIcon(gr.changeCardImage(c)));
											gr.play2[k].setBorder(gr.borderEmpty);
										}

									}
									for (int i=0; i<12; i++) {
										if(gr.su[j]==gr.temp2[i]) {
											gr.count2 =i;
											gr.play2[gr.count2].setBorder(gr.border);
											break;
										}
									}
									if((gr.tail.size()<=4 || gr.tail2.size()<=4) &&gr. dummyClickTurn ==false) {
										gr.turnChange();
										if(gr.tail.size()!=0 || gr.tail2.size()!=0) {
											gr.disableLabel_1(gr.tail.size());
											gr.disableLabel_2(gr.tail2.size());
										}
									}
									if(gr.dummyClickTurn ==true) {
										gr.	disableDummy();
										System.out.println("상대턴 내꺼 고르기");
										gr.enableLabel_1(gr.tail.size());
										gr.disableLabel_2(gr.tail2.size());
										gr.messageByPlyer(10);
									}
									return;
							}
							try {
								out.write((Function.PICKDUMMY+"|"+myRoom+"\n").getBytes());
							}catch(Exception ex) {}
						}
					} // Function
	}
	// ActionEvent Ends 
	
	// userData와 connect 
	public void connection(String userData) {
		try {
			s = new Socket("localhost",8888); //전화 걸기
			//송신/수신
			out=s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			//로그인 데이터 보내기
			// 100|hong|홍길동|남자\n
			out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
		}catch(Exception ex) {}
		//서버로부터 데이터를 읽기 시작
		new Thread(this).start();
	}

	// 서버로부터 데이터를 수신하는 기능
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				// 100|hong|홍길동|남자|대기실\n
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol) {
					case Function.LOGIN:{
						String[] data = {
							st.nextToken(),  //아이디
							st.nextToken(),	 //캐릭터 이름
							st.nextToken(), //아바타 숫자
							//st.nextToken()	//위치
						};
						wr.model2.addRow(data);
						break;
					}
					case Function.MYLOG:{
						String id = st.nextToken();
						setTitle(id);
						card.show(getContentPane(), "WR");
						break;
					}
					case Function.WAITCHAT:{
						wr.chatHistory.append(st.nextToken()+"\n");
						// 스크롤이 최하단으로 자동으로 내려가게 설정
						int sc = wr.chatHistory.getText().length();
						wr.chatHistory.setCaretPosition(sc);
						break;
					}
					case Function.EXIT: { //남아 있는 사람
						String id =st.nextToken();
						for(int i=0; i< wr.model2.getRowCount();i++) {
							String mid = wr.model2.getValueAt(i,0).toString();
							// (String)wr.model2.getVaoueAt(i,0)
							if(mid.equals(id)){
								wr.model2.removeRow(i);
								break;
							}
						}
						break;
					}
					case Function.MYEXIT:{ //실제 나가는 사람 처리

						dispose(); //메모리 회수
						System.exit(0); //프로그램 종료

					}
					case Function.MAKEROOM:{
						String[] data = {st.nextToken(), //방이름
										st.nextToken(),  //상태 (공개/비공개)
										st.nextToken()}; //인원 1/6
						wr.model1.addRow(data); //대기방에 방목록
						break;
					}
					case Function.ROOMIN:{
						/*
						 * Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+img_name+"|"+img_source
						 *
						 */
						 myRoom = st.nextToken();
						 String id = st.nextToken();
						 String img_name = st.nextToken();
						 String img_source = st.nextToken();
						 //Image img ;
						 String temp ="";
//						 if(sex.equals("남자")) {
//							 temp ="m"+avatar; //m1.png, m2.png ...
//						 }else {
//							 temp = "w"+avatar; //w1.png, w2.png ...
//						 }
						card.show(getContentPane(), "SR"); //스타팅룸으로 들어감

						 for(int i=0;i<2;i++){
							{
								if(sr.sw[i]==false)
								{
									sr.sw[i]=true;
									sr.pans[i].removeAll();  // 라벨을 지워야 새로운 라벨을 올릴 수 있다
									sr.pans[i].setLayout(new BorderLayout());
									sr.pans[i].add("Center",new JLabel(new ImageIcon(sr.getImageSizeChange(new ImageIcon(img_source), 160, 199))));
									sr.pans[i].validate();  // 재배치 remove-validate
									sr.ids[i].setText(id);
									break;
								}
							}
						 }
						 break;
					}
					case Function.ROOMADD:{
						 String id = st.nextToken();
						 String img_name = st.nextToken();
						 String img_source = st.nextToken();
						 for(int i=0;i<2;i++){
							{
								if(sr.sw[i]==false)
								{
									sr.sw[i]=true;
									sr.pans[i].removeAll();  // 라벨을 지워야 새로운 라벨을 올릴 수 있다
									sr.pans[i].setLayout(new BorderLayout());
									sr.pans[i].add("Center",new JLabel(new ImageIcon(sr.getImageSizeChange(new ImageIcon(img_source), 160, 199))));
									sr.pans[i].validate();  // 재배치 remove-validate
									sr.ids[i].setText(id);
									break;
								}
							}
						 }
						 break;
					}
					case Function.ROOMCHAT:{
						gr.chatHistory.append(st.nextToken()+"\n");
						// 스크롤이 최하단으로 자동으로 내려가게 설정
						int sc = gr.chatHistory.getText().length();
						gr.chatHistory.setCaretPosition(sc);
						break;
					}
					case Function.SRCHAT:{
						sr.chatHistory.append(st.nextToken()+"\n");
						// 스크롤이 최하단으로 자동으로 내려가게 설정
						int sc = sr.chatHistory.getText().length();
						sr.chatHistory.setCaretPosition(sc);
						break;
					}		
					case Function.GRCHAT:{
						sr.chatHistory.append(st.nextToken()+"\n");
						// 스크롤이 최하단으로 자동으로 내려가게 설정
						int sc = sr.chatHistory.getText().length();
						sr.chatHistory.setCaretPosition(sc);
						break;
					}
					case Function.WAITUPDATE:
					{
						//messageAll(Function.WAITUPDATE+"|"+room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
						String rn=st.nextToken();
						String current=st.nextToken();
						String maxcount=st.nextToken();
						String id=st.nextToken();
						String pos=st.nextToken();


						// t1에서 방을 찾기
						for(int i=0; i<wr.model1.getRowCount(); i++)
						{
							String roomName=wr.model1.getValueAt(i, 0).toString();
							if(rn.equals(roomName))
							{
								if(Integer.parseInt(current)==0)
								{
										wr.model1.removeRow(i);
								}
								else
								{
										wr.model1.setValueAt(current+"/"+maxcount, i, 1);

								}
								break;
							}
						}
						//접속자 목록 변경
						for( int i=0; i<wr.model2.getRowCount();i++)
						{
							String mid=wr.model2.getValueAt(i, 0).toString();
							if(mid.equals(id))
							{
								wr.model2.setValueAt(pos, i, 2);
							}
						}
						break;
					}
					case Function.POSCHANGE:
					{
						String id=st.nextToken();
						String pos=st.nextToken();
						//String bang=st.nextToken();
						for( int i=0; i<wr.model2.getRowCount();i++)
						{
							String mid=wr.model2.getValueAt(i, 0).toString();
							if(mid.equals(id))
							{
								wr.model2.setValueAt(pos, i, 2);
							}
						}
						break;
					}
					case Function.ROOMOUT:
					{
						String id=st.nextToken();
						for(int i=0;i<2;i++)
						{
							String mid=sr.ids[i].getText();
							if(id.equals(mid))  // 아이디가 같으면 제거해라
							{
								sr.sw[i]=false;
								sr.pans[i].removeAll();
								sr.pans[i].setLayout(new BorderLayout());
								sr.pans[i].add("Center",new JLabel(new ImageIcon(sr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 160, 199))));
								sr.pans[i].validate();
								sr.ids[i].setText("");
								break;
							}
						}
						break;
					}
					case Function.MYROOMOUT:
					{
						// 초기화 ( 내가 빠져나가기 전에 )
						for(int i=0;i<2;i++)
						{
							sr.sw[i]=false;
							sr.pans[i].removeAll();
							sr.pans[i].setLayout(new BorderLayout());
							sr.pans[i].add("Center",new JLabel(new ImageIcon(sr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 160, 199))));
							sr.pans[i].validate();
							sr.ids[i].setText("");
						}
						sr.chatHistory.setText("");
						sr.chatInput.setText("");
						card.show(getContentPane(), "WR");  // 대기실로 이동해라
						break;
					}
					case Function.KANG:
					{
						String rn=st.nextToken();
						JOptionPane.showMessageDialog(this, rn+"방에서 강퇴되었습니다");
						out.write((Function.ROOMOUT+"|"+rn+"\n").getBytes());
						break;
					}
					case Function.GAMEREADY:{
						myRoom = st.nextToken();
						String id = st.nextToken();
						String img_source = st.nextToken();
						card.show(getContentPane(), "GAME");
						for(int i=0;i<2;i++){
							{
								if(gr.sw[i]==false)
								{
									gr.sw[i]=true;
									gr.pans[i].removeAll();  // 라벨을 지워야 새로운 라벨을 올릴 수 있다
									gr.pans[i].setLayout(new BorderLayout());
									gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon(img_source), 160, 199))));
									gr.pans[i].validate();  // 재배치 remove-validate
									gr.ids[i].setText(id);
									break;
								}
							}
						 }
					 break;
					}

					case Function.GAMESTART:{
						 System.out.println(msg);
						 myRoom = st.nextToken();
						 System.out.println("메시지2");
						 String id = st.nextToken();
						 System.out.println("메시지3");
						 String img_source = st.nextToken();
						 System.out.println("메시지4");
						 card.show(getContentPane(), "GAME");
						 System.out.println("게임 카드 바꾸기");
						 for(int i=0;i<2;i++){
								{
									if(gr.sw[i]==false)
									{
										gr.sw[i]=true;
										gr.pans[i].removeAll();  // 라벨을 지워야 새로운 라벨을 올릴 수 있다
										gr.pans[i].setLayout(new BorderLayout());
										gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon(img_source), 160, 199))));
										gr.pans[i].validate();  // 재배치 remove-validate
										gr.ids[i].setText(id);
										break;
									}
								}
							 }
						 break;
					}
					case Function.MYPICKDUMMY:
					{	
						//1.방이름 조회 
						String rn=st.nextToken();
						//2. 더미에서 카드 고르는 메소드를 호출  (위에서 함 ) 
						//3. 덱이 채워졌으니 PICKDUMMY호출 
						out.write((Function.PICKDUMMY+"|"+rn+"\n").getBytes());
						break;
					}
					case Function.PICKDUMMY:
					{
						//4번의 카드 뽑기를 실행해달라고 서버에 요청
						for (int i=0;i<4;i++)
						{
							out.write((Function.MYPICKDUMMY+"|"+"\n").getBytes());
							break;
						}
						out.write((Function.MYPICKCARD+"|"+"\n").getBytes());
						break;
					}
					case Function.MYPICKCARD:
					{
//actionperformed 에서 해결  
						
						break;
					}
					case Function.PICKCARD:
					{
//actionperformed	위랑 같이 해결?
						
						break;
					}
					case Function.MYGUESS:
					{
						 /*  추리에 성패에 따라 suc/fail함수 호출하라고 요청 
						if(tempValue ==gr. choose || gr.temp2[i] == gr.choose)
						{
							out.write((Function.SUCCESS+"|"+myroom+"\n").getBytes());
						}else  
						{
							out.write((Function.FAIL+"|"+myroom+"\n").getBytes());
						}
						*/
						break;
					}
					case Function.GUESS:
					{
						/* 2. 추리 성패에 따라 suc/fail함수 호출 요구
					 	if (e.getSource() == gr.mydeck)
					 	{
					 		out.write((Function.SUCCESS+"|"+rn+"\n").getBytes());
					 	}else
					 		out.write((Function.FAIL+"|"+rn+"\n").getBytes());
					 	}
						*/
						break;
					}
					case Function.FAIL:
					{
						// 1. 상대의 새로운 카드가 상대에게 보인다 
						// 2. MYPICKCARD함수를 호출하라 
						break;
					}
					case Function.SUCCESS:
					{
						// 내 새로운 카드가 상대에게 보인다
						
						break;
					}
					case Function.MYFAIL:
					{
						// 1. 나의 새로운 카드가 상대에게 보인다 
						// 2. PICKCARD함수를 호출하라 
						break;
					}
					case Function.MYSUCCESS:
					{
						//1. 한번 더 할래?가 뜨고
						/*
						 if(e.getSource()== b1누르면) 
						 {
						   out.write (Function.MYGUESS)로 가게
						 }else if (e.getSource()==b2)
						 {
						 	out.write (Function.PICKCARD로)
						 }
						 */
						break;
					}
				}
			}
		}catch(Exception ex) {}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == wr.table1) {
			if(e.getClickCount()==2) {//더블클릭
				//방이름
				int row = wr.table1.getSelectedRow(); //값 비교를 위해 해당 row의 값들을 하나한 가져와서 비교함.
				String rn=wr.model1.getValueAt(row, 0).toString();
				String inwon=wr.model1.getValueAt(row,1).toString();
				//String state=wr.model1.getValueAt(row,1).toString();
				StringTokenizer st = new StringTokenizer(inwon,"/");

				//1/5
				int no1 = Integer.parseInt(st.nextToken()); //1
				int no2 = Integer.parseInt(st.nextToken()); //5
				if(no1==no2) {
					//방에 들어갈 수 없다.
					JOptionPane.showMessageDialog(this, "이미 방 인원이 찼습니다\n 다른방을 선택하세요");
				}else {
					try {
						out.write((Function.ROOMIN+"|"+rn+"\n").getBytes());
					}catch(Exception ex) {}
				}
			}
		}
// MYGUESS
		for(int i =0; i<12;i++) {
			if(e.getSource()==gr.play2[i]) {											//상대방의 레이블을 클릭했을떄 조건문
				if(e.getClickCount()==2) {
					//dialog = pane.showOptionDialog(null, "숫자를 고르세요","상대카드", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, numbers, numbers[0]);
					gr.choose = JOptionPane.showOptionDialog(null, "숫자를 고르세요","상대카드", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, gr.numbers,gr. numbers[0]);
					System.out.println("------");
					System.out.println(gr.choose);
					System.out.println("------");
					System.out.println(gr.temp2[i]);

					double tempValue = 0;											//값 변경 없이 비교를 위한 임시 변수(화이트 값은 0.5가 추가되었지만  사용자 입력은 0.5를 받지 않기 때문에 존재)
					if(gr.temp2[i]%1.0!=0) {
						System.out.println("계산");
						tempValue =gr. temp2[i] - 0.5;
						System.out.println(tempValue);
					}

					if(tempValue ==gr. choose || gr.temp2[i] == gr.choose) {					//임시변수와 temp2[i]는 같은 값이지만 버튼 클릭스 블랙 화이트가 구분지어지기 때문에 두개를 비고하여야 함.
						System.out.println("맞음");
						gr.play2[i].setIcon(new ImageIcon(gr.changeCardImage(gr.temp2[i])));
						gr.play2[i].setBorder(gr.borderEmpty);
						gr.tail2.set(i, gr.tail2.get(i)+0.01);
						gr.gameEndCheck();												//마우스 클릭 입력을 받았기에 게임 종료 상태인지를 체크
						if(gr.gameEndMessage==true){
							break;
						}else if(gr.gameEndMessage == false) {							//게임 종료 상태가 아니라면  턴을 이어갈것인지 종료할것인지를 체크
							gr.option = JOptionPane.showOptionDialog(null, "한 번더 숫자를 맞춰보실래요 ?","GoOrStop", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, gr.goOrStop,gr. goOrStop[0]);
							System.out.println(gr.option); //맞으면 0 틀리면 1
							if (gr.option ==0) {
								gr.messageByPlyer(1);
								gr.disableLabel_1(gr.tail.size());
							}else if(gr.option ==1) {
								gr.turnChange();
								gr.enableDummy();
								gr.messageByPlyer(6);
								gr.disableLabel_1(gr.tail.size());
								gr.disableLabel_2(gr.tail2.size());
							}
						}
					}else {																//값을 맞추지 못했을 경우에 내가 받는 패널티 구현
						System.out.println("틀림");
						gr.enableDummy();
						gr.disableLabel_1(gr.tail.size());
						gr.disableLabel_2(gr.tail2.size());
						gr.tail.set(gr.count,gr. tail.get(gr.count)+0.01);
						gr.play1[gr.count].setBorder(gr.borderEmpty);
						gr.play1[gr.count].setIcon(new ImageIcon(gr.reverseCardImage(gr.count)));
						gr.messageByPlyer(4);
						gr.turnChange();
					}
				}
//GUESS
			}else if (e.getSource() == gr.play1[i]) {
				if(e.getClickCount()==2) {

					 gr.choose = JOptionPane.showOptionDialog(null, "숫자를 고르세요","상대카드", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null,  gr.numbers,  gr.numbers[0]);
					System.out.println("------");
					System.out.println( gr.choose);
					System.out.println("------");
					System.out.println( gr.temp[i]);

					double tempValue = 0;
					if( gr.temp[i]%1.0!=0) {
						System.out.println("계산");
						tempValue = gr. temp[i] - 0.5;
						System.out.println(tempValue);
					}
					System.out.println( gr.count);

					if(tempValue ==  gr.choose ||  gr.temp[i] == gr. choose) {
						System.out.println("맞음");
						 gr.play1[i].setBorder( gr.borderEmpty);
						 gr.play1[i].setIcon(new ImageIcon( gr.reverseCardImage( gr.temp[i])));
						 gr.tail.set(i,  gr.tail.get(i)+0.01);

						 gr.gameEndCheck();
						if( gr.gameEndMessage==true){
							break;
						}else if( gr.gameEndMessage == false) {
							 gr.option = JOptionPane.showOptionDialog(null, "한 번더 숫자를 맞춰보실래요 ?","GoOrStop", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null,  gr.goOrStop,  gr.goOrStop[0]);
							System.out.println( gr.option); //맞으면 0 틀리면 1
							if ( gr.option ==0) {
								 gr.messageByPlyer(1);
								 gr.disableLabel_2( gr.tail2.size());
							}else if( gr.option ==1) {
								 gr.turnChange();
								 gr.messageByPlyer(6);
								 gr.enableDummy();
								 gr.disableLabel_1( gr.tail.size());
								 gr.disableLabel_2( gr.tail2.size());
							}
						}
					}else {
						System.out.println("틀림");
						 gr.enableDummy();
						 gr.disableLabel_1( gr.tail.size());
						 gr.disableLabel_2( gr.tail2.size());
						 gr.	tail2.set( gr.count2, gr. tail2.get( gr.count2)+0.01);
						 gr.play2[ gr.count2].setIcon(new ImageIcon( gr.changeCardImage( gr.temp2[ gr.count2])));
						 gr.play2[ gr.count2].setBorder( gr.borderEmpty);
						 gr.messageByPlyer(4);
						 gr.turnChange();
					}
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


}

