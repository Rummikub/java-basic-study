
// Select SOrt
// ���� �ټ��� �߻��ؼ� ������������
import java.util.Arrays;

/*\
 *  5���� ���� �߻�      // �ߺ��� �ȴٴ� ������ �ִ�
 *  	30   20   40  50  10
 *  		==============> ����� 50  40   30  20  10 
 *  
 *    for(int i=0;i<4;i++)
 *    {
 *       for(int j=(i+1);j<(5);j++)
 *       {
 *           if(arr[i]<arr[j])
 *           {
 *              int temp=arr[i];
 *              arr[i]=arr[j];
 *              arr[j]=temp;
 *           }
 *       }
 *    }
 *    i   j-s j-e     js-1=i  => js=i+1
 *    0    1   4
 *    1    2   4
 *    2    3   4
 *    3    4   4
 *    ==================================
 *    30 20 40 50 10
 *    == ==
 *    30 20
 *    ==    ==
 *    40    30
 *    ==       ==
 *    50       40
 *    ==          ==
 *    50          10
 *    ------------------------------ 1Round
 *    50 20 30 40 10
 *       == ==
 *       30 20
 *       ==    ==
 *       40    30
 *       ==       ==
 *       40       10
 *    ------------------------------ 2Round
 *    50 40 20 30 10
 *          == ==
 *          30 20
 *          ==    ==
 *          30    10
 *    ------------------------------ 3Round
 *    50 40 30 20 10
 *             == ==
 *             20 10
 *    ------------------------------ 4Round
 *    50 40 30 20 10
 *  
 *  
 *  i 				js					je       js-1=i     js = i+1
 *  	0				1					4
 *	1				2					4
 *	2				3					4
 *	3				4					4
 *
 *
 */

public class �迭11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int [] desc=new int[5];
		
		// �����߻�
		for(int i=0;i<5;i++)
		{
			desc[i]=(int)(Math.random()*100)+1;
		}
		
		for (int i=0; i<4; i++)  // �� ������ �ѹ����� ���ĵ� ��Ȳ
		{
			desc[i]=1;
			for (int j=(i+1); j<5; j++)
			{
				if (j==i)
					continue;
				
				if (desc[i]<desc[j])
				{
					int temp= desc[i];
					temp =desc [i];
					desc[j]=desc[i];
					desc[j]=temp;
				}
					System.out.println(i);
			}*/
		// ���� ����
		int[] desc=new int[5];
		//�ʱⰪ	
		for(int i=0;i<desc.length;i++)
		{
			desc[i]=(int)(Math.random()*100)+1;
		}
			System.out.println("���� ��: ");

		for (int i: desc)  // �� ������ �ѹ����� ���ĵ� ��Ȳ
		{

			System.out.println(i+"  ");
		}
		System.out.println();
		System.out.println("���� ��:");
		
		// ����
		 for(int i=0; i<desc.length-1; i++)
		 {
			 	for(int j=i+1; j<desc.length; j++)
			 	{
			 				if(desc[i]<desc[j])
			 				{
			 						int temp=desc[i];
			 						desc[i]=desc[j];
			 						desc[j]=temp;
			 				}
			 	}
		 }
		 for (int i:desc)
		 {
			 System.out.println(i+"  ");
		 }
		 }
}