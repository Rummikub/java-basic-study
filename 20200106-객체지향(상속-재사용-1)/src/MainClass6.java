//  ★ 인터페이스와 스윙 실전 사용법 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass6 extends JFrame implements ActionListener,MouseListener{
	JButton b= new JButton("Click");					// 버튼 생성
	public MainClass6() {  
		// 배치를 하기 위해 만들었나보다 
		add("North",b);
		setSize(480,300);
		setVisible(true);
		//b.addActionListener(this);   					// 어떤 메소드를 자동으로 호출할지 이벤트 등록을 해야 실행이 됨 
		b.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {  // 버튼 눌렀을때 처리하는 함수 actionPerformed
		// TODO Auto-generated method stub
		if(e.getSource()==b)  // 클릭한 버튼이 b라면
		{
			System.out.println("B버튼 클릭");
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			System.out.println("마우스 버튼 클릭 ");
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

	
	// 주소값이 호출할 때 마다 바뀐다 = 동적 바인딩
	// 주소를 고정해서 호출한다 = 정적 바인딩
	// 속도 정적바인딩 > 동적바인딩
}
