//2.  ������ ����
public class DAY3_���͵�2 {
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