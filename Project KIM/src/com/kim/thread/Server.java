package com.kim.thread;
// Server�ڵ� 
import java.io.BufferedReader;    // Buffer �� ���� char ������ �а� �� �� �ְ� ���ִ� ���� ��Ʈ��
import java.io.IOException;
import java.io.InputStream;  // = byte ������ ���� 
import java.io.InputStreamReader; // => char  ������ �а� �� �ְ� ���ִ� ���� ��Ʈ�� ��  OutputStreamWriter
/*
*  PrintWriter = text�� ��ǥ�Ǵ� ��ü���� ����ϰ� ���ִ� ���� ��Ʈ��
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
			//1. ���� ����
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
				// inputstream �����ͼ� �� ��Ʈ�������� ���۷� ������ 
				is = socket.getInputStream();
				isr = new InputStreamReader(is, "UTF-8");
				br = new BufferedReader(isr);
				
				// outputstream �����ͼ� �� ��Ʈ�� ������ ���۷� ���Ѵ�
				os=socket.getOutputStream();
				osw= new OutputStreamWriter(os, "UTF-8");
				pw= new PrintWriter(osw,true);
				
				String buffer= null;
				buffer = br. readLine(); // Blocking
				if(buffer == null) {
					
					// �������� : remote socket close()
					// �޼ҵ带 ���� ���������� ������ ���� ���
					System.out.println("[server] closed by client");
					break;
				}
				System.out.println("[server] recieved : "+ buffer);
				pw.println(buffer);
			}
			
			// 3. Ŭ���̾�Ʈ�� �����û ��ٸ�
			// ... blocking �Ǹ� ��ٸ���, connect ������ blockǮ��
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