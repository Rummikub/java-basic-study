package 채팅서버구현.server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
	public class ChatServer {
		 private final static int SERVER_PORT = 8888;
		 public static void main(String[] args) {
		  try{
		   ServerSocket ss = new ServerSocket(SERVER_PORT);
		   HashMap hm = new HashMap();
		   System.out.println("waiting connection..");
		   while(true){
		    Socket s = ss.accept();
		    ChatThread chatthread = new ChatThread(s, hm);
		    chatthread.start();
		   }
		  }
		  catch(Exception e){
		   System.out.println(e);
		  }
		 }
		}
	class ChatThread extends Thread{
		private final Socket s ; 
		private final HashMap hm ; 
		private String id;   
		private BufferedReader br;
		private boolean initFlag = false;
		public ChatThread(Socket s, HashMap hm){
		  this.s = s;
		  this.hm = hm;
		  
		  try{
		   PrintWriter pw = new PrintWriter( new OutputStreamWriter(s.getOutputStream()) );
		   br = new BufferedReader( new InputStreamReader(s.getInputStream()) );
		   id = br.readLine();
		   broadcast(id + " is connected");
		   System.out.println("connected user id is "+id);
		   synchronized(hm){
		    hm.put(this.id, pw);
		   }
		   initFlag = true;
		   
		  }
		  catch(Exception ex){ System.out.println(ex); }
		 }
		
	public void run(){
		  try{
		   String line = null;
		   while( (line=br.readLine() )!= null ) {
		    if(line.equals("/quit"))break;
		    
		    if(line.indexOf("/to")==0)sendmsg(line);
		    else broadcast(id+":"+line);
		   }
		  }
		  catch(Exception ex){}
		  finally{
		   synchronized(hm){
		    hm.remove(id);
		   }
		   broadcast(id+" is terminated");
		   try { if(s != null)s.close();}
		   catch(Exception ex){}
		  }
		 }
	public void sendmsg(String msg){
		  int start = msg.indexOf(" ")+1;
		  int end = msg.indexOf(" ",start);
		  
		  if(end != -1){
		   String to = msg.substring(start,end);
		   String msg2 = msg.substring(end+1);
		   Object obj = hm.get(to);
		   if(obj != null){
		    PrintWriter pw = (PrintWriter)obj;
		    pw.println(id+" tells : " + msg2);
		    pw.flush();
		   }
		  }
		 }
	public void broadcast(String msg){
		  synchronized(hm){
		   Collection collection = hm.values();
		   Iterator iter = collection.iterator();
		   while(iter.hasNext()){
		    PrintWriter pw = (PrintWriter)iter.next();
		    pw.println(msg);
		    pw.flush();
		   }
		  }
		 }
		}
