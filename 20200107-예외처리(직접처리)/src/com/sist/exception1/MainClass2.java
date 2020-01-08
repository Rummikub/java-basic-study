package com.sist.exception1;

						/* ����
						  try
						 {
							 ���� �ҽ� ( ���� ������ ������ �ҽ�) 
						 	 
						 	  try�� �����ϸ鼭
						 	  ������ �߻��ϸ�
						 	  �ش� catch�� ã�Ƽ� ����,
						 	  catch���� ������ ����
						 	  
						 	  1
						 	  2
						 	  3
						 	  4  ==> error => 4,5�������� �ʰ� => 1,2,3, +  catch�� ������ (�κ�/��ü ���� ����)
						 	  5
						 }catch (����ó��Ŭ����)
						 {
							 ���ܸ� ó�� ( ���� )  => ������ ��µ� �κ��� �����ϰ� �������� ����
						 }
						 finally
						 {
							 	try�� catch�� ������� ������ �����ϴ� ����
							 	= ���ϴݱ�
							 	= �����ݱ�
						 }
						 
						 ����) ������ ã�Ƽ� ���� ( ���α׷��� ���� )  => �����޽��� Ȯ�� 
						 																						1) getMessage()  2)printStackTrace() = �������� ���� �о ������ ���μ� ����
						 			���α׷��� ������� ������ ���� ( ���� ) 
						 ����)
						 			��ü�� ó�� => �κ������� ó�� ���
						 *
						 */
// ���� �߱� ���� => ������
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass2 extends JFrame implements ActionListener {
 	//����
	JTextArea ta;
	JTextField tf;
	JButton b1,b2; 
	
	//���� ������
	int [] com = new int[3];
	int [] user=new int [3];
	int s,b;
	int res;
	//������ - �ʱⰪ
	public MainClass2 () { 
		ta=new JTextArea();
		ta.setEditable(false);  							// ��Ʈâ �Է� �ȵǰ� ����    						
		JScrollPane js= new JScrollPane(ta); 
		//ta�� �߰��϶�.. - by ���� 
		tf= new JTextField(13);    						//  �Է�â ũ��   by ���ڼ�
		tf.setEnabled(false);								// �ƿ� ��Ȱ��ȭ  ( <= ���۹�ư ������ ���� �߻� ��Ų �� Ȱ��ȭ)
		b1=new JButton("START");
		b2=new JButton("END");
		
		JPanel p=new JPanel();
		p.add(tf);p.add(b1); p.add(b2);
		
		// ��ġ
		add("Center", js);
		add("South",p);
		
		setSize(450,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);   // ��   DO_NOTHING_ON_CLOSE
		
		// ��ư�� ��
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}
	public void getRand() {
		int su=0;
		boolean bCheck=false;                 // �ߺ��� üũ�ϴ� ����;
		for( int i=0; i<3; i++)
		{
			bCheck=true;
			while (bCheck)
			{
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				for ( int j=0 ; j<3 ; j++)
				{
					if(com[j]==su)
					{
						bCheck=true;   // while������ ���ư��� �ȴ�.
						break;
					}
				}				
			}
			com[i]=su;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		// ��ư Ŭ���� ó��
		if(e.getSource()==b1)   // start button
		{
			getRand();												// �� ���â�� ��﷡ ( =�� �˾�â��) 
			JOptionPane.showMessageDialog(this, "������ �����Ѵ�");  // �޼��� �����ִ� �˾�â
			tf.setEnabled(true); 
			b1.setEnabled(false);  // �����ض�
			tf.requestFocus();  // ���� ���۵ǰ� Textfield�� Ŀ���� ��ġ������ 
		}
		else if(e.getSource()==b2) // end button
		{
			dispose();  // �޸� ȸ�� �޼ҵ�
			System.exit(0); // ���α׷�����
		}
		else if(e.getSource()==tf) // �Է�â
		{
			String input = tf.getText();      // �Է�â�� �����ִ� ���� GET �����Ͷ�
			input=input.trim();   					// ������ �����Ͽ��� TRIM( ���� ó�� �ƴϰ� ó���� �� ������ ����)
			//input.trim(): =>  X                      ���� �ٲٴ°� �ƴϰ� ���������� ���ڿ��� �ٽ� ��������� �ȴ�.
			if(input.length()<1)   // ����ڰ� �ƹ��͵� �Է����� �ʾ��� ���
			{
				JOptionPane.showMessageDialog(this, "���ڸ� ������ �Է��϶�");
				tf.requestFocus();
				return;                     //�Է� ���� �Ѱ���
			}
			// ���� ����� �� : ������ ���� ���� �ְ� ������ �ټ��� ����
			int no=0;
			try
			{
				// ���� ��ȯ
				no=Integer.parseInt(input);    // ���ڿ��� ������ �ٲٴ� �޼ҵ�        ========> ����ó���� �ʼ��� �޼ҵ�� 
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "������ �Է��϶�");
				tf.setText("");   // ** ������ �Է�â�� ����϶�  = �Է��� ���� ����� ȿ��
				tf.requestFocus();
				return ;  					// ** �޼ҵ��� ���� / ���󺹱� �� �ǹ�
			}
			 
			// �߸��� �Է� ; ����ó���� ���ɷ��� ���ǹ��� �޾���� ��
			// = ( �ߺ��Ǵ� �� / 0�� ���Ե� ���)
			if(no<100 ||  no>999)
			{
				JOptionPane.showMessageDialog(this, "���ڸ��� �Է��϶�");
				tf.setText("");   
				tf.requestFocus();   // ���� ���ϱ� ��  �޼ҵ�ȭ
			}
			
			// user[]�� ����
			user[0]=no/100;
			user[1]=(no%100)/10;
			user[2]=no%10;
			
			if(user[0] == user[1] || user[1]==user[2] || user[2]==user[0])
			{
				JOptionPane.showMessageDialog(this, "�ߺ��� ���� ����� �� ����");
				tf.setText("");   
				tf.requestFocus();   // ���� ���ϱ� ��  �޼ҵ�ȭ
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				JOptionPane.showMessageDialog(this, "0�� ����� �� ����");
				tf.setText("");
				tf.requestFocus();
			}
			
			// ��
			s=0;
			b=0;
			for(int i=0 ; i <3 ; i++)
			{
				for (int j=0; j<3; j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)    // �����ڸ� 
							s++;
						else
							b++;
					}
				}
			}
			
			// ��Ʈ
			String hint = "Input Number: "+no+",Result: "+s+"S- "+b+"B\n";
			ta.append(hint);

			if(s==3)
			{
				int res=JOptionPane.showConfirmDialog(this, "�����ұ��?", "����",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(res==JOptionPane.YES_OPTION)
				{
					dispose();
					System.exit(0);
				}
				else 
				{
					ta.setText("");
					tf.setText("");
					tf.setEnabled(false);
					b1.setEnabled(true);
				}
			}
			tf.setText("");
			tf.requestFocus();
			
		}
	}
}
