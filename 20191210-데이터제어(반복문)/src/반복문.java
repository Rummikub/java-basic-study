/*
 *      반복문
 *      			{ 선조건 }
 *      			= for 								  : 반복횟수 지정			
 *      			=while							 : 지정이 없는 경우			
 *      					초기값
 *      					while(조건문)
 *      					{
 *      							실행문장
 *      							증가식
 *      					}
 *      			{ 후조건 }
 *      			= do~while  : 한번 이상은 반드시 수행
 *      					초기값
 *      					do
 *      						{
 *      							실행문장 
 *      							증가식  
 *      						} while(조건문)
 */
// 1~100 총합, 3의배수의 합, 5의배수의 합, 7의 배수의 합
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*t i=1;
		int sum3=0, sum5=0, sum7=0;
		while(i<=100)
		{ 
			if(i%3==0)
				sum3+=i;
			if(i%5==0)
				sum5+=i;
			if(i%7==0)
				sum7+=i;     // 15 같은 최소공배수도 계산해야 하기 때문에 단일 if 사용
			i++;
		}
		System.out.println("3의배수의 합"+sum3);
		System.out.println("5의배수의 합"+sum5);
		System.out.println("7의배수의 합"+sum7);
		*/
		
		char alpha='A';
		while (alpha<='Z')
		{
			System.out.print(alpha+" ");
			alpha++;
		}
	
	}	

}
