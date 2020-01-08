//2.  리턴형 변형
public class DAY3_스터디2 {
	class Solution{
	    String solution(String s){
	 
	        return s.substring((s.length()-1) / 2, s.length()/2 + 1);    
	    }

	    public  void  main(String[] args){
	        Solution se = new Solution();
	        System.out.println(se.solution("power"));
	    }
	}
}