package 데이터저장;
/*
 *  	프로그램 (언어) :  java. C, C+, C#, kotlin  
 *  
 *   -> 데이터 저장 , 데이터 제어, 화면 출력
 *   
 *  저장:  [1) 변수 2) 배열 :같은 유형의 데이터 저장 공간  3) 클래스 : 다른 유형의~ ] = 메모리에 저장 4)파일 5)RDBMS(오라클)공유 
 *    
 *  출력 :  DOS,  Window :  Application
 *  			브라우저 : Web Application
 *  			스마트 폰  : Mobile 												(depends on 화면 출력 방식) 
 *  
 *  1) 변수 
 *   (1) 저장공간의 크기 = 자료형 ( 데이터형 )  
 *         정수 저장 
 *         <byte : 1 byte  -128 ~127 ,short : 2 byte -32768~32767 > C언어 호환성 
 *          int : 4byte  -21억4천~21억4천 , long : 8byte
 *         변수 설정 - > 데이터 저장
 *        	 메모리크기 변수명 = 값;   						ex) byte b=10;  b=100 (이러면 b는 100이 됨)
 *         int kor=90 (값) -> 변경해서 사용 가능 (변수)
 *            ******** int / long 구분 10.20 .. 10L.10l          long a=10L, long b=10 ( int를 long에 넣어라)  , int ='A' ( 값 65)
 *        실수저장
 *        		float  (4byte)소수점 6자리  , double (8byte) 디폴트!  소수점 15자리
 *        	 	 float f=10.5 (ERROR)    ( 왜냐면 8바이트를 4바이트  플로트에 넣으려고 해서)
 *        		double d=10.5, 10.5d, 10.5D --- 실수형을 정수로 변환, 소수점 미만 절삭 int10.5+int20.5 = 30 / int(~)= 31
 *         문자 저장
 *         	char (2byte) - 0~65535 , 여러 문자 일 경우 => char[] / String "" ** 참조형 String (문자열일 경우)
 *         String name= "홍길동"
 *          논리 저장 (t/f)
 *           boolean b= true / false
 *   (2) 메모리에 이름 부여 = 문법 (식별자)  1.  알파벳, 한글로 시작 2. 숫자 사용 가능 3. 특수문자 가능 *임시파일4. 예약어 사용 불가
 */
public class 자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	}

}
