package com.sist.client;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * 		JFrame
 * 		JPanel   =   ��/��ư  ����� ������ִ� â ����- ������.
 * 		JWindow   = ũ�� �ٿ��ִ� â, �׳� ����  - 1��
 * 		JDialog  = ���� �˾�â - �ٸ�â�� �۾��� �ȵ� - ��� / �۾��� �� - ��޸���; �ΰ��� ����
 */
import java.awt.*;								 // ������� ���õ� Ŭ���� ȣ��
public class Login extends JPanel{   // for ��� ������ ������ �޼ҵ� �ȿ��� �����Ϸ�
	Image back;	 										// �ʱ�ȭ ��� = �ڵ����� �ν��ϴ� ���  ( Ŭ������ ���� ���� ���� ���ϴµ� �̰� �־�� ���� ���� )
	// Login login = new Login()    = �������� ���� 
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	Login(){
			setLayout(null);
			back=Toolkit.getDefaultToolkit().getImage("c:\\image\\background.jpg ");   // �̹����� ���������� �̷��� �ڵ�
			la1=new JLabel("ID",JLabel.RIGHT);
			la1.setForeground(Color.white);										 // ���� ��
			la2= new JLabel("Password", JLabel.RIGHT);
			la2.setForeground(Color.white);
			
			tf=new JTextField();
			pf=new JPasswordField();
			
			b1=new JButton("�α���");
			b2=new JButton("���");
			
			// ��ġ
			la1.setBounds(390,330,80,30);              //   			������. setBounds(x, y, width, height);
			tf.setBounds(475, 330, 150, 30);
			
			la2.setBounds(390,365,80,30);
			pf.setBounds(475, 365, 150, 30);
													// ===         ====     +5 = 400�� ��ư ����� ��
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
	protected void paintComponent(Graphics g) {  //�׸� �׸��� �޼ҵ� => �����Ҷ���  paint ��� �ǰ� / ��Ų �������� paintComponent
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);  // �׸��� �� ä���� ���  this = �г� �ڽ�
	}

}
