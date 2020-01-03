/*
 * 	클래스의 구성요소
 * 	======================
 * 	변수( 전역변수, 멤버변수 )
 * 	=> 다른 클래스에서 사용 가능
 * 	=> 메모리에서 해제되는 시점이 프로그램 종료시
 * 		(메모리 =>  heap) 
 * 	======================
 * 	생성자 : 멤버변수의 초기화      ==> 자동 로그인 처럼 가장 먼저 호출되는 함수
 * 	특징 ) 	
 * 			1. 클래스명과 동일
 * 			2. 리턴형이 없다 (void는 리턴형)
 * 			3. 생성자는 여러개를 만들 수 있고, 사용하지 않을 수도 있다 => JVM이 자동으로 생성
 * 			4. 오버로딩을 지원
 * 				======
 * 				1) 한개의 클래스 안에서 같은 이름의 메소드를 여러개 사용
 * 					=====-------
 * 				2) 매개변수가 다르게 만들어져야 함 ( 데이터형 혹은 개수가 틀리면 다른 메소드로 인식)
 * 				3) 리턴형은 관계 없음 
 * 						void display()
 * 						int display()      =>  이 경우는 오버로딩 x, 같은 메소드로 인식
 * 						int display(int a)
 * 				4) 기능이 같다
 * 						plusInt(int a, int b)
 * 						plusDouble(double d1, double d2)
 * 			5. 상속 예외 조건 (static, 생성자)
 * 	======================
 * 		==> 명령문의 집합 => 관련된 명령문 모아서 처리 (구조적 프로그램) 
 * 	메소드 : 멤버변수를 활용 => 기능
 * 				=	연산처리 + 제어문 처리
 * 					=> 사용자 요청을 처리 
 * 	======================
 */
public class MainClass {
	String name;
	String sex;
	int age;

	// 초기화 (생성자) => MainClass mc=new MainClass() => 윈도우, 네트워크, 데이터베이스
	public MainClass() {
		name = "심청";
		sex = "여자";
		age = 25;
	}

	// 매개변수를 가지고 있는 생성자
	public MainClass(String name, String sex, int a) {
		// 지역변수와 멤버변수가 동일 => 지역변수가 우선적용됨
		System.out.println("this= " + this);
		this.name = name; // this 클래스의 변수를 가져와라
		this.sex = sex;
		this.age = a;
		// MainClass.this; new 메모리 할당을 할때 this는 자동으로 생성한다
		// 자신의 객체 주소 => this => 반드시 메소드 안에서만 사용가능
	}

	public static void main(String[] args) {
		// static이 아닌 변수는 저장공간을 별도로 만들어 저장 (new)
		
		  MainClass mc1 = new MainClass("이순신", "남자", 30); // -> 객체 사용
		 
		System.out.println("mc1= " + mc1);
		System.out.println(mc1.name);
		System.out.println(mc1.sex);
		System.out.println(mc1.age);
		
		  MainClass mc2 = new MainClass("심청", "여자", 25);
		 
		System.out.println("mc2= " + mc2);
		System.out.println(mc2.name);
		System.out.println(mc2.sex);
		System.out.println(mc2.age);
		
		  MainClass mc3 = new MainClass("가나다", "남자", 65);
		 
		System.out.println("mc3= " + mc3);
		System.out.println(mc3.name);
		System.out.println(mc3.sex);
		System.out.println(mc3.age);

		System.out.println(new MainClass("박문수 ", "남자 ", 10).name);  // -> 객체  사용 x
		System.out.println(new MainClass("박문수 ", "남자 ", 10).sex);
		System.out.println(new MainClass("박문수 ", "남자 ", 10).age);
		/*
		 * mc2.name="aaa"; // this -200
		 * 
		 * 생성자는 호출시에 반드시 new 붙여야 함 new MainClass();
		 * 
		 * System.out.println(mc.name); System.out.println(mc.sex);
		 * System.out.println(mc.age);
		 */
	}

}
