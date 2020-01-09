// ��� Ŭ������ object ����� �޴´�.
					/*	
					 * 	<	JVM�� �ڵ����� ���ִ� �� >
					 *  	1) extends Object
					 *  	2) �����ڰ� ���� ��� �ϳ��� �ڵ����� ȣ��   => ��� Ŭ������ �����ڰ� �� �־�� �ǰŵ�
					 *  	3) �żҵ�  void => return ä����
					 *  	4) import java.lang ����
					 *  	5) interface
					 *  			void disp(); => public abstract ���� void disp();
					 *  			int a=10      => public static final int a=10;
					 *  
					 		 setBackgorund(new Color(0,0,0,1))  ������ ���� a���İ� 0.3������ ����!
				
					 */
// setOpaqueView ( �������� �����ϰ� )
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass3 extends JFrame  implements ItemListener{
	JLabel la1,la2;
	JComboBox box=new JComboBox();
	public MainClass3() {
			//this. ( �ڿ� ��� object�� �Լ����� ȣ��ȴ� ) 
			la1=new JLabel( "����");
			box.addItem("ȫ�浿");
			box.addItem("��û��");
			box.addItem("�ڹ���");
			la2=new JLabel("");
			la2.setFont(new Font("����ü", Font.BOLD,35));
			
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
	public void itemStateChanged(ItemEvent e) {   // ������ ����ƴٸ�~ �̶� ��
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=box.getSelectedItem().toString();    // object�� string���� �޶�! 
			la2.setText(name);
		}

	}

}
