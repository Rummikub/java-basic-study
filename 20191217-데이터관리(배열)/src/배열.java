/*
 *  	�迭	=> ������ �����͸� �Ѱ� �̸����� ���� => �ε��� (÷��) �̿�
 *  			** �ε����� 0���� ����
 *   1) ����
 *   	1.����
 *   		�������� [] �迭�� ; 
 *   		========
 *   		= �⺻Ÿ�� (int, double, long ,char, float, char,short)
 *   			int[] arr
 *   			long[] arr
 *   			char[] arr
 *   		= ����� ���� Ÿ�� (Ŭ����)
 *   			class Movie
 *   			Movie[] arr
 *   			String[] names
 *   				===
 *   				����� ����
 *   	2. �ʱⰪ
 *   		=	 arr={1,2,3,4,5}
 *   		=	arr = new int[6]  => ��ü �ʱⰪ (int:0, long:0L, String:null)
 *   			null ==>  �޸𸮿� ����� �ּҰ��� �������� ����
 *   	3. ������ �б�
 *   		=  arr[index number] ==> ���� -1 ( 0 ���� ���� )
 *   	4. ������ ����
 *   		= arr[1]=10
 *   
 *   			���� �߱����� (���ڸ�)
 *   		=============== S.B
 *   			==> ������ �ߺ��� ������� �ʴ� ���� �߻��� �ؾ���  -> ����� �Է� -> ��Ʈ -> ���� -> 3S�� ����
 *   
 *   ;;;;; ����� �������� �� �� ������ :  while��
 */
import java.util.Scanner;
public class �迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] com= new int [9];
		int su=0;  													
		boolean bCheck=false;   			

		for(int i=0; i<com.length; i++)
		{
			bCheck=true;     							//****
			while(bCheck)
			{
				// ���� �߻�
				su=(int)(Math.random()*9)+1;    // 1 ~9
				bCheck=false;																//******
													// ��ó����  false�� ������ else�� ������ ���̱⿡ ���� �߻� , default�� �տ� �ɾ���� ����!
				// �ߺ� ����
				for(int j=0;j<i;j++)   // i���� �����ϱ� ���� 
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;  				// while������ �ö󰣴�
					}
				}
			}
			com[i]=su;
		}
		
		int[]user= new int[3];
		Scanner scan=new Scanner (System.in);
		while(true)
		{
			System.out.print("3 digit :  ");
			int input=scan.nextInt();
			// ����ó��
			if (input<99 || input>999)
			{
				System.out.print("Error! ");
				continue;
			}
			
			// �迭�� ���� ����
			user[0]=input/100;   // 100�� �ڸ���
			user[1]=(input%100)/10; // 10�� �ڸ���
			user[2]=input%10; // 1�� �ڸ���

			// ���� ó��   == > �ߺ� �� �� ���� �ȵ�, 0������� �� ����
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("�ߺ��� ���� ����� �� ����");
				continue; // ó������ ���ư�
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0�� ����� �� ����");
				continue;
			}
			
			// �� ����
			int s=0,b=0;
			for(int i=0;i<3;i++)   //com
			{
				for (int j=0; j<3; j++) //user
				{
					if (com[i]==user[i])  // ���� ���ΰ�
					{
						if(i==j)   // ���� �ڸ����� Strike 
							s++;
						else  // �ٸ� �ڸ����� Ball
							b++;
					}
				}
			}
			 // ��Ʈ
			System.out.printf("Input Number: %d,  Result: %dS-%dB\n",input, s,b);
			System.out.println("================================");
			System.out.print("S: ");
			for(int i=0; i<s; i++)
			{
				System.out.print(" ��  ");
			}
			 System.out.print("\nB");
				for(int i=0; i<s; i++)
				{
					System.out.print(" �� ");
				}
			System.out.println("\n================================");
			//���Ῡ�� Ȯ��
			if(s==3)
			{
				System.out.println("GAME OVER");
				break;
			}
			
		
	}
	}
}
	
