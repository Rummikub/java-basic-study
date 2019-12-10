/*
 * 				while => while(true) : 무한루프
 * 				for   =>  for(초기값;조건식1;조건식2)   :
 * 
 * 				반복문을 제어
 * 				=========== 
 * 					continue : 특정내용을 제외
 * 					break : 반복문을 종료
 */
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while ==> 1~(사용자 입력값) 까지의 짝수의 합, 홀수의 합, 총 합
		
		//  사용자 입력값 출력
		int sum=0,even=0,odd=0;
		int i=1;

		Scanner scan=new Scanner(System.in);
		System.out.printf("1이상의 숫자를 입력하세요: ");
		int user=scan.nextInt(); 
		while(i<=user)
		{
			sum+=i;
			if(i%2==0)
					even+=i;
			else
					odd+=i;
					i++;
		}
	
				System.out.println("짝수의 합"+even);
				System.out.println("홀수의 합"+odd);
				System.out.println("총 합"+sum);
		
		
		
		
	}

}
