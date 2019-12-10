/*
 * 	변수 : 한개의 데이터를 저장 
 * 
 *		 1. 변수 선언
 *		2. 선언과 동시에 값을 입력
 *
 *				=====
 *				변수가 여러개 일때,
 *				int kor;
 *				int eng;
 *				int math;
 *
 *			=====> int kor,eng,math;
 *
 *			 초기값
 *			int kor=100;
 *			int eng=100;										합쳐서 코딩할 수도 따로 할 수도 있다!
 *			int math=100;
 *
 *			=====>  int kor100,eng=100, math=100;   줄 수를 절약 할 수 있지.
 *
 *			int kor,eng,math;
 *			kor=eng=math=100;						데이터형이 같을 때 묶어서 할 수 있다.
 */
//  변수명 ==>  의미를 부여 
public class 일주차정리1 {
		// 전역 변수 															
	public static void main(String[] args) {		// 지역변수
		// TODO Auto-generated method stub
		int a;
		a=10;  // initialize 초기값 설정해줘야 함.
		System.out.println(a);
		
		int kor,eng,math;
		kor=eng=math=100;
		
		System.out.println("kor= "+kor);
		System.out.println("eng= "+eng);
		System.out.println("math= "+math);
		
		String first_name="홍";															  // firstName(이게 권장사항)
		String last_name="길동"; 
		
		System.out.println("이름:" + first_name+last_name);    //  문자열 결합 
		/*
		 *  1.  클래스명 ==> 대문자 시작
		 *  2.  메소드명, 변수명 ==> 소문자 시작
		 *  3.  상수 => 전체 대문자
		 *  4. 들여쓰기
		 */
	}

}
