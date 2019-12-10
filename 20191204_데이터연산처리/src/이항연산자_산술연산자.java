/*
 * 		산술연산자 (+,-,*,/,%) : 다른 뎅.터형을 사용했을 경우
 * 		1)int 이하 데이터형(byte,short,char) = 연산처리 => int 로바꾸면 자동형변화 byte를 써서 바꾸면 강제 형변화!
 * 			byte + byte => int
 * 			char + byte => int
 * 			short+byte+char => int
 * 
 * 			byte+int => int
 * 			short+char+int => int       					즉, 가장 큰 데이터형으로 바뀐다
 * 
 * 		   short+char+int+double => double  => String 
 * 								""+77 ==> "77"     - 숫자건 영어건 뭐건 간에 문자열로 받는  String이 double보다 더 큰 개념으로 사용된다.
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b=110;
		//byte c=20; 
		//byte d=(byte)(b+c);
		//System.out.println(d);
		//byte b=(byte)300;
		//System.out.println(b);
		//System.out.println(Integer.toBinaryString(300));
		/*
		 *  300
		 *  		1         00101100 ( 범위를 벗어나서 결국엔 뒤에서 8bit만 저장한다 ) = 32+8+4  뒤에서 N자리 만큼 절삭한다.
		 */
		int a=(10+20)*3;
		System.out.println(a);
	}

}
