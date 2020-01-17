package davinci.server;
import davinci.common.DavinciFunction;
import java.io.*;
import java.net.*;
import java.util.*;



public class DavinciServer implements Runnable {

	private ServerSocket ss;
	private final int PORT=8888;

	public DavinciServer()
	{
		try
		{
			ss=new ServerSocket(PORT);
			System.out.println("Server start....");
		}catch(Exception ex) {}
	}
	// 접속시 처리
	public void run()
	{
		try
		{
			while(true)
			{
				//접속을 했다면 => 클라이언트의 정보 수집 => IP,PORT(Socket)
				Socket s=ss.accept();
				//s ( 클라의 정보 ip, port) => Thread 로 전송 ( 각자통신 가능)
				Client client=new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DavinciServer server=new DavinciServer();
		new Thread(server).start();
	}
	// 내부 클래스 통신 담당 부분 ( 각 클라이언트마다 따로 작업 )
	class Client extends Thread 
	{
		String id,name,sex,pos;
		//pos=> 방위치
		int avatar;
		//통신
		Socket s; // 통신장비
		// 보내기
		OutputStream out;
		// 받기
		BufferedReader in;
	
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();  // 클라의 저장위치 => 읽어갈 수 있게 만듦
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//Inputstreamreader 필터스트림 => byte 를 2byte로 변환해서 읽어옴
			}catch (Exception ex) {}
		}
	//=====================================여기다 코딩============================//
		public void run()
		{
			 // 100| id | 이름 |성별
			try
			{
				while(true)
				{
					String msg=in.readLine(); // 클라의 전송값
					System.out.println("Client=>"+msg);
					StringTokenizer st=
										new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
							case DavinciFunction.GAMESTART:
							{
								break;
							}
							case DavinciFunction.MYPICKDUMMY:
							{
					
								break;
							}
					
							case DavinciFunction.PICKDUMMY:
							{
								String rn=st.nextToken();
								String yid=st.nextToken();
						      }
					}
				}
			}catch (Exception ex) {}
		}
	}
}