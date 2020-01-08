// 게시판 만드는 예시!
class Board{
	public void write() {
		System.out.println("Board:write(): 글쓰기");
	}
	public void content() {
		System.out.println("Board:content(): 내용보기");		
	}
	public void update() {
		System.out.println("Board:update(): 수정하기");		
	}
	public void list() {
		System.out.println("Board:list(): 목록 출력");		
	}
	public void find() {
		System.out.println("Board:find(): 찾기");		
	}
	public void delete() {
		System.out.println("Board:delete(): 삭제하기");		
	}
}
// '변경'이 가능해야 한다  ( 일부만 변경 ; 상속 / 전체 변경 ; 새로운 클래스 생성)
/*
 *  		내용 수정 : 오버라이딩 
 *  		===============오버라이딩의 조건 
 *  		1) 상속을 받는다
 *  		2) 메소드명 동일
 *  		3) 매개변수가 동일
 *  		4) 리턴형 동일
 *  		5) 확장 O, 축소X
 *  			( 접근 지정어 )
 *  			private < default < protected < public
 *  			
 *  			class A
 *  			{
 *  					void display (){ }
 *  			}
 *  			class B extends A
 *  			{
 *  					void display (){} (O)
 *  					protected void display() {} (O)
 *  					public void display(){} (O)
 *  					private void display () {} (X)
 *  			}
 */
class GalleryBoard extends Board {
	// 두개만 재정의 해주고 싶다! 
	
	public void write() {
		System.out.println("GalleryBoard:write(): 글쓰기+이미지 업로드");
	}
	public void list() {
		System.out.println("GalleryBoard:list(): 목록 출력+이미지를 출력");		
	}
	
}
class DataBoard	extends Board{

	@Override
	public void write() {
		System.out.println("DataBoard:write(): 글쓰기+파일업로드");
		super.write();
	}
	public void write ( int a )
	{
		System.out.println("DataBoard:write(int a)");  // 오버라이딩( 상속되어서 수정 ) 아니고 오버로딩 옆에 ▲ 가 없음
	}
	@Override
	public void content() {
		System.out.println("DataBoard:content(): 내용보기+파일다운로드");
		super.content();
	}
		
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GalleryBoard gb=new GalleryBoard(); gb.content(); gb.list(); gb.write();
		 * gb.update(); gb.delete(); gb.find();
		 * 
		 * DataBoard db=new DataBoard(); db.content(); db.list(); db.write();
		 * db.update(); db.delete(); db.find();
		 */
		Board gb= new GalleryBoard();
		//gb가 가지고 있는 메소드만 호출 可能
		/*
		 * 		생성자
		 * 		===== 
		 * 		상위 클래스 변수명 = 하위클래스 생성자();         => 추가가 없는 경우 호출하는 방법	
		 * 
		 * 
		 * 		변수 접근지점 
		 * 		==========		생성자를 잘 봐야 한다
		 * 		A a= new A();
		 * 		A b= new B();     A가 갖고 있는 것 만 B에서 호출 ( 오버로딩 된것 = 메소드 이름이 동일한 것 but 다른 함수다 )  = 생성자가 바뀔 때마다 메소드의 주소값만 바뀐다
		 * 		B c = new B();    B의 모든 것을 호출  				  
		 * 		  = > 어디까지 메소드가 호출되는지를 확인
		 * 		  => 상위 클래스가 하위 클래스의 '변수'+ '추가된 내용'에접근할 수 없다, '오버라이딩 된 내용'은 접근이 가능하다
		 */
		gb.content();
		gb.list();
		gb.write();
		gb.update();
		gb.delete();
		gb.find();
		
		gb=new DataBoard();   //  객체의 생성자만 바꾸어도 전체 상속 가능 *(방법2)  = 메소드 호출
		gb.content();
		gb.list();
		gb.write();
		gb.update();
		gb.delete();
		gb.find();
		
		/*
		 * 	<상위클래스로 하위클래스의 생성>
		 * 
		 * 	Board gb= new DataBoard()  ==> 변경된 메소드만 호출 가능
		 * 		int a			int a, b
		 * 	====================== 상속을 받았을 경우에만 사용가능
		 * 	=> 상위 클래스는 하위 클래스의 변수/ 추가된 메소드에 접근할 수 없다
		 * 	=> 변수 : 클래스 타입
		 * 	=> 메소드 : 생성자
		 * 
		 */
	
	}

}
