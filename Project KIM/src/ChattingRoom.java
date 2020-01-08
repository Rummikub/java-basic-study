import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ChattingRoom extends JPanel implements ActionListener {
	
			JTextPane chatHistory;
			JTextField chatInput;
	
			JTextArea ta = new JTextArea();
			JTextField tf = new JTextField();
			
			

		public ChattingRoom() {
		
			chatHistory=new JTextPane();
			chatInput= new JTextField();
		
			
			JScrollPane chatRm=new JScrollPane(ta);
		
			chatRm.setBounds(705, 10, 300, 680);
			chatInput.setBounds(705, 695, 300, 30);
			setVisible(true);
			
			tf.setEditable(true);
			ta.setEditable(false);
			add(chatRm);
			add(chatInput);
			
			tf.addActionListener(this);   // 엔터치면 바로 이벤트 발생
			
	}
		public static void main(String[] args) {
			// 생성자
			new ChattingRoom();

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			  // 엔터치면 텍스트필드에 입력될 값을 호출하라
			if(e.getSource()==tf)
			{ 
				ta.append(tf.getText()+"\n");   
			}
			
			String input= tf.getText();
			input=input.trim();
			if(input.length()<1)
			{
				JOptionPane.showMessageDialog(this, "글자를 입력하세요");
				 tf.requestFocus();
				 return;
			}
			tf.setText("");
			tf.requestFocus();
		}
		

	}


