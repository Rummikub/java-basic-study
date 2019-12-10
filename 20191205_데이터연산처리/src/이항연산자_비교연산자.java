/*
 * 값 표션
 * char ==> ''
 * int ==> 10, 010(8진법), 0x12(16진법), ob1010101(2진법)
 * long ==> 10L, 10l
 * float ==> 10.5F, 10.5f
 * boolean ==> true, false
 * String ==> ""
 * 
 * 비교 연산자 => 결과값(boolean) : true/false
 * ========
 * 	1) ==    같다  6==7(false)   6==6(true)
 * 	2) !=     같지 않다  6!7= (true) 6!=7 (false)
 * 	3) <   작다  4) >크다  	5)<=  작거나 같다  즉) 6<6 || 6== 6     6) >=크거나 같다
 * 																								------------ if, while, for문에서 주로 사용
 * 		** if => 조건문, while,for => 반복문
 */

import java.util.Scanner;
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=10==11;
		System.out.println("b1="+b1);
		
		b1=10!=11;
		System.out.println("b1="+b1);
		
		b1=10<11;
		System.out.println("b1=" +b1);
		
		b1=10>11;
		System.out.println("b1=" +b1);
		
		b1=10>11;
		System.out.println("ba="+b1);
		//char - 모든 연산에서 정수로 변경 ( ASCII코드)
		
		b1=65<='A';
		System.out.println("b1="+b1);
		
		b1=65>='B';
		System.out.println("b1="+b1);
		
		//char ->  고유 번호값 부여
		System.out.println((int)'A');   // 65
		System.out.println((int)'0'); // 48
		System.out.println((int)'a');  // 97
		
		// 두개의 정수를 받아서 큰 값을 출력
		
		Scanner scan = new Scanner(System.in);
		// new => 메모리에 저장   ============= 생성장 = 초기값 부여
		/*
		 * 	scan.nextInt()       > int
		 * 	scan.nextDouble()  	> Double
		 * 	scan.next() 						> String
		 * 	scan.nextBoolean()
		 * = >char(X)
		 */
		// 1. 받아서 저장할 변수
		int num1,num2;
		System.out.print("첫번째 정수 입력: ");
		// 입력을 하고 - Enter - num1에 저장
		num1=scan.nextInt();
		
		System.out.println("두번째 정수 입력:");
		num2=scan.nextInt();
		// 조건?   참:거짓 
		int result=num1<num2?num2:num1;
		System.out.println("큰 값은" +result+"입니다");
		
	}

}
