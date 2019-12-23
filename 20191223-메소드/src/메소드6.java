// 메소드를 활용해서 숫자야구
import java.util.Scanner;
public class 메소드6 {
	// 난수 발생
	static int[] getRand()
	{
		int[] com=new int[3];  // 3자리 정수
		int su=0; 
		boolean bCheck=false;
		for(int i=0; i<3; i++)
		{
			bCheck=true;
			while(bCheck)
			{
				// 난수 발생
				su= (int)(Math.random()*9)+1;
				bCheck=false;
				for(int j=0;j<1;j++)
				{
					if(com[j]==su)
					{
						bCheck=true; // while로 이동
						break;
					}
				}
			}
		// 중복된 수가 없다
			com[i]=su;
		}
		return com;
	}
	// 사용자 입력값
	static int[] userInput()
	{
		int[] user=new int[3];									// => com 과 user의 자리를 각각 비교해야 되기 때문에 배열로 받아야 함
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("3digit 정수 입력:  ");
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
				System.out.println("중복된 수는 사용할 수 없다");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없다");
				continue;
			}
			 break;
		}
		return user;
	}
	// 비교
	static int compare(int[] com, int[] user)
	{
		int s=0, b=0;
		for ( int i=0; i<3; i++)
		{
			for(int j=0;j<3;j++)
			{
				//같은 수가 있는지 여부
				if(com[i]==user[j])
				{	
					//  같은 자리
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
	// 힌트
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d%d%d, Result:%dS-%dB\n ", user[0], user[1], user[2],s,b);
	}
	// 종료여부
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if (s==3)
			bCheck= true;
		return bCheck;
	}

	// 조립
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
				System.out.println("종료할게요 y|n");
				String data=scan.next();
				
				if(data.equals("y"))	
				{	
					System.out.println(" 새 게임이 시작되었습니다");
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
		return "게임 시작합니다" ;
	}
	public static void main(String[] args) {
		process();
	}

}
