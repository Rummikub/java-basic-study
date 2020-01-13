package 채팅서버구현.server;
import java.net.*;
import java.io.*;
public class Server {
	 
		  static  int PORT=8888; 
		  public static void main(String args[])
		  {
		   ServerSocket ss;  
		   System.out.println("Trying to bind to 8888..");
		   try{
		   ss = new ServerSocket(PORT);
		   while(true){
		    System.out.println("Wating for Client request..");
		    Socket c= ss.accept();
		    System.out.println("Accepted : "+c);
		   //Client thread 
		    new ThreadServer(c).start();
		   }
		   }
		   catch(IOException ie){}
		  }
		 }
		 class ThreadServer extends Thread
		 {
		  Socket c = null;
		  public ThreadServer(Socket c)
		  {
		   //saved connected socket into instance
		   this.c = c;
		  }
		  //Thread  
		  public void run()
		  {
		   try{
		   BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
		   PrintWriter out = new PrintWriter(new OutputStreamWriter(c.getOutputStream()),true);
		   String line,toserver;
		  
		   //client글을 끝까지 읽어옴 
		   while((line=in.readLine()) != null){ 
		    if(line.equals("end"))
		     out.println("disconnection");
		    else
		    {
		     out.println(">>>"+ line.toUpperCase());
		     System.out.println("Client said\"" + line+ "\n");
		    }
		   }  
		   in.close();
		   out.close();
		  }
		  catch(IOException ie){}
		  }
		}