// 익명의 클래스 활용 예제

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.event.*;
public class MyTable extends JFrame implements ActionListener,MouseListener {
	JTable table;  										// 테이블 모양 관리
	DefaultTableModel model;			// 데이터 관리
	JLabel la1, la2, la3;
	JTextField tf1,tf2,tf3;
	JButton b;
	TableColumn column;
	public MyTable() {
		la1= new JLabel("이름");
		la2= new JLabel("주소");
		la3= new JLabel("전화");
		
		tf1=new JTextField(7);
		tf2=new JTextField(7);
		tf3=new JTextField(7);				// 크기를 결정
		b= new JButton("등록");
		
		JPanel p=new JPanel();
		p.add(la1);p.add(tf1);
		p.add(la2);p.add(tf2);
		p.add(la3);p.add(tf3);
		p.add(b);
		
		//테이블 만들기
		String[] col= {"이름", "주소", "전화"};
		String[][] row = new String[0][3];				// 2 차원 배열 한줄에 세개씩 들어가
		model = new DefaultTableModel(row,col) {

			@Override   // 익명의 클래스에서 오버라이딩 하는법 : 빈 공간에 우클릭 > Source > Overrride ...   
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
				// 더블클릭해도 글이 수정 안되게 하는 메소드
			}
			
		};
		table = new JTable(model);
		table.setRowHeight(38);     // row 길이 늘리는 메소드
		JScrollPane js =new JScrollPane(table);
		table.getTableHeader().setReorderingAllowed(false);   // 테이블 헤더 ( 탭 ) 을 고정할때 쓰는 메소드
		table.setShowHorizontalLines(false);									// horizontal라인을 지워라  - 좌우 다 지우려면 Grid
		table.getTableHeader().setBackground(Color.lightGray);
		js.getViewport().setBackground(Color.white);					// 전체색을 바꾸려면 JScrollPane을 조절해주어야 하고 getViewport 는 안에 내용을 말함...
		add("Center",js);
		
		add("North",p);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 이벤트 등록
		b.addActionListener(this);
		table.addMouseListener(this);
		for(int i=0; i<=3; i++)
		{
			column=table.getColumnModel().getColumn(i);
			TableCellRenderer rend=column.getCellRenderer();
			
			if(i==0)
			{
				column.setPreferredWidth(150);
			}
			else if(i==1)
			{
				column.setPreferredWidth(450);
			}
			else if (i==2)
			{
				column.setPreferredWidth(250);
			}
			column.setCellRenderer(rend);
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTable();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			String name=tf1.getText();
			if(name.length()<1)					//예외 처리  입력안하면 도움말 뜨게 하기
			{
				JOptionPane.showMessageDialog(this, "이름을 입력하시오");
				return;
			}
			String addr=tf2.getText();
			String tel=tf3.getText();
		//  입력한 값 세개 받아서 테이블에 넣어라
			
			String [] data = {name,addr,tel};
			model.addRow(data);
			
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" "); 
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)  // 더블클릭하면 거기에 해당하는 값을 가져와라 ( getValueAt)코딩
			{
				int row=table.getSelectedRow();
				String name = model.getValueAt(row, 0).toString();
				String addr = model.getValueAt(row, 1).toString();				
				String tel = model.getValueAt(row, 2).toString();			
				
				String data= "이름: " +name+ "\n" + "주소: "+addr+ "\n"+"전화번호"+tel+ "\n" ;
				JOptionPane.showMessageDialog(this, data);
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {  // 드래그
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub 
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {   //  갖다 댔을 때
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {  // 띄었을때
		// TODO Auto-generated method stub
		
	}

}
