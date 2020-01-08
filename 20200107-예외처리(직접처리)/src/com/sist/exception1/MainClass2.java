package com.sist.exception1;

						/* 형식
						  try
						 {
							 평상시 소스 ( 정상 실행이 가능한 소스) 
						 	 
						 	  try를 수행하면서
						 	  에러가 발생하면
						 	  해당 catch를 찾아서 복구,
						 	  catch밑의 문장을 수행
						 	  
						 	  1
						 	  2
						 	  3
						 	  4  ==> error => 4,5수행하지 않고 => 1,2,3, +  catch를 수행함 (부분/전체 조절 가능)
						 	  5
						 }catch (예외처리클래스)
						 {
							 예외를 처리 ( 복구 )  => 에러가 출력된 부분을 제외하고 나머지를 수행
						 }
						 finally
						 {
							 	try나 catch나 상관없이 무조건 수행하는 문장
							 	= 파일닫기
							 	= 서버닫기
						 }
						 
						 목적) 에러를 찾아서 수정 ( 프로그래머 입장 )  => 에러메시지 확인 
						 																						1) getMessage()  2)printStackTrace() = 실행파일 전부 읽어서 에러난 라인수 제공
						 			프로그램이 정상상태 유지할 목적 ( 유저 ) 
						 사용법)
						 			전체를 처리 => 부분적으로 처리 기능
						 *
						 */
// 숫자 야구 게임 => 윈도우
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainClass2 extends JFrame implements ActionListener {
 	//선언
	JTextArea ta;
	JTextField tf;
	JButton b1,b2; 
	
	//게임 데이터
	int [] com = new int[3];
	int [] user=new int [3];
	int s,b;
	int res;
	//생성자 - 초기값
	public MainClass2 () { 
		ta=new JTextArea();
		ta.setEditable(false);  							// 힌트창 입력 안되게 수정    						
		JScrollPane js= new JScrollPane(ta); 
		//ta를 추가하라.. - by 수진 
		tf= new JTextField(13);    						//  입력창 크기   by 글자수
		tf.setEnabled(false);								// 아예 비활성화  ( <= 시작버튼 누르면 난수 발생 시킨 후 활성화)
		b1=new JButton("START");
		b2=new JButton("END");
		
		JPanel p=new JPanel();
		p.add(tf);p.add(b1); p.add(b2);
		
		// 배치
		add("Center", js);
		add("South",p);
		
		setSize(450,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);   // ↔   DO_NOTHING_ON_CLOSE
		
		// 버튼이 누
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
		boolean bCheck=false;                 // 중복을 체크하는 변수;
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
						bCheck=true;   // while문으로 돌아가게 된다.
						break;
					}
				}				
			}
			com[i]=su;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		// 버튼 클릭시 처리
		if(e.getSource()==b1)   // start button
		{
			getRand();												// ↓ 어느창에 띄울래 ( =이 팝업창에) 
			JOptionPane.showMessageDialog(this, "게임을 시작한다");  // 메세지 보여주는 팝업창
			tf.setEnabled(true); 
			b1.setEnabled(false);  // 고정해라
			tf.requestFocus();  // 게임 시작되게 Textfield에 커서를 위치시켜줌 
		}
		else if(e.getSource()==b2) // end button
		{
			dispose();  // 메모리 회수 메소드
			System.exit(0); // 프로그램종료
		}
		else if(e.getSource()==tf) // 입력창
		{
			String input = tf.getText();      // 입력창에 쓰여있는 값을 GET 가져와라
			input=input.trim();   					// 공백을 제외하여라 TRIM( 예외 처리 아니고 처음에 값 받을때 조절)
			//input.trim(): =>  X                      값을 바꾸는게 아니고 공백제거한 문자열을 다시 저장해줘야 된다.
			if(input.length()<1)   // 사용자가 아무것도 입력하지 않았을 경우
			{
				JOptionPane.showMessageDialog(this, "세자리 정수를 입력하라");
				tf.requestFocus();
				return;                     //입력 값을 넘겨줌
			}
			// 오류 경우의 수 : 정수를 안줄 수도 있고 공백을 줄수도 있음
			int no=0;
			try
			{
				// 정수 변환
				no=Integer.parseInt(input);    // 문자열을 정수로 바꾸는 메소드        ========> 예외처리가 필수인 메소드다 
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "정수만 입력하라");
				tf.setText("");   // ** 다음을 입력창에 출력하라  = 입력한 것을 지우는 효과
				tf.requestFocus();
				return ;  					// ** 메소드의 종료 / 원상복귀 를 의미
			}
			 
			// 잘못된 입력 ; 예외처리로 못걸러서 조건문을 달아줘야 함
			// = ( 중복되는 수 / 0이 포함된 경우)
			if(no<100 ||  no>999)
			{
				JOptionPane.showMessageDialog(this, "세자리만 입력하라");
				tf.setText("");   
				tf.requestFocus();   // 자주 쓰니까 →  메소드화
			}
			
			// user[]에 저장
			user[0]=no/100;
			user[1]=(no%100)/10;
			user[2]=no%10;
			
			if(user[0] == user[1] || user[1]==user[2] || user[2]==user[0])
			{
				JOptionPane.showMessageDialog(this, "중복된 수는 사용할 수 없다");
				tf.setText("");   
				tf.requestFocus();   // 자주 쓰니까 →  메소드화
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				JOptionPane.showMessageDialog(this, "0은 사용할 수 없다");
				tf.setText("");
				tf.requestFocus();
			}
			
			// 비교
			s=0;
			b=0;
			for(int i=0 ; i <3 ; i++)
			{
				for (int j=0; j<3; j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)    // 같은자리 
							s++;
						else
							b++;
					}
				}
			}
			
			// 힌트
			String hint = "Input Number: "+no+",Result: "+s+"S- "+b+"B\n";
			ta.append(hint);

			if(s==3)
			{
				int res=JOptionPane.showConfirmDialog(this, "종료할까요?", "종료",
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
