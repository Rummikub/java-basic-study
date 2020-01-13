package 채팅서버구현.client;
import java.io.*;
import java.net.*;
	public class Client {
	
		 final static int PORT = 8888;
		 //연결할 서버 지정
		 final static String HOST = "localhost";
		public Client()  
		 {
		  Socket socket = null;
		  try{
		   socket = new Socket(HOST,PORT);
		   sayGoodbye(socket);
		  }
		  catch(UnknownHostException uhe)
		  {
		  // 호스트가 발견되지 않을 시 예외처리 
		   System.err.println("Unknown host:" + uhe.getMessage());
		  }
		  catch(IOException ie)
		  {
		   System.err.println("IOException" + ie.getMessage());
		  }
		  finally
		  {
		   try{
		    socket.close();
		   }
		   catch(IOException e){}
		  }
		 }
		 
		public static void main(String[] args)
		 {
		  new Client();
		 }
		 
		 private void sayGoodbye(Socket socket) throws IOException
		 {
		  String line,toserver;
		  BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		  PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
		  BufferedReader instr = new BufferedReader(new InputStreamReader(System.in));
		  //키보드로 부터 문자를 라인단위로 입력받기   
		  while((toserver=instr.readLine()) != null)
		  {
		   //Send to server
		   out.println(toserver);
		   line=in.readLine();
		  
		   if(line.equals("disconnection"))
		   {
		    System.out.println("서버와 연결이 끊어졌습니다.");
		    break;
		   }
		   else
		    System.out.println(line);
		  }
		  in.close();
		  out.close();
		 }
		}
