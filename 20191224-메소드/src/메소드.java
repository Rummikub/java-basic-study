/*이 안에 콜바이 벨류가 있다
 * 
 * 
 *  메소드
 *  1) 형식
 *  		리턴형 메소드명 (매개변수 최대 3개) = 선언부
 *  		{
 *  			기능 구현부
 *  			return 결과값       => 리턴형과 결과값은 같은 데이터형이어야 함
 *  		}
 *  		==> 리턴형이 없는 경우 ==> return을 생략함
 *  		==> 모든 메소드는 종료하기 위해 반드시 마지막에 리턴을 사용해야 한다
 *  					예외) => 조건문을 사용해서  return 사용할 수 있음
 *  					=> return문 아래는 어떤 문장도 사용이 불가능 												; 종료를 의미하기 때문
 *  		display(10);			
 *  		static void display(int a)
 *  		{
 *  			System.out.println(a);
 *  			return;
 *  			System.out.println(a+1);							// 오류
 *  		}
 *  
  *  		display(10);			
 *  		static void display(int a)
 *  		{
 *  			System.out.println(a);
 *  			if(a==10)											// 중간에 조건문을 걸어서 return주면 중간에 종료하기 때문에 오류나지 않는다
 *  				return;
 *  			System.out.println(a+1);						
 *  		}
 *  
 *  2)리턴형 : 기본형, 클래스, 배열
 *  		int method()
 *  		Movie method()  
 *  		int[] method()
 *  		결과값이 없는 경우 => void
 *  
 *  3) 매개변수 : 사용자 요청값
 *  		=> 3개 이상이면 묶어서 요청 => 배열, 클래스
 *  			ex) 회원가입 ( 클래스 )
 *  					게시판 글쓰기 ( 클래스 )
 *  
 *  4)매개변수 전송법
 *  call by value :  기본형, String
 *  	============ 메모리를 따라 생성 ( 복제값)
 *  call by reference :  배열, 클래스
 *   ============= 같은 주소를 이용해 값을 변경
 *  
 *  5)호출
 *  				메소드명()
 *  				메소드명(10,20)
 *  				=========== return이 없는 경우
 *  				데이터형 변수 = 메소드()
 *  				데이터형 변수 = 메소드(19,20)
 *  			** 모든메소드는 수행이 종료 후 다시 호출한 위치로 돌아온다
 *  			** 메소드를 여러개 호출시 => 한개의 메소드가 수행을 종료해야 다음 메소드를 호출할 수 있다   = 동기화 방식   =이거 해결하려고 쓰레드 쓰는 거래
 *  
 */
// 매개변수 전송 -> call by value   [ 메모리가 따로 생성되기 때문에 서로 값을 영향받지 못해 ]
public class 메소드 {
	static void swap(String a, String b)
	{
		System.out.println("prior swap:a=" + a + "b= "+b);
		//변경
		String temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a=" + a + "b= "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hi";
		String b="Java";
		swap(a,b);
		System.out.println("main:a=" + a + "b= "+b);
	}
// swap(int a, int b)  매개변수들은 지역변수라 각각의 메모리가 생성됨 
	// main() 에서 swap(a,b)를 호출했으므로 별도의  a,b가 생겼다 그러므로 변경사항이 없음
}
