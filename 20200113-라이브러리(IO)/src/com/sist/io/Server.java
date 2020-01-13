package com.sist.io;
// ��Ʈ��ũ �����
import java.io.*;
import java.net.*;
/*
 *   ���� : 
 *   			��⼭��		= 1��  ==> ������ ( Socket ) 
 *   												ServerSocket
 *   			��ż���		= ������ ����ŭ ( ������ )
 *   												Socket  => ���� ��� 
 *   
 *   ������ �������� ��� ���α׷��� �ʿ�� �Ѵ�
 *   				========= ������
 */
public class Server implements Runnable {
	private ServerSocket ss;
	public Server()
	{
			try
			{
				ss= new ServerSocket(8888);
				/*
				 *  bind = 1. IP 2.Port
				 *  ������ ������Ʈ, Ŭ���̾�Ʈ�� �ӽ���Ʈ 
				 *  listen = ������
				 */
				System.out.println("Server Start....");
			}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
		//server�� run���Լ� ȣ��
	}
	// Thread 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
				try
				{
					Socket s = ss.accept(); // Ŭ���� ���� (socket)
					System.out.println("�������� ip  "+s.getInetAddress().getHostAddress());
					System.out.println("�ӽ���Ʈ : "+s.getPort());
				}catch (Exception ex) {}
		}
	}

}
