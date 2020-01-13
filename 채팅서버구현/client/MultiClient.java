package 채팅서버구현.client;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MultiClient implements ActionListener, Runnable {
  private Socket socket;          
  private ObjectInputStream ois;  
  private ObjectOutputStream oos;  
  private JFrame jframe;          
  private JTextField jtf;          
  private JTextArea jta;          
  private JLabel jlb1, jlb2;        
  private JPanel jp1, jp2;      
  private String ip;             
  private String id;              
  private JButton jbtn;          
  
  public MultiClient(String argIp, String argId) {
    ip = argIp;  
    id = argId;  
    
    //GUI
    jframe = new JFrame("멀티 채팅");
    jp1 = new JPanel();
    jp1.setLayout(new BorderLayout());
    jtf = new JTextField(30);  
    jbtn = new JButton("종료");
    jp1.add(jbtn, BorderLayout.EAST);
    jp1.add(jtf, BorderLayout.CENTER);
  
    jp2 = new JPanel();
    jp2.setLayout(new BorderLayout());
    jlb1 = new JLabel("대화명 : [[" + id + "]]");
    jlb1.setBackground(Color.YELLOW);
    jlb2 = new JLabel("IP 주소 : " + ip);
    jlb2.setBackground(Color.GREEN);
    jp2.add(jlb1, BorderLayout.CENTER);
    jp2.add(jlb2, BorderLayout.EAST);

    jta = new JTextArea("", 10, 50);  
    jta.setBackground(Color.ORANGE);
    JScrollPane jsp = new JScrollPane(jta, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    jframe.add(jp1, BorderLayout.SOUTH);
    jframe.add(jp2, BorderLayout.NORTH);
    jframe.add(jsp, BorderLayout.CENTER);
    jp2.add(jlb2, BorderLayout.EAST);
    jtf.addActionListener(this);
    jbtn.addActionListener(this);

    jframe.addWindowListener(new WindowAdapter() {
  
      @Override
      public void windowClosing(WindowEvent e) {
        try {
          oos.writeObject(id + "#exit");
        } catch (Exception ee) {
          ee.printStackTrace();
        }
        System.exit(0); 
      }
      @Override
      public void windowOpened(WindowEvent e) {
        jtf.requestFocus();  
      }
    });
    jta.setEditable(false);
    jframe.pack();
    jframe.setResizable(false);
    jframe.setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {  
    Object obj = e.getSource();  
    String msg = jtf.getText(); 
    if(obj == jtf) { 
      if(msg == null || msg.length() == 0) {
        JOptionPane.showMessageDialog(jframe, "글을 쓰세요",
            "경고", JOptionPane.WARNING_MESSAGE);
      } else {  
        try {
          oos.writeObject(id + "#" + msg);
        } catch (Exception ee) {
          ee.printStackTrace();
        }
        jtf.setText(""); 
      }
    } else if(obj == jbtn) {  
      try {
        oos.writeObject(id + "#exit");
      } catch (Exception ee) {
        ee.printStackTrace();
      }
      System.exit(0);
    }
  }
  
  public void init() {
    try {
      socket = new Socket(ip, 5000);
      System.out.println("서버에 접속되었습니다");
      oos = new ObjectOutputStream(socket.getOutputStream());
      ois = new ObjectInputStream(socket.getInputStream());
      Thread t = new Thread(this);
      t.start();  //  쓰레드 시작
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
	 
     MultiClient cc = new MultiClient("locatlHost", "SIST200"); 
    cc.init();  
  }
  
  @Override
  public void run() {
    String message = null;
    String[] receiveMsg = null;
    boolean isStop = false;
    while(! isStop) {
      try {
        message = (String) ois.readObject();//채팅내용
        receiveMsg = message.split("#");
      } catch (Exception e) {
        e.printStackTrace();
        isStop = true;  
      }
      System.out.println(receiveMsg[0]+":"+receiveMsg[1]);
      
      if(receiveMsg[1].equals("exit")) {  
        if(receiveMsg[0].equals(id)) {  
          System.exit(0);
        } else {  //  그 외의 사용자
          jta.append(
              receiveMsg[0] + " 님이 종료했습니다\n");
        
          jta.setCaretPosition(
              jta.getDocument().getLength());
        }//else : 그 외 사용자
      } else {  
        jta.append(receiveMsg[0] + " : " +
            receiveMsg[1] + "\n");
        jta.setCaretPosition(
            jta.getDocument().getLength());
      }
    }
  }
}