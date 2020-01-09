import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass5  extends JFrame implements MouseListener{
	JTextField tf1,tf2;		// <input type=text>
	JLabel la;						//<label>
	JComboBox box;		//<select>
	JTextField tf3;
	public MainClass5()
	{
		tf1=new JTextField(9);
		tf2=new JTextField(9);
		la=new JLabel("=");
		box=new JComboBox();
		box.addItem("+");		
		box.addItem("*");
		box.addItem("/");
		box.addItem("-");
		tf3=new JTextField(9);
		// 레이아웃 잡기 : 한줄로 출력
		setLayout(new FlowLayout());  
		// 버튼 배치 ( 순서대로 )
		add(tf1);add(box);add(tf2);add(la);add(tf3);
		
		setSize(450,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		la.addMouseListener(this);  // JLabel안에 클릭 이벤트를 실행 할것!
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			String num1=tf1.getText(); // tf1에 입력한 값을 가져와라
			String num2=tf2.getText();
			
			String op=box.getSelectedItem().toString();  //?
			
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int n3=0;       //초기화
			
			switch(op) {
			case "+":
				n3=n1+n2;
				break;
			case"-":
				n3=n1-n2;
				break;
			case "*":
				n3=n1*n2;
				break;
			case "/":
				n3=n1/n2;
			}
			
			tf3.setText(String.valueOf(n3));  // n3그 자체로 넣으면 정수로 인식하기 때문에 valueOf로 변환
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

}
