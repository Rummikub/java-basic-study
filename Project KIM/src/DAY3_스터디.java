/*
Q.
�ܾ��� ��� ���ڸ� ��ȯ�ϴ� Ŭ���� solution�� ����ÿ�
(�ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ)
��)  abcde     =>   	c    /     qwer	  =>   	  we


(Hint)
- ¦���� Ȧ���� ���� ������ ��.
- ���ڿ� �޼ҵ� or ���׿����� Ȱ��.

 */

public class DAY3_���͵� {

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
 System.out.println("�ܾ�: " +s);
 System.out.println("�� : " + answer);


	  }
	  }
  
  
 