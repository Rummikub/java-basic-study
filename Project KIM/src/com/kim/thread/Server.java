package com.kim.thread;
// Server코드 
import java.io.BufferedReader;    // Buffer 를 통해 char 단위로 읽고 쓸 수 있게 해주는 보조 스트림
import java.io.IOException;
import java.io.InputStream;  // = byte 단위로 들어옴 
import java.io.InputStreamReader; // => char  단위로 읽고쓸 수 있게 해주는 보조 스트림 ↔  OutputStreamWriter
/*
*  PrintWriter = text로 대표되는 객체들을 출력하게 해주는 보조 스트림
*/
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public static final int Port = 8888;
	
	public static void main(String[] args) {
		ServerSocket server= null;
		
		InputStream is = null;
		InputStreamReader isr= null;
		OutputStream os =null;
		OutputStreamWriter osw= null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			//1. 서버 생성
			server= new ServerSocket();
			//2.binding
			InetAddress ia= InetAddress.getLocalHost();
			String localhost = ia.getHostAddress();
			
			server.bind(new InetSocketAddress("211.238.142.200", 8888));
			
			System.out.println("[server] binding "+ localhost);
			
			
			//3. accept
			Socket socket = server.accept();
			InetSocketAdress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			
			System.out.println("[server] Client Accepted by client...");
			System.out.println("[server] Connect with "+ socketAddress.getHostString()+ " "+ socket.getPort());
					
			while(true) {
				// inputstream 가져와서 주 스트림리더랑 버퍼로 감싸줌 
				is = socket.getInputStream();
				isr = new InputStreamReader(is, "UTF-8");
				br = new BufferedReader(isr);
				
				// outputstream 가져와서 주 스트림 리더랑 버퍼로 감싼다
				os=socket.getOutputStream();
				osw= new OutputStreamWriter(os, "UTF-8");
				pw= new PrintWriter(osw,true);
				
				String buffer= null;
				buffer = br. readLine(); // Blocking
				if(buffer == null) {
					
					// 정상종료 : remote socket close()
					// 메소드를 통해 정상적으로 소켓을 닫은 경우
					System.out.println("[server] closed by client");
					break;
				}
				System.out.println("[server] recieved : "+ buffer);
				pw.println(buffer);
			}
			
			// 3. 클라이언트의 연결요청 기다림
			// ... blocking 되며 기다린다, connect 들어오면 block풀림
		} catch (IOException e) {
				e.printStackTrace();
		} finally {
			try {
				if (server ! = null && ! server.isClosed())
					server.close();
				} catch (Exception e) {
					e.printStackTrace();	
			}
			sc.close();
		}
	}
}