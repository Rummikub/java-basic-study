/*
 *  		����-����)      
 *  							1					2   ===> false ����
 *  															8
 *  							i					i<=5		i++
 *  				for (�ʱⰪ;���ǽ�;������) ====> 1��    _______________> �ټ�
 *  				{									3 true
 *  									1					2	===> false ( => 1�� for�� ���������� ��)
 *  																		4
 *  									j=1		j<=5				j++
 *  						for(�ʱⰪ;���ǽ�;������) ===> 2��  ______________> ���� ���
 *  						{							3true		
 *  											���๮�� (2��for)  => 2�� for�� ���������� ��
 *  						}							5
 *  				}	���๮��	(1��for)  => 1�� for�� ���������� ��
 *  				
 *  						*****				1�� for�� = �����̳�  
 *  						*****				2�� for�� = ��							 ** �갡 ����ϴ� ���뿡 �ش��Ѵ�
 *  						*****      ex) �޷°��� ���̺� ���� © �� �ַ� ����Ѵ�
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
  *  			��	��
  *  			1        1
  * 			2		  2
  * 			3			3
  * 
  * 		������ ���
  * 			i+j=6     j=6-i
  * 
  * 
  *    				*
  *  			      **
  *  			    ***
  *  			 ****	
  *  		   *****
  *  
  *  				i     j   k (��) 				i=k   , k=i
  *  				1   4    1      									1		0		5         j+1=i    j=i-1      k=6-i
  *  				2   3												2     1     4
  *  				3	  2												3      2     3
  *  				4	  1												4      3     2
  *  				5	  0         i+j=5 .   j(����)=5-i
  *  
  *  
  *  
  *     ��4 = �𷡽ð��� ���
  *     ��5= ������� ���
  *     ��6= ���̾Ƹ�� ��� ���
  *     
  *     
  *     
  *     
  *     ==================
  *     2*1=2    3*1=3   4*1=4     -------   9*1=9    => 8�� (j)
  *     
  *     2*9=18														9*9=81   => 9��(i)
  *     
 */
public class ���߹ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("��");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=5;j++)        // (i.j)�� �������� Ȯ�� �� �� �ִ�
			{
				if(i==j)
				System.out.print(j);    // ���η� �ټ��� ����ؾ� �Ѵ�
				else
				System.out.print("#");
			}
			System.out.println();  // 1��for�� ��Ͼȿ� sysout�� ���� ���� ���� ����
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
		
		//������
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
