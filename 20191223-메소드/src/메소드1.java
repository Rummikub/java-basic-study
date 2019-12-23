/*
 * 		메소드
 * 		= 매개변수 ( 사용자 요청값 )  => 행위  = 여러개 or  0개
 * 		= 리턴형 => 요청 내용에 대한 결과값 전송   = 1개  ( if 데이터 여러개 => 묶어서 )
 * 									==================
 * 									기본형, 배열, 클래스
 * 		============================================================
 * 		형식)
 * 						리턴형 메소드명 ( 매개변수, ....) => 선언부
 * 						====		
 * 						{
 * 									==> 구현부 
 * 									return 결과값      ========> 리턴형 = 결과값  
 * 													====															======= > 리턴형 보다 작은 데이터형을 쓸 수 있다
 * 						}
 * 		
 * 						int aaa()
 * 						{
 * 							return ( int, char, byte, short)
 * 						}
 * 	*********** 호출
 * 						int a =aaa()
 * 							===> return이 생략되는 경우 ==> void
 * 
 * 					  배열
 * 						int[] aaa()     
 * 						{
 * 							return  배열명
 * 						}
 * 							int[] arr=aaa()
 * 
 * 						클래스
 * 						String aaa()
 * 						{
 * 							return " "( 문자열 )
 * 						}
 * 							String s=aaa()
 * 
 * 						결과값이 없는 경우
 * 						void aaa()
 * 						{
 * 							return;
 * 						}
 * 							aaa()
 * 						===============================
 * 						매개변수가 있는 경우
 * 						int plus(int a, intb)
 * 						===		==========
 * 						{
 * 								a=10, b=30
 * 								return a+b;
 * 								========
 * 						}
 * 						int a=plus(10,30);
 * 
 * 						void aaa)()     //동기화
 * 						{
 * 							===	1
 * 							===	2
 * 							===	3
 * 							===	4
 * 							===	5
 * 							===	6
 * 							===	7
 * 						}
 * 							aaa() => 1234567
 * 							aaa() => 1234567 		=> 반복과 관련						==> 제어문은 반드시 패턴이 존재해야 한다는 특징이 있음
  */
public class 메소드1 {
	 static void  message() 																						// 하나의 공간 static메모리에 모두 저장 ( 마지막에 입력한 값이 저장된다 )
	{
		System.out.println("hello java");
		 return; 																														//  생략이 되면 => JVM이 자동으로 코딩해준다 
	}
	 static String ccc()
	 {
		 return " Hello" ;
	 }
	 static int [] ddd()
	 {
		 int [] arr= {1,2,3,4,5};
		 return arr;
	 }
	 static double bbb()
	 {
		 double bbb= 10.5;
		 return bbb;
	 }
	 static int eee(int a)
	 {
		 return a;
	 }
	public static void main(String[] args) {
		//   메소드1  a= new  메소드1();   																	  // 저장을 해주지 않으면 작동하지 않는다  = > instance = 객체  ( 따로 저장 ) 
		message();
		double b=bbb();
		String s=ccc();
		int [] arr=ddd();
		int aa=eee(10);

		// 호출 ==> 결과값 ,매개변수
	}

}
