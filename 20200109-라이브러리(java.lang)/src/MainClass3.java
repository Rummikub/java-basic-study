// 모든 클래스는 object 상속을 받는다.
					/*	
					 * 	<	JVM이 자동으로 해주는 것 >
					 *  	1) extends Object
					 *  	2) 생성자가 없는 경우 하나를 자동으로 호출   => 모든 클래스는 생성자가 꼭 있어야 되거든
					 *  	3) 매소드  void => return 채워줌
					 *  	4) import java.lang 생략
					 *  	5) interface
					 *  			void disp(); => public abstract 생략 void disp();
					 *  			int a=10      => public static final int a=10;
					 *  
					 		 setBackgorund(new Color(0,0,0,1))  마지막 값이 a알파값 0.3정도가 적당!
				
					 */
// setOpaqueView ( 불투명을 투명하게 )
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass3 extends JFrame  implements ItemListener{
	JLabel la1,la2;
	JComboBox box=new JComboBox();
	public MainClass3() {
			//this. ( 뒤에 모든 object의 함수들이 호출된다 ) 
			la1=new JLabel( "선택");
			box.addItem("홍길동");
			box.addItem("김청이");
			box.addItem("박문수");
			la2=new JLabel("");
			la2.setFont(new Font("굴림체", Font.BOLD,35));
			
			JPanel p=new JPanel();
			p.add(la1);
			p.add(box);
			
			add("North",p);
			add("Center", la2);
			setSize(450,350);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return;
		new MainClass3();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {   // 선택이 변경됐다면~ 이란 뜻
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=box.getSelectedItem().toString();    // object의 string값을 달라! 
			la2.setText(name);
		}

	}

}
