
/*JPanel = �ܵ����� ������ �� ���� ( Jframe, j dialog�߿� �ϳ��� �� ���� ����� ��)
				Layout => FlowLayout() => ���� �迭
 ( setLayout �� null ��� �� ����� ��ġ�� ������ �� ����) 
				=> BorderLayout (�������������) 
				=> GridLayout(���ڹ���)
JFrame + JDialog   */
import java.awt.*;
import javax.swing.*;
public class Movie {
		JPanel p;
		JLabel la;
		JTextField f;
		private String poster;
		private String name;
		public Movie() {
			poster="c:\\image\\poster.jpeg";
			name="������ �ڱ� (2019)";
			la=new JLabel(new ImageIcon(poster));   			// �Լ�ȣ���Ҷ� new
			f=new JTextField();
			f.setText(name); // �̸��� ����
			p= new JPanel();
			p.setLayout(new BorderLayout());
			p.add("Center",la);
		}
}
