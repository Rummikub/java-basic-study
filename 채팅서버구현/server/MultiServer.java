package 채팅서버구현.server;
import java.awt.*;
import java.io.*;   
import java.net.*;  
import java.util.*;  
import javax.swing.*;
public class MultiServer extends JFrame {
 
  private ArrayList<MultiServerThread> list;
  private Socket socket;
  JTextArea ta;
  JTextField tf;
  
  public MultiServer() {
	  // GUI
    setTitle("채팅 서버 ver 1.0"); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ta = new JTextArea();        
    add(new JScrollPane(ta));
    tf = new JTextField();
    tf.setEditable(false);
    add(tf, BorderLayout.SOUTH);
    setSize(300, 300);
    setVisible(true);
   
    // Thread객체 생성자 
    list = new ArrayList<MultiServerThread>();
    try {
      ServerSocket serverSocket = new ServerSocket(8888);
      MultiServerThread mst = null;//한 사용자 담당할 채팅 객체  
       
      boolean isStop = false;  
      // false 값을가진 isStop객체 
      tf.setText("서버 정상 실행중입니다\n");
   
      while(! isStop) {

         socket = serverSocket.accept();
        
         mst = new MultiServerThread();  //Thread 객체생성 
	     list.add(mst); // Thread의값을 계속 넣어줌 
	     	
         mst.start();
         // = new MultiServerThread().start();
         // start() ~ run()
    
      }
     
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
 
 
 
  public static void main(String[] args) {
    // 호출 
	  new MultiServer();

  }
 
 
 
  // Thread 구축 
 
  class MultiServerThread extends Thread {
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    
    @Override
    public void run() {
    	
     boolean isStop = false; 
  
     try {
    
     ois = new ObjectInputStream(socket.getInputStream());
       // 확장스트림 - 클라가 보낸 메세지를 받아옴 
     oos = new ObjectOutputStream(socket.getOutputStream());
       // 서버가 보낸 메세지 받아옴 
        String message = null; 
   
        while(! isStop) {
        	// 무한루프 
         
          message = (String) ois.readObject();//클라이언트 입력 받음  
   
          String[] str = message.split("#");//ID # 1차원 배열에 반환  
          
          if(str[1].equals("exit")) {
            
           messageToAll(message);
          
           isStop = true;  //  종료
          } else {
            messageToAll(message);
          }
        }
        
        list.remove(this); // 방Out
       
        ta.append(socket.getInetAddress() +
            " IP 주소의 사용자께서 종료하셨습니다.\n");
       
        tf.setText("남은 사용자 수 : " + list.size());

      } catch (Exception e) {
 
        list.remove(this);
        ta.append(socket.getInetAddress() +
            " IP 주소의 사용자께서 비정상 종료하셨습니다.");
        tf.setText("남은 사용자 수 : " + list.size());
      }//catch
    }//run
   
   
    public void messageToAll(String message) {// 방에있는 사람 모두에게 알리는 기능 
      for (MultiServerThread ct : list) {
      
     ct.send(message);

    
      }
   
    }
   
   
    public void send(String message) {  //  한 사용자에게 전송
      try {
        oos.writeObject(message);
      // 아직 남은 클라에게 전송 
      } catch (IOException e) {
        e.printStackTrace();
       
      }
    }
  }
}