/*
 * 		오버라이딩 (메소드의 정의를 바꾼다 )       - 수정을 하기 위함
 * 		======== 추상클래스 , 인터페이스
 * 		상속이 존재
 * 		메소드명 동일
 * 		매개변수 동일
 * 		리턴형도 동일
 * 		접근지정어의 확장
 * 		==============>  private <default < protected < public						
 *
 *			=> interface		I
 *				{
 *						int a ;								=> ERROR => public static final int a=10 (* 상수형은 값을 미리 줘야 함) 
 *						void display();									  => public abstract void display();      												// 자동지정
 *				}
 *
 *				public  A implements I
 *				{
 *						(public)	void display() {		=> ERROR = > default로 접근지정어가 축소되어있음  (public 을 추가해줘야 오류해결 )
 *							}
 *				}
 *
 *			상속이 안되는 클래스	:  종단 클래스  (품절된 클래스 = Final Class)
 *			public final class 
 *			상속의 예외 :  static, 생성자
 *
 *
 */
class Super
{
	public void display( ) { 
		System.out.println("Super: display() call");
	}
}

// 1.  Super 상속 
class Sub extends Super 
{
	/* 이 안에는 다음이 포함되어 있다.
	 * public void display( ) { 
		System.out.println("Super: display() call");
	}
	 */
	public void display() {
		System.out.println("Sub: display() call");
	}
}

//  2. 포함 클래스 ( 수정 없이 바로 출력할 경우 ) 
class Subs {
	Super su= new Super();      
}

// ***.  상속없이 상속 = 익명의 클래스
class Sub2 {
		Super su= new Super () {
			public void display() {
				System.out.println("Sub2:display() call");
			}
		};  //← !!!
}


 // 3. 제어 / 조립 
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();  // 2.의 경우가 더 효율적이다.
		sub.display();
	}

}
