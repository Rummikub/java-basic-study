/*
 *  	구구단 => dan을 입력 받아서 
 *  
 *  		프로그램   --------   사용자 정의 +java라이브러리+ 외부오픈소스( mvnrepository.com)
 *  														=====================  등을 조립
 *  
 *  														5*1=5
 *  														5*2=10         --- 루프변수가 필요하겠구나 1~9
 */
import java.util.Scanner;
public class 반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("단을 입력하세요: ");
		int dan=scan.nextInt();    					//**** 입력값을 받는거 잊지말기
		
		//처리
		int i=1;
	
		while(i<=9)
		{
			System.out.printf("%2d  *  %2d  =  %2d\n",dan,i,dan*i);
			i++;

		}
	
		
	}
	

}
