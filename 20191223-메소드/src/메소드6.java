// �޼ҵ带 Ȱ���ؼ� ���ھ߱�
import java.util.Scanner;
public class �޼ҵ�6 {
	// ���� �߻�
	static int[] getRand()
	{
		int[] com=new int[3];  // 3�ڸ� ����
		int su=0; 
		boolean bCheck=false;
		for(int i=0; i<3; i++)
		{
			bCheck=true;
			while(bCheck)
			{
				// ���� �߻�
				su= (int)(Math.random()*9)+1;
				bCheck=false;
				for(int j=0;j<1;j++)
				{
					if(com[j]==su)
					{
						bCheck=true; // while�� �̵�
						break;
					}
				}
			}
		// �ߺ��� ���� ����
			com[i]=su;
		}
		return com;
	}
	// ����� �Է°�
	static int[] userInput()
	{
		int[] user=new int[3];									// => com �� user�� �ڸ��� ���� ���ؾ� �Ǳ� ������ �迭�� �޾ƾ� ��
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("3digit ���� �Է�:  ");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("Error");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ����� �� ����");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0�� ����� �� ����");
				continue;
			}
			 break;
		}
		return user;
	}
	// ��
	static int compare(int[] com, int[] user)
	{
		int s=0, b=0;
		for ( int i=0; i<3; i++)
		{
			for(int j=0;j<3;j++)
			{
				//���� ���� �ִ��� ����
				if(com[i]==user[j])
				{	
					//  ���� �ڸ�
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}

				hint(user,s,b);
				return s;
	}
	// ��Ʈ
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d%d%d, Result:%dS-%dB\n ", user[0], user[1], user[2],s,b);
	}
	// ���Ῡ��
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if (s==3)
			bCheck= true;
		return bCheck;
	}

	// ����
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		int [] com=getRand();
		while(true)
		{
			int[] user=userInput();
			int s=compare(com,user);
			if(isEnd(s))
			{
				System.out.println("�����ҰԿ� y|n");
				String data=scan.next();
				
				if(data.equals("y"))	
				{	
					System.out.println(" �� ������ ���۵Ǿ����ϴ�");
					System.exit(0);
				}
					else
				{
				}
			}
		}
	}
	static String start()
	{
		return "���� �����մϴ�" ;
	}
	public static void main(String[] args) {
		process();
	}

}
