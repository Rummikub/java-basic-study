/*
 *  		자바에서 제공하는 라이브러리
 *  		=> 자바
 *  			1) 사용자 정의
 *  			2) 라이브러리
 *  			==========		1) + 2)  ==> 조립 
 *  			자바 제공
 *  			======
 *  			java.lang   : import 하지 않고 사용   ( 자동 호출 )
 *  				= String : 문자열
 *  					1)equals      ( == ) X
 *  					2)trim()
 *  					3)indexOf() lastIndexOf()
 *  					4)length() 
 *  					5)startsWith, endsWith
 *  				*	6)subString()
 *  					7)split()
 *  					8)valueOf()
 *  				= System : 프로그램 종료, 입/출력,  GC
 *  					1) gc
 *  					2) exit
 *  				= Object :  모든 클래스의상위 클래스	
 *  					1) clone() : 복제
 *  							A a = new A();
 *  							A b = a ; 
 *  						 	A c = a.clone();
 *  					2) finalize() : 소멸자
 *  				= Math : 수학
 *  					1) random()
 *  					2) ceil()
 *  				= StringBuffer : 문자를 임시 공간에 저장 
 *  			*		1) toString()  .... 경로명?
 *  					2) append() : 문자열 결합
 *  				= Thread
 *  			java.util		: 유용하게 사용할 수 있는 클래스의 집합
 *  				= Scanner  ( 잘 안씀 ) 
 *  				= StringTokenzier 
 *  				= Collection (배열 )
 *  				= ArrayList, Vector , LinkedList, Map : 자료구조 
 *  				  ========										====
 *  				자료구조 : 메모리 저장 관리
 *  				= Thread
 *  			java.io
 *  				= Reader, Writer
 *  				= InputStream, OutputStream (1byte)
 *  				= File
 *  				= ObjectInputStream, ObjectOuptupStream
 *  			java.net
 *  				= Socket
 *  				= URL;
 */
class  My
{

	public My() {
		System.out.println("My() 생성자 함수 호출... (객체생성) ");
	}
	public void display() {
		System.out.println("My: display() Call.....");
	}
	@Override  // Source > implements
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		System.out.println("객체 소멸 ");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My m=new My();  // 생성
		// 활용
		m.display();
		// 소멸
		m=null;
		System.gc();  // 메모리 회수
		
	}

}
