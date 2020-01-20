package com.sist.client;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * 		JFrame
 * 		JPanel   =   탭/버튼  기능을 출력해주는 창 정도- 여러개.
 * 		JWindow   = 크기 줄여주는 창, 그냥 메인  - 1개
 * 		JDialog  = 작은 팝업창 - 다른창이 작업이 안됨 - 모달 / 작업이 됨 - 모달리스; 두가지 종류
 */
import java.awt.*;								 // 윈도우와 관련된 클래스 호출
public class Login extends JPanel{   // for 제어문 같은거 못쓴대 메소드 안에서 제어하래
	Image back;	 										// 초기화 블록 = 자동으로 인식하는 블록  ( 클래스는 선언만 하지 구현 못하는데 이거 있어야 구현 가능 )
	// Login login = new Login()    = 리턴형이 없음 
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	Login(){
			setLayout(null);
			back=Toolkit.getDefaultToolkit().getImage("c:\\image\\background.jpg ");   // 이미지를 가져오려면 이렇게 코딩
			la1=new JLabel("ID",JLabel.RIGHT);
			la1.setForeground(Color.white);										 // 글자 색
			la2= new JLabel("Password", JLabel.RIGHT);
			la2.setForeground(Color.white);
			
			tf=new JTextField();
			pf=new JPasswordField();
			
			b1=new JButton("로그인");
			b2=new JButton("취소");
			
			// 배치
			la1.setBounds(390,330,80,30);              //   			변수명. setBounds(x, y, width, height);
			tf.setBounds(475, 330, 150, 30);
			
			la2.setBounds(390,365,80,30);
			pf.setBounds(475, 365, 150, 30);
													// ===         ====     +5 = 400이 버튼 만드는 곳
			JPanel p=new JPanel();
			p.add(b1);
			p.add(b2);
			p.setBounds(390, 405, 230, 35);
			p.setOpaque(false);
			add(la1);
			add(tf);
			add(la2);
			add(pf);
			add(p);
	}

	@Override
	protected void paintComponent(Graphics g) {  //그림 그리는 메소드 => 게임할때는  paint 써야 되고 / 스킨 입힐때는 paintComponent
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);  // 그림을 꽉 채워라 명령  this = 패널 자신
	}

}
