//  �� �������̽��� ���� ���� ���� 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass6 extends JFrame implements ActionListener,MouseListener{
	JButton b= new JButton("Click");					// ��ư ����
	public MainClass6() {  
		// ��ġ�� �ϱ� ���� ����������� 
		add("North",b);
		setSize(480,300);
		setVisible(true);
		//b.addActionListener(this);   					// � �޼ҵ带 �ڵ����� ȣ������ �̺�Ʈ ����� �ؾ� ������ �� 
		b.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {  // ��ư �������� ó���ϴ� �Լ� actionPerformed
		// TODO Auto-generated method stub
		if(e.getSource()==b)  // Ŭ���� ��ư�� b���
		{
			System.out.println("B��ư Ŭ��");
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			System.out.println("���콺 ��ư Ŭ�� ");
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	// �ּҰ��� ȣ���� �� ���� �ٲ�� = ���� ���ε�
	// �ּҸ� �����ؼ� ȣ���Ѵ� = ���� ���ε�
	// �ӵ� �������ε� > �������ε�
}
