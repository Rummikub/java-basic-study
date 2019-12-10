/*
 * 		자바에서 제공하는 특수문자
 * 		1) \n 	=> newLine => 다음 줄에 출력 System.out.println()
 * 		2) \t   => tab  =>  일정 간격
 * 		3) \"   => " => 따옴표 출력 ( 인용부호)
 * 				System.out.println("\"Hello Java\"")
 *		
 *		 출력 형식	
 *		 홍길동
 *		 심청이
 *		 박문수
 *
 *			=====> System.out.println(" 홍길동 ");
 *							 System.out.println(" 심청이 ");
 * 							 System.out.println(" 박문수 ");
 * 
 * 		홍길동 심청이 박문수
 * 				 System.out.print(" 홍길동\t ");
*					System.out.print(" 심청이\t ");
*					System.out.print(" 박문수\n ");
*
*				서식이 있는 출력 ==> JDK 1.5
*
*				1) %d   => 정수
*				System.out.printf("%5d%5d%5d",100,90,60);  
*							100--90---60
*				2) %f		=> 실수
*				3)  %c	=> 문자
*				4) %s	=> 문자열
*				System.out.printf();
*				이름		국어		영어 		수학		총점
*				홍길동		90			90		 90				270
 */
public class 일주차정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%-5d%-5d%-5d\n",100,90,60);   // 왼쪽 정렬 하고 싶으면 %-Nd
		
		System.out.printf("%-9.2f%-9.2f%-9 .2f",10.0000,90.0,60.7);   	// 총 10자리중에 소수점 2자리까지 출력 %N.nf
		
		System.out.printf("%2c%2c%2c\n", 'A' , 'B' ,'C');
		
		System.out.printf("%10s%10s%10s\n", "Hello", "Jvava", "!!");
		
		System.out.printf("%7s%5d%5d%5d%7.2f%c\n","홍길동", 34, 2,1,80.000, 'C');   // 데이터가 섞여 들어갈 수 있다
	}

}
