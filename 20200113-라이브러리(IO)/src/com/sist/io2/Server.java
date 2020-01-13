package com.sist.io2;
import java.util.*;
import java.io.*;
import java.net.*;
/*
  			클래스의 종류 
  			= 일반 클래스
  			= 추상 클래스 (인터페이스)
  			= 내부 클래스
  				1) 클래스끼리 데이터 공유 => static
  				class A
  				{
  					class B
  					{
  					}
  				}
  				Server가 가지고 있는 모든 변수 공
  				2) 상속 없이 overriding => 익명의 클래스
  				*/
 
public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=8888;
	private Vector<Client> waitVc=new Vector<Client>();   // 접속한 유저의 정보 저장 ( ip,port ) 
	//서버 가동 => Server => 메모리 할당 1번만
	public Server() {
		try
		{
			ss=new ServerSocket(PORT);  // default 50명 접속가능 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	
	
	@Override
	public void run() {
		// 저장
		//접속시 처리
		while(true)
		{
			try
			{	// 유저의 접속정보(ip,port)를 서버에 넘김 -> Thread 
				Socket s=ss.accept();  	
				System.out.println("Client 접속 완료==> "
								+s.getInetAddress().getHostAddress());
				// 접속할 때마다 생김
				Client client = new Client(s);
				client.start(); 
				// LOGIN이 됐으면 = 100 
				waitVc.add(client); // id저장
			}catch (Exception ex) {}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Server server=new Server();
			new Thread(server).start();
	}
	// 내부클래스 = inner 클래스 => Thread, 윈도우 => 빅데이터
	// Server 가 가지고 있는 모든 데이터를 사용할 수 있다 
	class Client extends Thread {
		//통신
		Socket s;
		OutputStream out;
		BufferedReader in;

		public Client(Socket s)
		{
			try
			{
			this.s=s;
			out=s.getOutputStream(); // 클라에게 전송
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));  //1byte를 2byte로 변환해주는 클래스
			} catch( Exception ee) {}
		}
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>> 
		// 통신
		public void run()
		{
			while(true)
			{
				try
				{
					// Client전송 메세지 읽기
					String msg=in.readLine();
					System.out.println("Client==> "+msg);
					// 전체 클라이언트의 값 전송
					for( Client c:waitVc)
					{
						c.out.write((msg+"\n").getBytes());  // 1byte로 바꿔줌
					}
				}catch (Exception ee) {}
			}
		}
	}
	


}
