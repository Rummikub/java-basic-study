/*// ㅇ 와아아
 * 		자바(클래스 여러개) => 한 파일 or 별도 파일
 * 		한개의 파일에서 사용
 * 		==============
 * 		class A
 * 		class C	
 * 		class D
 * 		public class B   => public 클래스가 하나 있어야 됨
 * 		==============   B.java
 * 		class A
 * 		class B
 * 		====== (A/B).java  => egal aber 메인이 있는 부분을 저장하는 것이 좋다
 */
class News{  // new 가 만든 변수 : title content reference date = instance 변수 ( 클래스 사용시 마다 공간 창출 )  
	String title;
	String content;
	String reference;
	String date;
	//static String site;  공통으로 쓰는  static 뒤에 붙는 변수 ( 공간이 1개 창출 ) 
	// 선언만 할 수 있는 영역   = 구현은 안된다 (예) 파일 읽어오기, 연산자, 제어문 ... 
}  // News 데이터형을 만들었다


// 조립!
public class MainClass {

	public static void main(String[] args) {
		// 저장 =>  통으로
		// 메모리 생성  ( n1 이라는 주소 안에 )
		News n1 = new News ();  
		n1.title="200만 돌파 초읽기 \"시동\", 좌석판매율 연일 상승..장기 흥행 시동";
		n1.content= "[김유진 기자] 영화 '시동'(감독 최정열)이 크리스마스 시즌 "
				+ "꾸준한 좌석판매율 상승세 속 이번 주 200만 돌파를 눈앞에 두며 흥행세를 이어가고 있다.";
		n1.reference= "엑스포츠뉴스";
		n1.date= "19.12.27";
		
		News n2= new News();
		n2.title="정우성, '증인' 이어 '지푸라기라도'서도 따뜻한 매력";
		n2.content=" 배우 정우성이 '지푸라기라도 잡고 싶은 짐승들(김용훈 감독)'에서 따뜻한 매력을 선보인다. "
				+ "'지푸라기라도 잡고 싶은 짐승들'은 인생 마지막 기회인 돈 가방을 차지하기 위해 최선을 다한다.";
		n2.reference="스타투데이";
		n2.date="19.12.27";
		// 출력
		System.out.println(n1.title);
		System.out.println(n2.title);

	}

}
