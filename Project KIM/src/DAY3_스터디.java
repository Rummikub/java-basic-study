/*
Q.
단어의 가운데 글자를 반환하는 클래스 solution을 만드시오
(단어의 길이가 짝수라면 가운데 두글자를 반환)
예)  abcde     =>   	c    /     qwer	  =>   	  we


(Hint)
- 짝수와 홀수일 때를 구분할 것.
- 문자열 메소드 or 삼항연산자 활용.

 */

public class DAY3_스터디 {

	//1
 public class Solution{ 
		  String solution(String s) { 
			  
			  String answer="";
			  if(s.length()%2==0)
			  {
				  answer= s.charAt((s.length()/2)-1)+""+s.charAt(s.length()/2); 
				}
			  else
			  { 
				  answer= s.charAt(s.length()/2)+""; 
			  }
			  return answer; 
		 }
	 }

  public static void main (String[]args) { 
 //Solution se= new Solution();
 String s="abcdef";
 String answer="????";
 System.out.println("단어: " +s);
 System.out.println("답 : " + answer);


	  }
	  }
  
  
 