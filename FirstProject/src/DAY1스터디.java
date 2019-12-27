/*
 * 메소드 활용한 숫자야구
 * 정수N을 입력받아N까지더한다
*
 * 1. 값을 입력받는다
 * 2. 소수인지 확인해서 맞다면
 * 3. N까지더한다
 * 
 * 
 */
import java.util.Scanner;
public class DAY1스터디 {
	static int[]getRand()
	{
		int[]com=new int[3];
		int su=0;  // 난수를 발생시키는 변수
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
			System.out.println("세자리 정수 입력");
			int input= scan.nextInt();
			if(input<100 || input >999)
			{
				System.out.println("error");
				continue;
			}
			user[0]=input/100;  //100의 자리수
			user[1]=(input%100)/10; // 10의 자리수
			user[2]=input%10; //1의 자리수
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

		// 1. 입력받기
		Scanner scan=new Scanner (System.in);
		System.out.print("정수입력: ");
		int data=scan.nextInt();
		int count=0;
		
		//2. 소수 구하기
		for (int i=2; i<data; i++)
		{ 
			boolean bCheck=true;
		
			for( int j=2; j<i; j++)
			{
				if(i%j==0)   // 3을 1로 나누면 1남는다,   => 소수가 아니라는 얘기
					bCheck=false; 
				 	count ++;
				
				if(bCheck=true)
			    System.out.print(i);
			}
			
			
		//3. 다 더하기  3을 넣었으면 1~3까지 다 더해야 되는데....
			
		
			
		}	 
		
		}

			
		
	}


