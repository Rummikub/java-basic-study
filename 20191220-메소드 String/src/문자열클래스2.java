//로그인창을 만들어 보자 

//equals => return (boolean)
// 저장된 문자열이 같은지 확인하는 함수 
/*
 *  equals : 대소문자 구분 비교
 *  equalsIgnoreCase:  대소문자 구분 없이 비교
 *  
 *  startsWith : 시작문자가 같은 경우 (true)
 *  endsWith : 끝나는 문자열이 같은 경우 (true)
 *  contains : 문장에 문자열이 포함된 경우 (true)
 */
import java.util.Scanner;
public class 문자열클래스2 {
	// 맞는 아이디 로그인 조건
	static boolean isLogin(String id, String pw)
	{
		boolean bCheck=false;
		final String ID = "admin";
		// ID = "aaa";  (X) 상수이기 때문에 변하는 값을 넣을 수 없다
		
		final String PW="1234";
		if(id.equalsIgnoreCase(ID)	&& 	pw.equals(PW))      // : 대소문자 구분없이 Case를 Ignore
		//if(id.equals(ID)	&&	pw.equals(PW))
		{
			bCheck=true;
		}
		return bCheck;
	}
	// 입력값 - 실제 아이디와 맞는지 
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("ID 입력: ");
			String id=scan.next();
			System.out.print("비밀번호 입력: ");
			String pw=scan.next();
			
			boolean bCheck=isLogin(id,pw);
			
			if(bCheck==true)
			{
				System.out.println(id+"님 로그인 되었습니다");
				break; // while문을 끝내기 위함
			}
			else
			{
				System.out.println("아이디나 패스워드가 틀렸다  \n 다시 입력하시오");
			}
		}
	}
	
	public static void main(String[] args) {
       process();
	}

}
