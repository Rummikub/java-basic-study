/*
 * 		객체지향 프로그램 
 * 		=============
 * 		1) 구성요소
 * 			=======
 * 				변수 :  기본형, 사용자 정의 => 클래스 전체에 사용할 수 있는 변수
 * 				=> 클래스 : 데이터형
 * 			=======
 * 				생성자 : 필요시에만 사용(초기화)
 * 				리턴형  x , 클래스 이름과 동일
 * 					=> 다른 클래스에서 사용 가능 (public)
 * 			=======
 * 				 메소드 : 기능 수행(요청처리)
 * 								=======
 * 									1. 연산자
 * 									2. 제어문
 * 						=> 다른 클래스에서 사용 가능 (public)
 * 				
 * 		2) 접근지정어																															  by 사용가능범위
 * ========================================================================
 * 						자신의 클래스에서만   같은 폴더(패키지)안에서	다른 폴더에서(상속) 어디든 상관없이 접근
 * ========================================================================
 *  private							O							X														X							X
 *========================================================================
 *  default							O							O														X							X
 *========================================================================
 *  protected					O							O														O							X													
 *======================================================================== 
 *  public							O							O														O							O
 *========================================================================
 * 		3) 객체지향 프로그램 작성 
 *(1) 변수(멤버변수)
 *		 접근지정어 데이터형 변수명 ;
 *	(2) 생성자
 *		 접근지정어 클래스명(){}
 *(3) 메소드 : public
 *		 접근지정어 옵션 리턴형 메소드명 (매개변수..){}
 *		======  	===   ------  기본형, 클래스명, 배열, void
 *private			static
 *protected		abstract
 *public
 *default
 *
 *		private	변수 : 메모리에 저장(쓰기) = set
 *									저장된 데이터 읽기   = get
 *				
 *					private String id;
 *									=> getId(),  setId()
 */
class Movie
{
	private int mno;
	String title;
	protected String actor;
	public double score;
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  저장
		Movie m=new Movie();
		m.actor="";
		m.score=4.5;
		m.title="";
	
	
	}

}
