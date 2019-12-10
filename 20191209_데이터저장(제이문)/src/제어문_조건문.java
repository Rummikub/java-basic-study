/*
 *  조건문 
 *  		= 단일 조건문
 *  		1) 형식
 *  			if ( 조건문)
 *  			실행문장
 *  				
 *  			if (조건문) ====> 1개이상의 실행문장이 있는경우 ({})
 *  			{
 *  			실행문장1 
 *  			실행문장2
 *  			}	
 *  
 * 			if(조건문)
 * 			실행문장1 ======> if 소속문장
 * 			실행문장2 ======> if와 관련 없는 문장
 * 		2) 조건문 처리하는 방법
 * 				=====
 * 					true/ false => 부정 연산자, 비교 연산자, 논리연산자
 * 
 * 		3) 실행 => 조건이 true =>  문장 수행
 * 								조건이 false=> 문장 수행을 하지 않는다
 * 			= 선택 조건문
 * 			= 다중 조건문
  *  1) 생략이 가능
  *  			1. import : 라이브러리 클래스를 불러온다
  *  									java.lang
  *  									========
  *  									System,String,Math
  *  			2. return : 모든 메소드는 return을 갖고 있다
  *  			3. 상속 :  모든 클래스(사용자정의)는 Object tkdthr 
  *  			4. 예외처리 : 모든 클래스는 예외처리를 갖고 있다
  *  				======
  *  					비정상종료를 방지하고 정상상태를 유지 ( 미리 에러는 방지하는 프로그램)
  */
import java.util.Scanner;
// import  => 이미 만들어진 클래스를 불러올 때 사용
// CBD : 컴포넌트 베이스
// 조립식 프로그램
// 다른 프로그램에 에러가 많이 난다 결합성이 높다는 용어를 사용한다
public class   제어문_조건문{
	
	// 예제  -- 정수를 입력 => 홀/짝
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력값을 받아 온다.
		 Scanner scan=new Scanner(System.in); 
		 System.out.print("정수 입력: ");
		 // 입력된 값을 저장
		 int num=scan.nextInt();
		 // 짝수 조건
		 if(num%2==0)
		 { 
			 System.out.println(num+"는(은) 짝수입니다.");
		 }
		 // 홀수 조건
		  if(num%2!=0) //  num%2==1 
		  { 
			  System.out.println(num+"는(은) 홀수입니다.");
		  }
		 
	}

}
