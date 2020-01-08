package com.kim.thread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// client ���� ���� 
		
		Socket socket = new Socket();
		Scanner sc = new Scanner(System.in);
		
		InputStream is = null;
		InputStreamReader  isr = null;
		BufferedReader br = null;
		
		OutputStream os =null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		// new InetSocketAddress (InetAddress.getLocalHost() 8888
		
		try {
			socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8888));
			System.out.println("[client] connected with server");
			
			while(true) {
				is = socket.getInputStream();
				isr = new InputStreamReader(is, "UTF-8");
				br = new BufferedReader(isr);
				
				os= socket.getOutputStream();
				osw = new OutputStreamWriter(os, "UTF-8");
				pw= new PrintWriter(osw,true);
				
				//�д°�
				System.out.print(">>");
				String data = sc.nextLine();
				
				if("exit".equals(data))
					break;
				
				pw.println(data);
				
				data= br.readLine();
				System.out.println("<<" + data);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		}

	}

}
