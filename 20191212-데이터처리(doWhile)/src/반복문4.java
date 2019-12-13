/*
 *  	두개의 정수를 입력받아서
 *  	최대값, 최소값
 *  	do~while
 *  
 *   	10 	30  ==> 최대값:30 	, 최소값:10
 */
import java.util.Scanner;
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num1=0, num2=0;
		
		int i=1;
		Scanner scan=new Scanner(System.in);
		do {
			
			
			if (i==1)
			{
				System.out.println("값1");
				num1=scan.nextInt();
			}
			else
			{
				System.out.println("값2");      							// 첫번째에 num1, 2에2를 채우기 위한 조건
				num2=scan.nextInt();
			}
			i++;																						   //!!!!!
				
		}while(i<=2);
		
			System.out.println("최대값:"+(num1>num2?num1:num2)+"최소값:"+(num1>num2?num2:num1)); 
			System.out.println("최대값:"+(Math.max(num1, num2))+"최소값:"+(Math.min(num1, num2)));
		 
			if(num1>num2)
				System.out.println("최대값"+num1+",최소값"+num2);   				//   한줄이면 블록 설정 안해도 된다.
			else  
				System.out.println("최대값"+num2+",최소값"+num1);
	
	
	}

}
