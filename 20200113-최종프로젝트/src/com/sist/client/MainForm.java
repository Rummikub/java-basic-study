package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import com.sist.common.Function;
import com.sist.dao.*;
//Server
 import java.util.*;
 import java.net.*;
 import java.io.*;

 public class MainForm extends JFrame implements ActionListener,Runnable,MouseListener{
	Login login=new Login();
	WaitingRoom wr=new WaitingRoom();
	GameRoom gr=new GameRoom();
	MakeRoom mr=new MakeRoom();
	CardLayout card=new CardLayout();
	// 서버연결과 관련된 라이브러리
	Socket s;// 서버연결
	OutputStream out; // 서버로 데이터 전송
	BufferedReader in; // 서버에서 응답한 데이터를 받음
	/*
	 *  1) 유저가 직접 보내는 데이터 => 이벤트 발생
	 *   														
	 *  2) 서버에서 들어오는 데이터  => Thread이용해서 출력 (Function)
	 */
	String myRoom,myId;
	MainForm() {
		
		setLayout(card);
		add("LOGIN", login);
		add("WR",wr);
		add("GAME", gr);

		setBounds(448,216,1024, 780);
		setVisible(true); //윈도우를 보여라
		
		setResizable(false);  // 화면고정
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		login.b1.addActionListener(this);
		wr.tf.addActionListener(this); // enter 값 보냄
		wr.b6.addActionListener(this); // b6 =나가기 버튼
		wr.b1.addActionListener(this); // b1 = 방만들기 버튼
		
		 mr.b1.addActionListener(this); // 실제 방만들기
		 mr.b2.addActionListener(this);
		 wr.table1.addMouseListener(this);
		 
		 gr.tf.addActionListener(this);
		 gr.b5.addActionListener(this);    ///b5= 방 나가기 버튼
		 gr.box.addActionListener(this);
	}
	public static void main(String[] args) {
	 	try
	 	{
	 		UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
	 		JFrame.setDefaultLookAndFeelDecorated(true);
	 	}
	 catch(Exception e) {}
	 new MainForm();
	
	 
} 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			String id=login.tf.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를입력하시오");
				login.tf.requestFocus();
				return;
		    }
			String pw=String.valueOf(login.pf.getPassword());
			if(pw.length()<1)
			{
				JOptionPane.showMessageDialog(this, "PW입력하시오");				
				login.pf.requestFocus();

				return;
		    }
			
			//처리
			MemberDAO dao=new MemberDAO();
			String result=dao.isLogin(id,pw);
			if(result.equals("NOID")) 
			{
				JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			
			}
			else if (result.equals("NOPW"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				login.pf.setText("");
				login.pf.requestFocus();
			
			}
			else 
			{
				
				connection(result);
				System.out.println(result);
			}
		}
		else if(e.getSource()==wr.tf) // 대기실채팅
		{
			//입력된 문자열 읽기
			String msg=wr.tf.getText();
			if(msg.length()<1)
			{
				wr.tf.requestFocus();
				return;
			}
			// 서버로 전송
			try
			{
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			wr.tf.setText("");
		}
		
		// 나가기
		else if(e.getSource()==wr.b6)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
				/*
				 * 	나가기 =>  요청
				 * 						===
				 * 						처리 => 서버
				 * 						결과출력 => 클라이언트
				 * 				 */
			}catch(Exception ex) {}
		}
		else  if (e.getSource()==wr.b1) // 방만들기 버튼 클릭
		{
			
			// 초기화 코드
			mr.tf.setText("");
			mr.rb1.setSelected(true);
			mr.box.setSelectedIndex(0);
			mr.la4.setVisible(false);
			mr.pf.setVisible(false);
			mr.pf.setText("");
			mr.tf.requestFocus();
			 mr.setVisible(true);
		}
		else  if(e.getSource()==mr.b1)
		{
			// 1. 방이름
			String rn=mr.tf.getText();
			if(rn.length()<1)
			{
				JOptionPane.showMessageDialog(this, "방이름을 입력하세요");
				mr.tf.requestFocus();
				return;  // 종료
			}
			for(int i=0; i<wr.model1.getRowCount();i++)
			{
				String roomName=wr.model1.getValueAt(i, 0).toString();
				if(rn.equals(roomName))
				{
					JOptionPane.showMessageDialog(this, "이미 존재하는 방입니다 \n 다시 입력하세요");
					mr.tf.setText("");
					mr.tf.requestFocus();
					return;   // 종료
				}
			
		}

		String rs="";
		String rp="";
		if(mr.rb1.isSelected())
		{
			rs="공개";
			rp=" ";  // 문자하나 띄는 칸이 필요해 ( stringTokenizer로 못자름)
		}
		else
		{
			rs="비공개";
			rp=String.valueOf(mr.pf.getPassword());
		}
		// 인원
		int inwon=mr.box.getSelectedIndex()+2;
		// 서버로 전송
		try
		{
		out.write((Function.MAKEROOM+"|"+rn+"|"+rs+"|"+rp+"|"+inwon+"\n").getBytes());		
		}catch (Exception ex) {}
		mr.setVisible(false);
		}
		else if(e.getSource()==mr.b2)
		 {
			 mr.setVisible(false);
		 }////
		else if(e.getSource()==gr.tf)
		{
			String msg=gr.tf.getText();
			if(msg.length()<1)
				return;
			try
			{ // 서버로 값보냄												방이름
				out.write((Function.ROOMCHAT+"|"+myRoom+"|"+msg+"\n").getBytes());
			}catch(Exception ex){}
			gr.tf.setText("");
		}
		else if(e.getSource()==gr.b5) // 겜방 나가기.
		{
			try
			{
				out.write((Function.ROOMOUT+"|"+myRoom+"\n").getBytes());
			}catch(Exception ex) {}
		}
		else if(e.getSource()==gr.b2)
		{
			String youId=gr.box.getSelectedItem().toString();
			try
			{
				out.write((Function.KANG+"|"+myRoom+"|"+youId+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}// actionperformed end 
	public void connection(String userData)
	{
		try
		{
			s=new Socket("localhost",8888);
			//송수신 확인
			// 송신
			out = s.getOutputStream();
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			//로그인 데이터 보내기
			// 100 | hong | 홍길동 |남자 | 대기실 ( 방위치 ) \n
			out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
		}catch(Exception ex) {}
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{ 
			while(true)
			{
				String msg=in.readLine();
			System.out.println(msg);
			StringTokenizer st=new StringTokenizer(msg,"|");
			int protocol=Integer.parseInt(st.nextToken());
			switch(protocol)
			{
				case Function.LOGIN:
				{
					String [] data= {
							st.nextToken(),   // id
							st.nextToken(),  // name
							st.nextToken(),  //sex
							st.nextToken()  //loc
						};
					wr.model2.addRow(data);
					break;
				}
				case Function.MYLOG:
				{
					String id=st.nextToken();
					setTitle(id);
					card.show(getContentPane(), "WR");
					break;
				}
				case Function.WAITCHAT:
				{
					wr.ta.append(st.nextToken()+"\n");
					break;
				}
				case Function.EXIT: //남아있는 사람
				{
					String id=st.nextToken(); // 나간사람 id를 찾아서 i 번째 0칸과 일치하면 그 줄 지워줘
					for(int i=0; i<wr.model2.getRowCount(); i++)
					{
						String mid=wr.model2.getValueAt(i, 0).toString();
								//String mid=(String)wr.model2.getValueAt(i, 0)
						if(mid.equals(id))
						{
							wr.model2.removeRow(i);
						}
					}
					break;
				}
				case Function.MYEXIT: //실제 나가는 사람
				{
					dispose();
					System.exit(0);  // 프로그램 종료
				}
				case Function.MAKEROOM:
				{
					String[] data= {
							st.nextToken(), // 방이름
							st.nextToken(), // 상태
							st.nextToken() // 1/6
					};
					wr.model1.addRow(data);
					break;
				} 
				case Function.ROOMIN:
				{
					/*
					 * messageTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avatar);
					 * break;
					 */
					myRoom=st.nextToken();
					String id=st.nextToken();
					String sex=st.nextToken();
					String avatar=st.nextToken();
					//String bang=st.nextToken();
					myId=id;					
					String temp="";
					if(sex.equals("남자"))
					{
						temp="m"+avatar;
					}
					else
					{
						temp="w"+avatar;  //m1.png로 되어있음
					}
					// 화면이동
					card.show(getContentPane(), "GAME");  // game으로 이동해라
					for(int i=0;i<6;i++)
					{
						if(gr.sw[i]==false)
						{
							gr.sw[i]=true;
							gr.pans[i].removeAll();  // 라벨을 지워야 새로운 라벨을 올릴 수 있다
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+".png"), 150, 120))));
							gr.pans[i].validate();  // 재배치 remove-validate
							gr.ids[i].setText(id);
							break;
						}
					}
					break;
				}
				case Function.ROOMADD:
				{
					String id=st.nextToken();
					String sex=st.nextToken();
					String avatar=st.nextToken();
					
					String temp="";
					if(sex.equals("남자"))
					{
						temp="m"+avatar;
					}
					else
					{
						temp="w"+avatar;  //m1.png로 되어있음
					}
					for(int i=0;i<6;i++)
					{
						if(gr.sw[i]==false)
						{
							gr.sw[i]=true;
							gr.pans[i].removeAll();  // 라벨을 지워야 새로운 라벨을 올릴 수 있다
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+".png"), 150, 120))));
							gr.pans[i].validate();  // 재배치 remove-validate
							gr.ids[i].setText(id);
							break;
						}
					}
					gr.box.addItem(id);
					break;
				}
				case Function.ROOMCHAT:
				{
					gr.ta.append(st.nextToken()+"\n");
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
									wr.model1.setValueAt(current+"/"+maxcount, i, 2);
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
							wr.model2.setValueAt(pos, i, 3);
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
							wr.model2.setValueAt(pos, i, 3);
						}
					}
					break;			
				}	  
				case Function.ROOMOUT:
				{/////
					String id=st.nextToken();
					for(int i=0;i<6;i++)
					{
						String mid=gr.ids[i].getText();
						if(id.equals(mid))  // 아이디가 같으면 제거해라
						{
							gr.sw[i]=false;
							gr.pans[i].removeAll();  
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
							gr.pans[i].validate();  
							gr.ids[i].setText("");
							break;
						}	
					}
					break;
				}
				case Function.MYROOMOUT:
				{
					// 초기화 ( 내가 빠져나가기 전에 )
					for(int i=0;i<6;i++)
					{
						gr.sw[i]=false;
						gr.pans[i].removeAll();  
						gr.pans[i].setLayout(new BorderLayout());
						gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
						gr.pans[i].validate();  
						gr.ids[i].setText("");
					}
					gr.ta.setText("");
					gr.tf.setText("");
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
			  }
			}
		}catch (Exception ex ) {}
	}
	/*
	 * 		swtich(no)
	 *   {
	 *     case1: 
	 *     	int num=3;
	 *     	break;
	 *     case2:
	 *     	int num=5;
	 *     	break;
	 *     case3:
	 *     	int num=7;
	 *     	break;
	 *    }
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==wr.table1)
		{
			if(e.getClickCount()==2) // 더블 클릭 => 방이름 검색해서 들어가라
			{
				//방이름
				int row=wr.table1.getSelectedRow();  // 몇째 줄 선택?
				String rn=wr.model1.getValueAt(row, 0).toString();
				String inwon=wr.model1.getValueAt(row, 2).toString();  // 몇 명?
				// String state=wr.model1.getValueAt(row, 1).toString();
				StringTokenizer st=new StringTokenizer(inwon,"/");
				int no1=Integer.parseInt(st.nextToken());  // 1
				int no2=Integer.parseInt(st.nextToken());  //   /2
				if(no1==no2)
				{
					// 방에 들어갈 수 없음
					JOptionPane.showMessageDialog(this, 
							"이미 방이 다 찼습니다\n 다른 방을 선택하세요");
					
				}
				else
				{
					// 비밀번호 입력
					try
					{
						out.write((Function.ROOMIN+"|"+rn+"\n").getBytes());
					}catch(Exception ex) {}
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
