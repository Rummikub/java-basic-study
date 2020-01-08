// 3. 삼항연산자 이용
public class DAY3_스터디3 {
	class Solution{
	    String solution (String s){
	        int length = s.length();
	        int mid = length / 2;
	        return length%2==0 ? s.substring(mid-1, mid+1) : s.substring(mid, mid+1) ;  
	    // 																		Start	(자르는 숫자)
	        }

	    public void  main(String[] args){
	        Solution se = new Solution();
	        System.out.println(se.solution("power"));
	    }
	}

}
