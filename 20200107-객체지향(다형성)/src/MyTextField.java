import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/* 		interface ==> implements �������̽���
 		=======
 			���߻���� ����
 			
 			interface A 
 			interface B 
 			class C implements A,B,.... 				==>  ���߱����� ���� 
 */
public class MyTextField extends JFrame implements ActionListener {
	JTextField tf = new JTextField();
	JTextArea ta = new JTextArea();
	public MyTextField() {
		
		ta.setEditable(false);   // ���� �Ұ����ϰ� ä��â ����
		JScrollPane js = new JScrollPane (ta);  // Scrollbar ( ���� Ȥ�� ���� ��ũ�� �� 1�� ) �Ѵ� ���������� Scrollpane
		add("Center",js);
		add("South", tf);
		setSize(350,450);
		setVisible(true);
		
		// �̺�Ʈ ���
		tf.addActionListener(this);   // mytextfield�� �����ִ� actionperfomed(�޼ҵ�)�� ȣ���ϴ� ���   & ����ġ�� �̺�Ʈ �߻�
		setDefaultCloseOperation(EXIT_ON_CLOSE);  // ���� �Ҵ� ���̰� �ӵ� �ø��� ���� �� �ʿ�
	}
	public static void main(String[] args) {
		// ������
		new MyTextField();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)  // ����ġ�� �ؽ�Ʈ�ʵ尡 ����?
		{ 
			ta.append(tf.getText()+"\n");     // getText- �Է��� ���� �����Ͷ�  
			// append   , setText  ( in textarea�� �ΰ��� �޼ҵ�)      
			//  (���ڰ���)	====== ������ �ִ� �ؽ�Ʈ�� ����� ���ο� ���ڿ��� ����
			// tf.getText() =>  �Էµ� ���ڸ� �о�´�
		}
	}

}
