/*
 *  		형식-순서)      
 *  							1					2   ===> false 종료
 *  															8
 *  							i					i<=5		i++
 *  				for (초기값;조건식;증가식) ====> 1차    _______________> 줄수
 *  				{									3 true
 *  									1					2	===> false ( => 1차 for문 증가식으로 감)
 *  																		4
 *  									j=1		j<=5				j++
 *  						for(초기값;조건식;증가식) ===> 2차  ______________> 실제 출력
 *  						{							3true		
 *  											실행문장 (2차for)  => 2차 for문 증가식으로 감
 *  						}							5
 *  				}	실행문장	(1차for)  => 1차 for문 증가식으로 감
 *  				
 *  						*****				1차 for문 = 몇줄이냐  
 *  						*****				2차 for문 = 안							 ** 얘가 출력하는 내용에 해당한다
 *  						*****      ex) 달력같은 테이블 값을 짤 때 주로 사용한다
  *  						*****
  *  
  *  
  *  
  *  						1####
  *  						#2###
  *  						##3##
  *  						###4#
  *  						####5
  *  
  *  
  *  
  *  				*
  *  				**
  *  				***
  *  				****	
  *  				*****
  *  				i      j
  *  			줄	별
  *  			1        1
  * 			2		  2
  * 			3			3
  * 
  * 		역수로 출력
  * 			i+j=6     j=6-i
  * 
  * 
  *    				*
  *  			      **
  *  			    ***
  *  			 ****	
  *  		   *****
  *  
  *  				i     j   k (별) 				i=k   , k=i
  *  				1   4    1      									1		0		5         j+1=i    j=i-1      k=6-i
  *  				2   3												2     1     4
  *  				3	  2												3      2     3
  *  				4	  1												4      3     2
  *  				5	  0         i+j=5 .   j(공백)=5-i
  *  
  *  
  *  
  *     문4 = 모래시계모양 출력
  *     문5= 리본모양 출력
  *     문6= 다이아몬드 모양 출력
  *     
  *     
  *     
  *     
  *     ==================
  *     2*1=2    3*1=3   4*1=4     -------   9*1=9    => 8개 (j)
  *     
  *     2*9=18														9*9=81   => 9개(i)
  *     
 */
public class 이중반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=5;j++)        // (i.j)가 숫자임을 확인 할 수 있다
			{
				if(i==j)
				System.out.print(j);    // 가로로 다섯번 출력해야 한다
				else
				System.out.print("#");
			}
			System.out.println();  // 1차for문 블록안에 sysout이 들어가야 됨을 잊지 말자
		}
		

		//
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=6-i; j++) 				
			{
				
				System.out.print("*");
	
			}
			System.out.println();
		}
		
		//
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++) 				
			{
				
				System.out.print("*");
	
			}
			System.out.println();
		}
		
		//
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i-1; j++) 				
			{
				
				System.out.print(" ");
			}
			for(int k=1;k<=6-i; k++) 				
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		//구구단
		for(int i=1; i<=9; i++)
			
		{
			for(int j=2; j<=9; j++) 				
			{
				
				System.out.printf("%2d*%2d=%2d\t ",j,i,j*i);
			}
		
			System.out.println();
		}
		
				
		
	}
}
