// 3. ���׿����� �̿�
public class DAY3_���͵�3 {
	class Solution{
	    String solution (String s){
	        int length = s.length();
	        int mid = length / 2;
	        return length%2==0 ? s.substring(mid-1, mid+1) : s.substring(mid, mid+1) ;  
	    // 																		Start	(�ڸ��� ����)
	        }

	    public void  main(String[] args){
	        Solution se = new Solution();
	        System.out.println(se.solution("power"));
	    }
	}

}
