/*  ArrayList사용법이 포함되어 있다!
 *  		객체 지향
 *  		1) 캡슐화
 *  				1. 접근지정어												Package  = Folder
 *  				=======-=-===-=--=-=-=-=-=-=-=--==-=--=-=-=-=--==-=-=-==-==-=-
 *  											자신의 클래스  			같은 폴더 			다른 패키지 	 		ALL
 *    				=======-=-===-=--=-=-=-=-=-=-=--==-=--=-=-=-=--==-=-=-==-==-=-
 *    				private								O								X								X					X
 *      			=======-=-===-=--=-=-=-=-=-=-=--==-=--=-=-=-=--==-=-=-==-==-=-
 *      			default								O								O								X					X
 *        			=======-=-===-=--=-=-=-=-=-=-=--==-=--=-=-=-=--==-=-=-==-==-=-
 *        			protected							O								O								X,O				X
 *        																											상속이 있는경우
 *          		=======-=-===-=--=-=-=-=-=-=-=--==-=--=-=-=-=--==-=-=-==-==-=-
 *          		public									O								O								O					O
 *            		=======-=-===-=--=-=-=-=-=-=-=--==-=--=-=-=-=--==-=-=-==-==-=-
 *            
 *            			=>  클래스 : public class className :  부품 => 연결해서 사용
 *   					=> 변수		: private int a; => 데이터 보호
 *   					=> 메소드 	: 메소드를 통해 클래스와 클래스를 연결
 *   											public 리턴형 메소드명() { }
 *   					=> 생성자	: 연결 => 메모리 할당
 *   											public 클래스명() { }
 *   					=> 변수는 은닉화 => 메소드를 통해 접근하는 방식   ==== getter setter
 *   
 *    		2) 재사용 기법
 *    			1. 상속 (is ~a) : 기존의 클래스 모든 내용을 받아 재정의 해서 사용 
 *    										=> 자바는 단일 상속만 지원함
 *    										=> 형식
 *    												public class MyWindow extends JFrame
 *    																								======
 *    																								상속기호 ( 확장한 클래스 )
 *    										=> 상속은 모든 내용을 받아서 확장
 *    												*** 예외 : 생성자. static ( 사용은 가능 ) 
 *    		 	2. 포함 (has ~a) : 클래스를 있는 그대로 갖다 씀
 *    											public class MyWindow
 *    											{
 *    													JFrame f= new JFrame();
 *    											}
 *    							=> 기능변경, 기능 추가, 데이터 추가가 있는 경우  = 상속 is a 
 *    							=> 있는 그대로 사용 = 포함 has a
 *    
 *    				super ( 상속 받은 상위 클래스 )
 *    				this ( 해당 클래스 )   = 변수 충돌 안되면 생략
 *    			3. 상속시 ( 클래스 비교 ) 
 *    				=> 상속을 내리는 클래스가 다르다 
 *    				=> 형변환이 존재  
 *    				=> ~이다라는 과정이 성립  ( 상위 클래스 대입이 가능)  왼쪽편 >= 오른쪽편
 *    
 *   			  인간
 *   			     ↑
 *   			======
 *   			|			| 
 *   		남자		여자   = 서로 다른 클래스여아 한다. ( 즉, 크기 비교가 불가능 )
 *   
 *   		남자 man =new  남자();		=> 남자는 남자다
 *   		여자 woman = new 여자();	=> 여자는 여자다
 *   		
 *   		인간 human = new 남자(); => 남자는 인간이다
 *   		인간 human= new 여자(); => 여자는 인간이다
 *   			
 *   		남자 man= (남자) new 인간(); => 인간은 남자다.( X)   형변환 이유= 최상위 클래스 Object가 기본값이기 때문
 *   		여자 woman= new 남자(); => 남자는 여자다.( X)            
 *   
 *   		==> 상속을 내리는 클래스는 공통점을 갖고 있음 ( 추상화 )\
 *   \
 *   3. 다형성 : new / 오버로딩 - modify/오버라이딩
 */
class Human {
	int age;
 	String name;
 	public Human() {
 		System.out.println("Human () Call...");
 	}
}
/*
 *  		상위 클래스 ( 상속을 내리는 클래스 ) : super,  부모, Base 클래스
 *  		하위 클래스 ( 상속을 받는 클래스 ) : sub, 자식, 파생 클래스
 *		
 *			=> 기존의 클래스의 모든 내용을 가지고 와서 확장하는 내용
 *			=> 자바의 클래스는 Object 상속을 갖고 있다 ( Object :  자바의 최상위 클래스)
 *			=> static, 생성자는 상속을 할 수 없음
 *			=> 목적은 중복된 코딩을 방지하기 위함 
 *				 재사용을 목적으로 만듦
 *			=> 상속을 내리는 클래스가 항상 큼.   														상속= 재사용=검증 받은 클래스라는 뜻 => 유지보수 SM
 */
 class Sawon extends Human {
	 	String loc;
	 	String dept;
	 	
	 	public Sawon() {
	 		System.out.println("Sawon() Call....");
 }

	public static void main(String[] args) {
			//ArrayList<String> list=new ArrayList();  //제네릭스 : < > 를 통해 어떤 return값을 받을지 지정한다
			//list.add("홍길동");
			
			//String name=  list.get(0); // 뭘 집어넣을지 몰라서 Object 를 return형으로 잡아놨음 -> (  ) 형변환을 해줘야 한다.
			// Object[] arr= {1,2,3,10.5,"aaa",'A'};  = 오류가 나지 않는다. ( 후에 변수를 쓰려면 형변환 해줘야 되니 지양 )
			// int a=(int ) arr[0];
			
			Sawon s= new Sawon();
			s.age=30;
			s.name="홍길동 ";
			s.loc= "서울 ";
			s.dept = "HR";
			
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.loc);
			System.out.println(s.dept);
	}

}
