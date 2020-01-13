package com.sist.io;
// 네트워크 입출력
import java.io.*;
import java.net.*;
/*
 *   서버 : 
 *   			대기서버		= 1개  ==> 연결기기 ( Socket ) 
 *   												ServerSocket
 *   			통신서버		= 접속자 수만큼 ( 쓰레드 )
 *   												Socket  => 실제 통신 
 *   
 *   서버는 여러개의 통신 프로그램을 필요로 한다
 *   				========= 동일한
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
				 *  서버는 고정포트, 클라이언트는 임시포트 
				 *  listen = 대기상태
				 */
				System.out.println("Server Start....");
			}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
		//server의 run하함수 호출
	}
	// Thread 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
				try
				{
					Socket s = ss.accept(); // 클라의 정보 (socket)
					System.out.println("접속자의 ip  "+s.getInetAddress().getHostAddress());
					System.out.println("임시포트 : "+s.getPort());
				}catch (Exception ex) {}
		}
	}

}
