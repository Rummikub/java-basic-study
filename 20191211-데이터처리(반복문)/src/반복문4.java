//   ==> 문자 ==> charAt(0)     -- 글자 포함된 것이 몇개인지 찾는 메소드
// String s="abcdefghijklmnopqrstuvwxyz"

public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s= " theFaskInKUVzqfza";
			System.out.println("s= "+s);
			
			int  i=0;     				// 개수를 세니까 0에서 시작
			int count=0; 				// a가 몇개인지 세보자
			while (i<s.length())    //  총 개수가 몇개인지 확인해주는 메소드    * 자바는 0에서 시작, 하나를 빼줘야한다
			{
				 System.out.println((i+1)+"번째 문자:  "+s.charAt(i));
				 char c=s.charAt(i);
				 if( c=='a' || c=='A')
					 count++;
				 i++;
			}
			
	}

}
