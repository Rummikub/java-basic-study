/*
 * �޼ҵ� Ȱ���� ���ھ߱�
 * ����N�� �Է¹޾�N�������Ѵ�
*
 * 1. ���� �Է¹޴´�
 * 2. �Ҽ����� Ȯ���ؼ� �´ٸ�
 * 3. N�������Ѵ�
 * 
 * 
 */
import java.util.Scanner;
public class DAY1���͵� {
	static int[]getRand()
	{
		int[]com=new int[3];
		int su=0;  // ������ �߻���Ű�� ����
		boolean isTrue=false;
		for(int i=0; i<3; i++)
		{
			isTrue=true;
			while(isTrue)
			{
				su=(int)(Math.random()*9)+1;
				isTrue=false;
				for(int j=0; j<1; j++)
				{
					if(com[j]==su)
					{
						isTrue=true;
						break;
					}
				}
			}
			com[i]=su;
		}
		return com;
	}
	
	static int[]userInput()
	{
		int[]user =new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("���ڸ� ���� �Է�");
			int input= scan.nextInt();
			if(input<100 || input >999)
			{
				System.out.println("error");
				continue;
			}
			user[0]=input/100;  //100�� �ڸ���
			user[1]=(input%100)/10; // 10�� �ڸ���
			user[2]=input%10; //1�� �ڸ���
		break;
		}
		return user;
	}
	
	static boolean isEnd(int user)
	{
		boolean bCheck=false;
		if(user==3)
			bCheck=true;
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. �Է¹ޱ�
		Scanner scan=new Scanner (System.in);
		System.out.print("�����Է�: ");
		int data=scan.nextInt();
		int count=0;
		
		//2. �Ҽ� ���ϱ�
		for (int i=2; i<data; i++)
		{ 
			boolean bCheck=true;
		
			for( int j=2; j<i; j++)
			{
				if(i%j==0)   // 3�� 1�� ������ 1���´�,   => �Ҽ��� �ƴ϶�� ���
					bCheck=false; 
				 	count ++;
				
				if(bCheck=true)
			    System.out.print(i);
			}
			
			
		//3. �� ���ϱ�  3�� �־����� 1~3���� �� ���ؾ� �Ǵµ�....
			
		
			
		}	 
		
		}

			
		
	}


