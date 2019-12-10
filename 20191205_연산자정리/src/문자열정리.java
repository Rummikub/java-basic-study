/*
 * String = 클래스 ,   이하 : 메소드  , 형변환이 안된다 고로!!  = 4byte (객체, 메소드둘다 )
 *  	String : 문자열 저장
 *  =======
 *  			기능
 *  			1) 문자열을 분리     substring()
 *  			2) 문자 찾기					indexOf(), lastIndexOf()
 *  														c:\javaDev\javaStudy
 *  			3) 문자 비교 				equals
 *  														equals IgnoreCase  -- 대소문자 구분 x
 *  			4) 공백문자 제거		trim()
 *  			5) 대소문자 변경		toUpperCase,toLowerCase
 *  			6) 모든 데이터형을 문자열로 변경 valueOf()
 *  			7) 문자의 갯수 			length()
 *  			9) 변경 						 replace, replaceAll
 *  	
 *  			String ==> char[]
 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s=   " Hello Java !!";  // 공백도 문자다 :12개
								//  012345
			System.out.println("글자수:"+s.length());
			System.out.println(s.substring(0,5));
			//5은 제외  (endIndex 는 -1이다)
			System.out.println(s.replace("l", "k"));
			System.out.println(s.toUpperCase());
			System.out.println(s=s.toLowerCase()); // s 값을 전체에서 변화 시킬 수도 있음.
			System.out.println(s);
			System.out.println(s.trim());
			// 이는변환 메소드 안에서만 변한 것이지 s변수 자체는 변화하지 않는다. 
			System.out.println(s.indexOf("l"));
			System.out.println(s.lastIndexOf("l"));
			
			String s1="Hello";
			String s2="hello";
			
			String res=s1.equalsIgnoreCase(s2)?"같다":"다르다";
			System.out.println(res);

	}

}
