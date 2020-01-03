
/*JPanel = 단독으로 실행할 수 없음 ( Jframe, j dialog중에 하나는 꼭 같이 써줘야 됨)
				Layout => FlowLayout() => 일자 배열
 ( setLayout 을 null 줘야 내 맘대로 위치를 조정할 수 있음) 
				=> BorderLayout (동서남북정가운데) 
				=> GridLayout(격자무늬)
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
			name="프린스 코기 (2019)";
			la=new JLabel(new ImageIcon(poster));   			// 함수호출할때 new
			f=new JTextField();
			f.setText(name); // 이름을 설정
			p= new JPanel();
			p.setLayout(new BorderLayout());
			p.add("Center",la);
		}
}
