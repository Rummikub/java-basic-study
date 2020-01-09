// 2차원 배열 활용하는 퍼즐 프로그램
// String.valueOf 활용하는 법만 알면 된다
// 2 -> 1치원 배열    brow i/열의 개수  = row    brow i%열의 개수 =col
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass6 extends JFrame implements ActionListener{
	JButton b1,b2;
	JButton[][] bu=new JButton[3][3];   // 2차원 배열
	int [][] panCount=new int[3][3];
	int brow,bcol;
	// 생성자 호출
	public MainClass6()
	{
		b1=new JButton("Start");
		b2=new JButton("Exit");
		int k=1;
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(3,3,5,5));  // 55(간격)
		for(int i=0; i<3;i++)   // row 가 0 일 때 col이 3번 돌아야 됨 3X3;
		{
			for(int j=0;j<3;j++)
			{
				bu[i][j]=new JButton(String. valueOf(k));  // 정수는 string으로 변환 시켜야 한다. 
				bu[i][j].setFont(new Font("굴림체",Font.BOLD,20));
				p1.add(bu[i][j]);
				bu[i][j].addActionListener(this);  // 배치하자마자 이벤트 등록
				k++;
			}
		}
		JPanel p2=new JPanel();
		p2.add(b1); p2.add(b2);
		
		add("Center",p1);
		add("South",p2);
		
		setSize(350,370);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//getRand();
		//display();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void getRand()
	{
		int[] com=new int [9];
		int su=0;
		boolean bCheck=false;
		for(int i=0; i<9 ; i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*9);
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
			panCount[i/3][i%3]=su;
			if(su==8)    // 3,3을 의미
			{
				brow=i/3;
				bcol=i%3;
			}
		}
	}
	public void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==brow && j==bcol)
				{
					bu[i][j].setText("");
					bu[i][j].setEnabled(false);
				}
				else
				{
					bu[i][j].setText(String.valueOf(panCount[i][j]+1));
					bu[i][j].setEnabled(true);  // 활성화
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass6();
	}
	public boolean isEnd() {
	int k=0;  //!
	for(int i=0;i<3;i++)
	{
		for(int j=0; j<10; j++)
		{
			if(panCount[i][j]!=k)
			{
				return false;
			}
			else
			{
				k++;
			}
		}
	}
	return true;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			display();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				if(e.getSource()==bu[i][j])
				{
					if(!(i==brow && Math.abs(bcol-j)==1 || 						// 차이가 -1 | 1이면 이동할 수 있
							j== bcol && Math.abs(brow-i)==1)) 
						return;
						panCount[brow][bcol]=panCount[i][j];  // 빈공백을 (i,j)로 바뀌어야 한다
						panCount[i][j]=8;
						brow=i;
						bcol=j;
						display();
						if(isEnd())
						{
							JOptionPane.showMessageDialog(this, "GAME OVER");
						}
				}
			}
		}
	}

}
