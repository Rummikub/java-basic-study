// String : 문자열을 제어
/*
 *   java.lang => import를 생략할 수 있다
 *   문자열을 저장하는 방법
 *   		1)	 String 변수명 = " Hello Java ";
 *   		2) 	 String  변수명 = new String (" ");   같은 문자열 => 별도로 저장
 *   														===
 *   														새로운 메모리에 저장
 *   
 *   String 에서 제공하는 기능
 *   1)  equals : 저장된 문자열 일치 여부  (true/false)
 *   			ID , PW ; 로그인( 대소문자 구분)
 *   			문자열은(==)을 사용하면 안됨.
 *   
 *   		String s= " Hello ";
 *   		String s1= " Hello" ;   				// 주소값이 같으니까 비교가 됨
 *   		String s2= new String ("Hello");
 *   			if (s==s1)  true    (s1==s2) false
 *   => 그러니까 s.equals(s1) 이걸 써라
 *   
 *   => 원형
 *   			boolean equals(String data) 
 *   
 *   2)  substring : 문자열을 자를때
 *   			String s = "0123456789";
 *   			substring(3)   =>3456789
 *   			String s= "112분,15세이상관람가"
 *   			substring(0,3)   => " 112"
 *   									== end-1     === > 012				
 *   			substring(int start)
 *   			substring( int start, int end)
 *   3)  length  : 문자열 개수
 *   		String s="Hello 홍길동";
 *   4)  trim : 좌우의 공백문자 제거
 *   		String s="Hello Java";
 *   						=> s.trim().length
 *   5)  startsWith, endsWith
 *   			; 시작문자열이 같을 떄, 앞글자/뒷글자가 같은 것을 찾아라   ex) 검색기
 *   			startsWith("자바")
 *   6)  indexOf, lastIndexOf
 *   		문자의 위치( indexOf: 앞에서, lastIndexOf: 뒤에서)
 *   		String s="Hello Java";
 *   		s.indexOf('a') =  7
 *   		s.lastIndexoOf('a') = 9
 *   7)  split
 *  		String s="이병헌, 하정우, 수지, 전혜진, 마동석"  
 *  		String [] names= s.split(,);
 *  	 	정규식  ( ip긁어오는 법)
 *  		=====
 *  				211.238.142.181
 *  				211.238.142.180
 *  				211.238.142.1
 *  				211.238.142.0
 *  				211.238.1.1
 *  				[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3}      = 숫자 0부터 9까지 / 숫자 한자리부터 세자리까지
 *  /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])   = email정규식
 *   8)  toUpperCase, toLowerCase   : 대/소문자 변환
*				String s="Hello";
*				s.toUpperCase()		==> HELLO
*				s.toLowerCase() 		==> hello
 *   9) replace,replaceAll    ===> 정규식
 *   							String s="113분"
 *   							s.replaceAll("[^0-9]","")  ==>113     			^의 의미: 제외한
 *   							s.replaceAll("^[0-9]","")   								 ^[ 의 의미 : 숫자로 시작하는
 *   							s.replaceAll("[0-9]$","")									]$의 의미 : 숫자로 끝나는   
*   							s.replaceAll("[^가-힣]","") 
 *   							s.replaceAll("[^A-Za-z]","") 
 *   		=======
 *   			변경 ==>   String s="Hello Java"
 *   									s.replace('a','b') ="Hello Jbvb"
 *   
 *   10)  contains ()  : 포함된 문자를 찾는 경우
 *  
 */
import java.util.Scanner;
public class 문자열클래스 {
	
	static String[] autoComplate(String data)
	{
		String[] ss= {
				"자바와JSP","자바 프로그래밍", "스프링 5","Ajax와 JSP","리덕스와 리액트",
				"자바와 오라클","MVC 구조","코틀린과 안드로이드","코틀린 프로그램","스프링 데이터",
				"혼자 배우는 자바","지능형웹 프로그램","웹 프로그램","자바 웹프로그램","오라클 자바"
		};
		String[] findData= new String[10];
		int j=0;
		for(int i=0;i<ss.length; i++)
		{
			if(ss[i].contains(data))
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String data=scan.next();
		
		String [] fd=autoComplate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}
		
		
	}

}
