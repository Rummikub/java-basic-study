package com.sist.io2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.Socket;
public class Client extends JFrame implements ActionListener,Runnable{
	JTextArea ta;
	JTextField tf;
	JButton b;
	
	//서버와 연결
	Socket s; // 서버 정보 갖고 있음
	OutputStream out; // 서버로 데이터 전송위치
	BufferedReader in; // 서버로부터 데이터 읽어 오는 위치
	public Client()
	{
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		ta.setEditable(false);
		
		tf=new JTextField(20);
		b=new JButton("접속"); 
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		
		tf.setEnabled(false);
		add("Center",js);
		add("South", p);
		
		setSize(450, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b.addActionListener(this); // 버튼 눌렀을 때 접속되게 하는 메소드   _ 서버로 부터 들어오는 값을 계속 감시 =thread
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if( e.getSource()==b)
		{
			try
			{
				// 연결
				s=new Socket("211.238.142.199",8888);
				out=s.getOutputStream(); // 클라에게 전송
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));  
				// 서버로부터 값을 받아옴
				b.setEnabled(false);
				tf.setEnabled(true);
				tf.requestFocus();
				
				new Thread(this).start();
			}catch (Exception ee) {}
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText();
			if(msg.length()<1)
				return;
			try
			{
				out.write((msg+"\n").getBytes());
				tf.setText("");
			}catch(Exception ex) {}
		}
	} //  서버에서 들어오는 값을 받아서 출력하는 메소드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				String msg=in.readLine();
				ta.append(msg+"\n");
			}catch(Exception ex) {}
		}
	}

}
