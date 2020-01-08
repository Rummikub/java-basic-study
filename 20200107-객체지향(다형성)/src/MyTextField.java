import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/* 		interface ==> implements 인터페이스명
 		=======
 			다중상속이 가능
 			
 			interface A 
 			interface B 
 			class C implements A,B,.... 				==>  다중구현이 가능 
 */
public class MyTextField extends JFrame implements ActionListener {
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	public MyTextField() {
		
		ta.setEditable(false);   // 편집 불가능하게 채팅창 고정
		JScrollPane js = new JScrollPane (ta);  // Scrollbar ( 가로 혹은 세로 스크롤 바 1개 ) 둘다 가져오려면 Scrollpane
		add("Center",js);
		add("South", tf);
		setSize(350,450);
		setVisible(true);
		
		// 이벤트 등록
		tf.addActionListener(this);   // mytextfield가 갖고있는 actionperfomed(메소드)를 호출하는 명령   & 엔터치면 이벤트 발생
		setDefaultCloseOperation(EXIT_ON_CLOSE);  // 공간 할당 줄이고 속도 늘리기 위해 꼭 필요
	}
	public static void main(String[] args) {
		// 생성자
		new MyTextField();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)  // 엔터치면 텍스트필드가 뭐냐?
		{ 
			ta.append(tf.getText()+"\n");     // getText- 입력한 값을 가져와라  
			// append   , setText  ( in textarea의 두가지 메소드)      
			//  (문자결합)	====== 기존에 있던 텍스트를 지우고 새로운 문자열을 제어
			// tf.getText() =>  입력된 문자를 읽어온다
		}
	}

}
