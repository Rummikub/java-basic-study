/*	 		[   자동으로 만들어 주는 3개 :  		import-java.lang       void - return			 default 생성자    ]
 * 			
 * 			변수의 발전사항 =========>    클래스 ( 변수, 변수+메소드, 메소드)
 * 																					=====
 * 																					~VO  , ~DTO       
 * 	 예) RecipeVO, MovieVO, MusicVO     :  한번에 모을 수 있는 데이터만 ! 따로 저장
 * 																					~Manager, ~Service, ~DAO
 * 			데이터베이스 == [	변수=> 배열 => 구조체	=> 클래스 => 파일 =>  RDBMS  (오라클)      ]
 * 			
 * 			자바 클래스 구조 ( 구성요소 : 변수 + 메소드 + 생성자 )
 * 																								==	==
 * 		*	변수로 사용이 가능한 것 : 단일변수 => int year,month...
 * 																		클래스		 => String name...     	JButton b1,b2...    => 사용자 정의 데이터형
 * 																		배열 			=>  
 * 				=> 컴포넌트 베이스 
 * 					예) 컴퓨터구조 
 * 								CPU, 메모리, 하드 디스크 ... ( 컴포넌트 :  기능을 낱개로 수행 ) 
 * 
 * 			class  ClassName
 *		 	{
 *				======클래스만 가지고 있는 변수 =====	전역변수 ( 다른 클래스에서도 가져다 쓸 수 있음)
 *				=> 메모리에 따로 저장되는 변수	( instance )  => new //  heap에 저장
 *				=> 공유하는 변수 (static )   => 메모리 공간이 한개 // 자동저장
 *				===============================
 *				생성자 함수 : 전역변수의 초기화  ==> 한번만 호출, 객체생성될 때 처음으로 호출
 *				윈도우, 네트워크, 데이터베이스
 *				클래스명과 동일하고 리턴형이 없다
 *				==> 만약에 생성자가 없는 경우에는 JVM이 자동으로 생성 (default 생성자)
 *				===============================
 *				메소드 : 기능 수행
 *				===============================
 *		 	}
										 *The Queen's Corgi (2019)
								
										평점9.1/10
										애니메이션/코미디/가족
										2019.12.24 개봉
										82분, 전체관람가
										(감독) 벤 스타센, 빈센트 케스텔루트
										(주연) 심규혁
 */
class MovieVO{ 																				
	// instance  변수 => 메모리에 저장되는 시점 => new사용 ( 새로운 메모리를 만들 때 따로 주소가 생성됨 )   
	 // 사용자 지정 4byte
	
			// class MovieVO   사용자지정 클래스 데이터형
	String title;
	double score;
	String genre;
	String regdate;
	int time;
	String grade;
	String director;
	String actor;
}
public class MainClass {

	public static void main(String[] args) {
		
			// 메모리 저장 => 호출 
			MovieVO m1=new MovieVO();						// new = 메모리 크기 확인 後 메모리 생성
			m1.title="The Queen's Corgi (2019)";
			// (.) = 메모리 주소 접근 연산자 
			MovieVO m2=new MovieVO();
			m2.title="천문: 하늘에 묻는다 (2018)";
			MovieVO m3=new MovieVO();
			m3.title="캣츠 (2019)";
			
			MovieVO m4=m3;     // 주소값이 같아졌으니 내용이 대체된다 같은 주소에서 제어하고 있으니까.
			m4.title= "시동(2019)";
			
			System.out.println("m1:  "+m1);
			System.out.println("m2: "+m2);
			System.out.println("m3:  "+m3);
			System.out.println("m4: "+m4);
	
			System.out.println("저장된 영화제목 출력: " );
			System.out.println(m1.title);
			System.out.println(m2.title);
			System.out.println(m3.title);
			System.out.println(m4.title);
			
			
			// 출력을 더 간단히 하려면 ( 배열 + for문 )
		  MovieVO[] vo= {m1,m2,m3,m4};
		  for(int i=0; i<vo.length;i++)
		  {
			  System.out.println(vo[i].title);
		  }
	}
	
}
