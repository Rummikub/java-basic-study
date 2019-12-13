import java.util.Scanner;

/*
 * for: 반복문(반복횟수가 지정되어 있음)
 * 
 *   [일반 for]
 *   			형식)
 *   						for(초기값;조건식;증가식)
 *   								실행문장
 *   
 *  						=> 초기값=> 조건식 = 실행문장 => 증가식   ____ false일때 종료
 *  						
 *  						= 초기값   ==> 0
 *  						=	실행문장의 범위
 *  							====================> {} :한문장에는 굳이 필요 없지만 여러문장엔 필수
 *  						= 증가식	==> 1개씩 증가하는게 기본, 그이상도 가능
 *  						= 변수가 한개이상 / 조건도 여러개 합쳐서 걸 수 있음
 *  							for(int i=0, j=1;j<1=   &&   j>=1;
 *  						= for(int i=0; ....)  => 지역변수 i는 for문 안에서만 사용
 * 						변수선언
 * 						{
 * 
 * 						}
 *  
 *   [ 향상 for]  :     (JDK 1.5+)   --     배열,컬렉션(데이터베이스)
 *   
 *    ******메소드( 일반 메소드, 람다식(함수포인터):JDK1.8)
 */
public class 반복문1 {

	static public  void main(String[] a) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("i="+i);
	}

}
