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
	
	//������ ����
	Socket s; // ���� ���� ���� ����
	OutputStream out; // ������ ������ ������ġ
	BufferedReader in; // �����κ��� ������ �о� ���� ��ġ
	public Client()
	{
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		ta.setEditable(false);
		
		tf=new JTextField(20);
		b=new JButton("����"); 
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		
		tf.setEnabled(false);
		add("Center",js);
		add("South", p);
		
		setSize(450, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b.addActionListener(this); // ��ư ������ �� ���ӵǰ� �ϴ� �޼ҵ�   _ ������ ���� ������ ���� ��� ���� =thread
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
				// ����
				s=new Socket("211.238.142.199",8888);
				out=s.getOutputStream(); // Ŭ�󿡰� ����
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));  
				// �����κ��� ���� �޾ƿ�
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
	} //  �������� ������ ���� �޾Ƽ� ����ϴ� �޼ҵ�
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
