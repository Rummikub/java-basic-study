/* [ 변수의 종류와 초기값 ]
 *  변수 
 *  1) instance 										= new를 통해 메모리 만들 경우에 생성
 *  2) static 												= 컴파일 시점에   ; 메소드에서는 사용이 불가능 / 클래스에서 '만'사용
 *  ====================> 자동 초기화					
 *  3) 지역변수											= 메소드 호출 시 
 *  =====================> 반드시 초기화 해줘야 함
 */
class Data{ 
	// 클래스안에서는  '선언'만 할 수 있다 = '구현' X => 연산자, 제어문, 반복문, 메소드 호출   => 메소드 블록 { }
	int a; // 0
	float f; // 0.0F
	double d; // 0.0
	boolean boo=false; //false
	long l; //oL
	char c='\0'; //'\0'
	String s; // null  - 주소값이 없다는 뜻이다
	String ss="";    // 얘는 값이 있는 것으로! 
	// 기본 데이터형   --> 전역변수(멤버변수)는 지역변수와 달리 초기값이 자동으로 설정이 되더라
	
	static int aa;  // 0
}
public class MainClass2 {

	public static void main(String[] args) {
		System.out.println(Data.aa);
		/*
		 * Data dd=new Data(); // dd는 객체명 ( 변수는 한개의 데이터만 저장하는 것이고 객체는 여러개를 한번에 저장하는 것 =
		 * 내가 만든 클래스의 변수명과 동일 ) System.out.println(dd.a); System.out.println(dd.boo);
		 * System.out.println(dd.d); System.out.println(dd.l); System.out.println(dd.s);
		 * System.out.println(dd.ss); System.out.println(dd.f);
		 * System.out.println(dd.c);
		 */

	}

}
