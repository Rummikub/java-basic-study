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
			
			tf.addActionListener(this);   // ����ġ�� �ٷ� �̺�Ʈ �߻�
			
	}
		public static void main(String[] args) {
			// ������
			new ChattingRoom();

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			  // ����ġ�� �ؽ�Ʈ�ʵ忡 �Էµ� ���� ȣ���϶�
			if(e.getSource()==tf)
			{ 
				ta.append(tf.getText()+"\n");   
			}
			
			String input= tf.getText();
			input=input.trim();
			if(input.length()<1)
			{
				JOptionPane.showMessageDialog(this, "���ڸ� �Է��ϼ���");
				 tf.requestFocus();
				 return;
			}
			tf.setText("");
			tf.requestFocus();
		}
		

	}


