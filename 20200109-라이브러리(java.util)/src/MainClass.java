							/*StringTokenizer
							============= 문자열 나눠줄때 사용하는 클래스
							1) 객체단위로 전송
							2) 문자열 (0)
							 		id|pw|avatar					split ==> regex ( 정규식)
							 		
							 		1.hasMoreTokens() : 있는 개수만큼만 while문을 돌려라
							 		2.nextToken() 
							 							*/
import java.util.*;

/*class Info
{
	String id;
	String name;
	String pw;
	String sex;
	String addr;
	String tel;
}*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="admin|kim|1234|male|Seoul|1111-1111111";
		StringTokenizer st=new StringTokenizer(data,"|");    // default = 공백 ("")
		/*String id=st.nextToken();   // 1번째 토큰 = admin
		String name=st.nextToken();
		String pw=st.nextToken();
		String sex=st.nextToken();
		String addr=st.nextToken();
		String tel=st.nextToken();
		
		System.out.println("ID:  "+id);
		System.out.println("Name: "+name);
		System.out.println("Password: "+pw);
		System.out.println("Sex: "+sex);
		System.out.println(	"Address: "+addr);
		System.out.println("Tel: "+tel);*/
		//Info info=new Info(); 
		while(st.hasMoreTokens())  //  단어가 잘려있는대로 하나씩 가져와라   => 구분문자만 구분
		{
			System.out.println(st.nextToken());
		}
	}

}
