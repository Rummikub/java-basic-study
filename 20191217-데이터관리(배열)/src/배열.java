/*
 *  	배열	=> 여러개 데이터를 한개 이름으로 제어 => 인덱스 (첨자) 이용
 *  			** 인덱스는 0부터 시작
 *   1) 형식
 *   	1.선언
 *   		데이터형 [] 배열명 ; 
 *   		========
 *   		= 기본타입 (int, double, long ,char, float, char,short)
 *   			int[] arr
 *   			long[] arr
 *   			char[] arr
 *   		= 사용자 정의 타입 (클래스)
 *   			class Movie
 *   			Movie[] arr
 *   			String[] names
 *   				===
 *   				사용자 정의
 *   	2. 초기값
 *   		=	 arr={1,2,3,4,5}
 *   		=	arr = new int[6]  => 자체 초기값 (int:0, long:0L, String:null)
 *   			null ==>  메모리에 저장된 주소값이 존재하지 않음
 *   	3. 데이터 읽기
 *   		=  arr[index number] ==> 개수 -1 ( 0 부터 시작 )
 *   	4. 데이터 저장
 *   		= arr[1]=10
 *   
 *   			숫자 야구게임 (세자리)
 *   		=============== S.B
 *   			==> 원래는 중복을 허용하지 않는 난수 발생을 해야해  -> 사용자 입력 -> 힌트 -> 종료 -> 3S에 종료
 *   
 *   ;;;;; 몇번을 돌리는지 알 수 없으니 :  while문
 */
import java.util.Scanner;
public class 배열 {

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
				// 난수 발생
				su=(int)(Math.random()*9)+1;    // 1 ~9
				bCheck=false;																//******
													// 맨처음에  false가 나오면 else를 수행할 것이기에 오류 발생 , default를 앞에 걸어놓고 시작!
				// 중복 여부
				for(int j=0;j<i;j++)   // i까지 저장하기 때문 
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;  				// while문으로 올라간다
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
			// 오류처리
			if (input<99 || input>999)
			{
				System.out.print("Error! ");
				continue;
			}
			
			// 배열의 값을 변경
			user[0]=input/100;   // 100의 자리수
			user[1]=(input%100)/10; // 10의 자리수
			user[2]=input%10; // 1의 자리수

			// 오류 처리   == > 중복 된 수 쓰면 안됨, 0을사용할 수 없다
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0])
			{
				System.out.println("중복된 값은 사용할 수 없다");
				continue; // 처음으로 돌아감
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없다");
				continue;
			}
			
			// 비교 시작
			int s=0,b=0;
			for(int i=0;i<3;i++)   //com
			{
				for (int j=0; j<3; j++) //user
				{
					if (com[i]==user[i])  // 같은 수인가
					{
						if(i==j)   // 같은 자리수면 Strike 
							s++;
						else  // 다른 자리수면 Ball
							b++;
					}
				}
			}
			 // 힌트
			System.out.printf("Input Number: %d,  Result: %dS-%dB\n",input, s,b);
			System.out.println("================================");
			System.out.print("S: ");
			for(int i=0; i<s; i++)
			{
				System.out.print(" ●  ");
			}
			 System.out.print("\nB");
				for(int i=0; i<s; i++)
				{
					System.out.print(" ○ ");
				}
			System.out.println("\n================================");
			//종료여부 확인
			if(s==3)
			{
				System.out.println("GAME OVER");
				break;
			}
			
		
	}
	}
}
	
