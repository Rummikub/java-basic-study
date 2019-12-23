import java.util.regex.Matcher;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class 메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String data = "버섯으로 관자 느낌 내는 방법!  새송이버섯간장버터구이 만들기";
			// 문자 개수  =>  * 공백도 포함
			System.out.println("문자 개수:  "+ data.length());
			//문자 자르기 = substring(0) _  중간에서부터 끝까지 자를때 쓰는 방식, substring(2,3)_자르는 시작점, 몇칸까지
			int n=data.indexOf("!");
			System.out.println(n);
			String fData=data.substring(0,data.indexOf("!"));
			System.out.println(fData);
			String lData=data.substring(data.indexOf("!")+1);
			System.out.println(lData.trim());
			// => 그러나 글자수를 매번 세야한다는 단점이 존재함
			
			int a=10;
			int b=20;
			double d=10.5;
			// 102010.5  		==> 번호  => 201912231, 201912232, 201912233
			String sss=a+""+b+""+d;
			System.out.println(sss);
			sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);
			// 클래스 + 변수 이렇게 선언 안했네?  static mehod = value 함수
			// valueOf ===>  모든 데이터형을 문자로 변호나해주는 함수 
			System.out.println(sss);
	}

}
