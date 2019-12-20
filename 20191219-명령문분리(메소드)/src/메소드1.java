/* 		객체 지향 = 유지보수 프로그램
 * 		메소드 
 * 		=====
 * 			자바( 객체지향 => 클래스 )    *   클래스 : 변수 + 메소드   * 메소드 : 연산자 + 제어문
 * 
 * 	형식) 
 * 				리턴형(처리결과값)  메소드명(매개변수 ...)   => 선언부
 * 				==============	  ======
 * 					기본형								약속: 모든메소드는 소문자로 쓴다
 * 					======											getText()    ===> nextInt()
 * 					배열형
 * 					클래스형
 * 					====== 결과값이 여러개 
 * 				{
 * 					=> 구현부
 * 					연산처리
 * 					제어문 ( 안써도 됨 ) 
 * 				
 * 					return  결과값
 * 				}
 * 		
 * 		** return 값을 1개 설정이 가능
 * 
 * 				여러개일 경우 ==> 묶어서 보내준다		(배열)
 * 
 * 		** 모든 메소드는 return이 있으면 종료						 
 * 
 * 		** java lang 생략 ,void 의 return 생략가능 => JVM이 자동으로 return추가
 * 		-----------------------------------------
 *		** 결과값을 뭘 가져올지 고민해야 해    => 사용자가 요청한 값?  처리결과   
 *		** 호출 (어느시기)
 *		-------------------------------------------
 */
import java.util.Scanner;
public class 메소드1 {
					//  +
					static int plus(int a, int b)
					{
						return a+b;
					}
					// -
					static int minus(int a, int b)
					{
						return a-b;
					}
					// *
					static int multi( int a, int b)
					{
						return a*b;
					}
					//   /
					static double div( int a, int b)
					{
						return a/ (double) b;
					}
					//계산기 만들기
					static void process()	
					{
						Scanner scan = new Scanner(System.in);
						System.out.print("정수 1 입력: ");
						int a=scan.nextInt();
						System.out.print("정수 2 입력: ");
						int b=scan.nextInt();
						System.out.print("연산자(+-*/) 입력: ");
						String op=scan.next();
					
							switch(op)    // {}을 치면 같은 변수를 여러번 사용할 수 있음
							{
								case"+":
								{	
									int res=plus(a,b);
									System.out.printf("%d%s%d=%d\n", a, op, b,res);   // 정렬
								}	
								break;
								case"-":
								{	
									int res=minus(a,b);
									System.out.printf("%d%s%d=%d\n", a, op, b,res);
								}	
								break;
								case"*":
								{	
									int res=multi(a,b);
									System.out.printf("%d%s%d=%d\n", a, op, b,res);  
								}	
								break;
								case"/+":
								{	
									double res=div(a,b);
									System.out.printf("%d%s%d=%f\n", a, op, b,res);       // * double, f조심!!
								}	
								break;
							}   // main에 들어가면 가져다가 쓸 수 없기 때문에 밖에 빼서 쓴 것
					}
					public static void main(String[] args) {
						// TODO Auto-generated method stub
						Scanner scan=new Scanner(System.in);
						while(true)
						{
							process();
							System.out.print("y|n 입력:  ");
							String ex= scan.next();
							switch(ex)
							{
							case "y":
								System.exit(0);   // 종료해라
								break;
							case "n":
								break; 
							}
						}
						//process();  //여기서 호출 할 수 있어
						// return;
				
					}

}
