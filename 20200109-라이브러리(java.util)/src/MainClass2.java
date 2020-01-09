import java.util.*;
//지능형 웹 => 데이터분석
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String data="Java Oracle HTML CSS JavaScript JSP Spring Kotlin";
			StringTokenizer st=new StringTokenizer(data);  // 기본값이 공백이라서 공백부분을 기준으로 잘라낸다.
			while(st.hasMoreTokens())  
			{
				System.out.println(st.nextToken());
			}
	}

}
