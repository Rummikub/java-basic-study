/*		=========================
 * 		1. 메소드 호출
 * 		2. 메소드 블록으로 접근
 * 		3. 블록안에 있는 모든 문장 수행
 * 		4. 메소드 호출 위치로 돌아간다
* 		=========================
*     
* 		게시판
* 			목록출력 return					데이터값이 있어서 받아서 처리한다
* 			= 매개변수:page   
* 			내용보기 return														====> 이 각각이 메소드다
* 			=매개변수: 게시물 번호  ; 배열의 첨자 / 리턴형: 클래스 
* 			글쓰기	 void       매개변수 많음
* 			수정하기 void  매개변수 많음
* 			답변달기 void 매개변수 많음
* 			삭제하기 void
* 			찾기  return
* 			= 매개변수: 검색어 / 리턴형 : 배열
* 			구구단 void     /  String으로도 가능한데 뭐가 더 편한지 생각해봐
* 			= 매개변수 : 단
* 			로그인 
* 			= id,pw / String (경우의 수가 3+)
* 
* 			[메소드 종류]
* 			set =  값을 넣는다  ex) void
* 			get  = 문자를 갖고온다  ex) return     											로또 예상번호 달라 =    return형 :     get     / 매개변수 :     데이터
* 			is = boolean, 존재여부    ex) boolean is login
* 
* 
* 			매개변수가 틀리면 다른 메소드다.
 */         

import java.util.Scanner;
public class 메소드4 {

		static void gugudan(int dan)
		{
			for(int i=0; i<=9; i++)
			{
				System.out.printf("%d*%d=%d\n",dan, i, dan*i);
			}
		}
		
		static String  gugudan2(int dan)   // String을 return형으로 받는다
		{
			String result=" ";
			for(int i=0; i<=9; i++)
			{
				result+=dan+"*"+i+"="+(dan*i)+"\n";
						
			}
			return result;
		}
		
		static void process() 
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력:  ");
		int dan = scan.nextInt();
		// 구구단 출력
		String res= gugudan2(dan);
		System.out.println(res);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			process();  
	}	 										// main에서는 전체를 관장하는 process만 출력하는 것
}
