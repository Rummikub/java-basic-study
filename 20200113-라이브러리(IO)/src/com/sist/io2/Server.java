package com.sist.io2;
import java.util.*;
import java.io.*;
import java.net.*;
/*
  			Ŭ������ ���� 
  			= �Ϲ� Ŭ����
  			= �߻� Ŭ���� (�������̽�)
  			= ���� Ŭ����
  				1) Ŭ�������� ������ ���� => static
  				class A
  				{
  					class B
  					{
  					}
  				}
  				Server�� ������ �ִ� ��� ���� ��
  				2) ��� ���� overriding => �͸��� Ŭ����
  				*/
 
public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=8888;
	private Vector<Client> waitVc=new Vector<Client>();   // ������ ������ ���� ���� ( ip,port ) 
	//���� ���� => Server => �޸� �Ҵ� 1����
	public Server() {
		try
		{
			ss=new ServerSocket(PORT);  // default 50�� ���Ӱ��� 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	
	
	@Override
	public void run() {
		// ����
		//���ӽ� ó��
		while(true)
		{
			try
			{	// ������ ��������(ip,port)�� ������ �ѱ� -> Thread 
				Socket s=ss.accept();  	
				System.out.println("Client ���� �Ϸ�==> "
								+s.getInetAddress().getHostAddress());
				// ������ ������ ����
				Client client = new Client(s);
				client.start(); 
				// LOGIN�� ������ = 100 
				waitVc.add(client); // id����
			}catch (Exception ex) {}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Server server=new Server();
			new Thread(server).start();
	}
	// ����Ŭ���� = inner Ŭ���� => Thread, ������ => ������
	// Server �� ������ �ִ� ��� �����͸� ����� �� �ִ� 
	class Client extends Thread {
		//���
		Socket s;
		OutputStream out;
		BufferedReader in;

		public Client(Socket s)
		{
			try
			{
			this.s=s;
			out=s.getOutputStream(); // Ŭ�󿡰� ����
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));  //1byte�� 2byte�� ��ȯ���ִ� Ŭ����
			} catch( Exception ee) {}
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>> 
		// ���
		public void run()
		{
			while(true)
			{
				try
				{
					// Client���� �޼��� �б�
					String msg=in.readLine();
					System.out.println("Client==> "+msg);
					// ��ü Ŭ���̾�Ʈ�� �� ����
					for( Client c:waitVc)
					{
						c.out.write((msg+"\n").getBytes());  // 1byte�� �ٲ���
					}
				}catch (Exception ee) {}
			}
		}
	}
	


}
