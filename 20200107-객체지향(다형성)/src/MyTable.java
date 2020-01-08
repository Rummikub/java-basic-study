// �͸��� Ŭ���� Ȱ�� ����

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.event.*;
public class MyTable extends JFrame implements ActionListener,MouseListener {
	JTable table;  										// ���̺� ��� ����
	DefaultTableModel model;			// ������ ����
	JLabel la1, la2, la3;
	JTextField tf1,tf2,tf3;
	JButton b;
	TableColumn column;
	public MyTable() {
		la1= new JLabel("�̸�");
		la2= new JLabel("�ּ�");
		la3= new JLabel("��ȭ");
		
		tf1=new JTextField(7);
		tf2=new JTextField(7);
		tf3=new JTextField(7);				// ũ�⸦ ����
		b= new JButton("���");
		
		JPanel p=new JPanel();
		p.add(la1);p.add(tf1);
		p.add(la2);p.add(tf2);
		p.add(la3);p.add(tf3);
		p.add(b);
		
		//���̺� �����
		String[] col= {"�̸�", "�ּ�", "��ȭ"};
		String[][] row = new String[0][3];				// 2 ���� �迭 ���ٿ� ������ ��
		model = new DefaultTableModel(row,col) {

			@Override   // �͸��� Ŭ�������� �������̵� �ϴ¹� : �� ������ ��Ŭ�� > Source > Overrride ...   
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
				// ����Ŭ���ص� ���� ���� �ȵǰ� �ϴ� �޼ҵ�
			}
			
		};
		table = new JTable(model);
		table.setRowHeight(38);     // row ���� �ø��� �޼ҵ�
		JScrollPane js =new JScrollPane(table);
		table.getTableHeader().setReorderingAllowed(false);   // ���̺� ��� ( �� ) �� �����Ҷ� ���� �޼ҵ�
		table.setShowHorizontalLines(false);									// horizontal������ ������  - �¿� �� ������� Grid
		table.getTableHeader().setBackground(Color.lightGray);
		js.getViewport().setBackground(Color.white);					// ��ü���� �ٲٷ��� JScrollPane�� �������־�� �ϰ� getViewport �� �ȿ� ������ ����...
		add("Center",js);
		
		add("North",p);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// �̺�Ʈ ���
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
			if(name.length()<1)					//���� ó��  �Է¾��ϸ� ���� �߰� �ϱ�
			{
				JOptionPane.showMessageDialog(this, "�̸��� �Է��Ͻÿ�");
				return;
			}
			String addr=tf2.getText();
			String tel=tf3.getText();
		//  �Է��� �� ���� �޾Ƽ� ���̺� �־��
			
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
			if(e.getClickCount()==2)  // ����Ŭ���ϸ� �ű⿡ �ش��ϴ� ���� �����Ͷ� ( getValueAt)�ڵ�
			{
				int row=table.getSelectedRow();
				String name = model.getValueAt(row, 0).toString();
				String addr = model.getValueAt(row, 1).toString();				
				String tel = model.getValueAt(row, 2).toString();			
				
				String data= "�̸�: " +name+ "\n" + "�ּ�: "+addr+ "\n"+"��ȭ��ȣ"+tel+ "\n" ;
				JOptionPane.showMessageDialog(this, data);
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {  // �巡��
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub 
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {   //  ���� ���� ��
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {  // �������
		// TODO Auto-generated method stub
		
	}

}
