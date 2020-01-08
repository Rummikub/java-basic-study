 // 인터페이스 = 미완성된 클래스 = 추상클래스 => 구현은 상속 받아서 진행해야 됨. 
import java.awt.*;
import javax.swing.*;

public class MainClass2 extends JFrame {  // 윈도우를 상속받음
	public MainClass2()
	{
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 f=new MainClass2();
	}

}
