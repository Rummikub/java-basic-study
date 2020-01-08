/*
  		클래스의 종류
  		=========
  		1. 추상클래스 :  설계 => 구현하지 않은 메소드를 포함하고 있다
  									공통점을 모아두고 [작업 지시 ] => 해당 프로그램에서 구현 
  									1) 서로 다른 클래스를 연결
  									2) 여러개 클래스를 모아서 관리
  									3) 표준화 ( 독립적 사용 ) 
  			public abstract class ClassName
  			{
  					일반변수
  					int a=10;
  					구현된 메소드
  					public void display(){
  							~~~~
  					}
  					구현이 안된 메소드
  					public abstract int display() ;			
  						=> 미완성된 클래스 - 자신이 메모리 할당을 할 수 없다 (new를 사용할 수 없음, 생성시에는 반드시 구현한 하위클래스를 통해 생성이 가능)       
  			}  
  			예) 
  					public abstract class A
  					{
  							구현이 안된 메소드
  					}
  					public class B extends A
  					{
  							상속시에 반드시 구현해서 사용
  					}
  					
  					B b=new B();
  					A a =new A();  ( X)
  					A a=new B();   (표준)
  							===================> 클래스 객체 생성
  																				===========
  																							new 가 없다, 같은 생성자를 생성하지 않으면 = 추상클래스 or 인터페이스
  																							List list =new ArrayList()
  		2.인터페이스 [ 작업 지시 ] <= 추상클래스의 한 종류   / 長 : 클래스명 아무거나 쓸 수 있다 
  															서로 다른 클래스 연결
  															*표준화 작업 ( 구현은 틀릴 수 있음 ) 
  															여러개 관련된 클래스를 묶어서 제어
  				public interface Interface명 {
  						변수
  						int a=10;   =======> public static final int a=10;
  																=============
  																생략할 수 있음
  						구현 안 된 메소드
  						void display();   ==> public abstract void display ();의 생략
  																===========
  						public void display(); => public (abstract) void display();  						======인터페이스의 모든 메소드는 추상메소드
  				}
  				
  	활용 예=====> 라이브러리
  								Swing => 이벤트 처리
  								===============
  								컴포넌트
  								JButton 
  										=> JButton  => JButton, JMenu
  										=> ToggleButton => JRadioButton, JCheckBox
  										====================================
  												=> 처리 => interface : ActionListener
  															  => actionPerformed()
  										입력창
  											한줄
  												JTextField  = > JPasswordField
  											여러줄    
  												JTextArea => JTextPane 
  													=> 처리 => interface : ActionListener
  															  => actionPerformed()
  											목록출력
  												JTable  	=> MouseListener
  												JTree 	=> MouseListener
  												JList 		=>ItemListener
  												JComboBox  => ItemListener
  												
  												====================================== KeyListener
  													========
  													1) 자동 호출
  													2) 지정된 메소드
  								데이터베이스 => DB
  								Collection 
  		3. 내부클래스
  			=	멤버 클래스 : thread, 네트워크 사용시  / 자원 공유가 용이함  
  				public class A
  				{		O ,X  => 자원
  						class B
  						{
  						}
  				}
  			=	익명 클래스	: 상속없이 오버라이딩, 메소드 추가가 가능하다. A처럼
  					public class A
  					{
  							B b= new B() {
  								public void display() {}
  								public int plus () {}
  							};
  					}
  					public class B
  					{
  						public void display() {}
  					}
  			=	지역 클래스 : 메소드 안에 클래스 생성 
  					public class A
  					{
  						public void display() {
  							class B
  							{
  							}
  						}
  					}
  		4.종단클래스 : 더이상 확장 없는 클래스 ( 품절 ) 
 			public final class A
 				{
 				}*/
abstract class Ani{
	public abstract void walking();
	public abstract void eating();
	//// 다음 클래스에서 무조건 구현을 해줘야 한다
	public  void  setName() {
		System.out.println("");
	}
	/// 필요시에는 Override  ( 이미 구현되어있기 때문 ) 
}
class Human extends Ani {  // Ani안의 walking eating을 구현을 해줘야 된다 (Add unimplemented methods)

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("사람이 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("사람이 먹는다");
	}
	
	public void setName() {
		System.out.println("사람");
	}
	
	
}
class Dog extends Ani {

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("개가 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("개가 먹는다");
	}
	
}
class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");	
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("돼지같이 먹는다");
	}
	
}
public class MainClass3 {
 

	public static void main(String[] args) {
		Ani ani=new Human();
		ani.walking();
		ani.eating();
		ani.setName();
		
		ani = new Dog();  // 주소만 바꿔서 처리
		ani.walking();
		ani.eating();
		ani.setName();
		
		ani=new Pig();
		ani.walking();
		ani.eating();
		ani.setName();
	}
	//==> 관련된 객체를 모아서 하나의 클래스로 제어한다 ( 표준화가 된다) 
}
