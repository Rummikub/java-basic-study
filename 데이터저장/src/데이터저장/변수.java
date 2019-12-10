package 데이터저장;
// 변수 = 프로그램에 필요한 한개의 데이터를 저장하는 메모리 이름
//                								--------------
/*
 * 	값을 설정 -> 형식
 *  1) 정수 							--- 10진법 int a=10,   2진법 int b=0b1010, 8진법 int c=012, 16진법 int d=0xFF
 *  		byte b=10 (127)
 *  		short s=100 (32767)
 * 		 int i=100
 * 		long l=100L
 * 	2) 실수
 * 		flaoat f=10.5F
 * 		double d=10.5
 * 	3) 문자
 * 		char c="A"
 * 	4) 논리형
 * 		 boolean b=true
 * 	5)문자열
 * 		String s="Hello Java"
 */
public class 변수 {
			// 2019년 9월 1  -- 0이 앞에 붙으면 8진법으로 생각하기 때문에 오류가 난다
			public static void main(String[] args) {
				// 1. 4byte크기의 메모리를 만들어라
				// 이 메모리이 이름 => a
				// a라는 메모리에 10을 저장하라
				int a=10;
				int b=012;
				int c=0xA;
				int d=0b1010;
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("d="+d);
				
			float f=10.5F;
			// 4 = 8
			System.out.println("f="+f);
			
			double d2=10.5D;  // D는 생략가능하다.
			System.out.println("d2="+d2);
			
			// + 산술연산자
			// + 문자열 결합
			// 7+""+7 -> 77 바로 뒤에 붙여라 라는 뜻
			// 7+7 -> 14
			boolean bcheck= true;
			System.out.println("bcheck="+bcheck);
			
			char ch='K';
			System.out.println("ch="+ch);
			
			String name="홍길동";
			System.out.println(name);
			
			int ii=Integer.MAX_VALUE;
			byte bb=Byte.MAX_VALUE;
			long ll= Long.MAX_VALUE;
			System.out.println("ii="+ii);
			System.out.println("bb="+bb);
			System.out.println("ll="+ll);
			}
}
