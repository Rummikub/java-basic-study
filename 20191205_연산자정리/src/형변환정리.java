/* 네트워크 프로그램/ 데이터 프로그램을 짜기 위해 자바를 배운다
 * 	자동 형변환
 * 			--> int + double = double    ---- double로 변환
 * 			-->  char + int = int ---- int 변환
 * 			--> char c='A';
 * 				c>='A' && c<='Z'     ----- A=65  Z=90   === > char는 모든 연산 => int로 변경 
 * 
 * 			--> byte+byte = int
 * 			--> short+short=int
 * 			--> char+char=int
 * 	강제 형변환 : cast 연산자   --> 특히 down형변환 할때 예) int > char or double > int
 * 				int==> char
 * 			--> int a=65 ==> char b=(char)a;
 * 			--> char c=65;  (O) / int a=10.7(X)  / float f=10.7;(x)
 */
public class 형변환정리 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=(char)65.0;
		System.out.println(c);
		float f=10; 
		System.out.println(f);
		double d='A';
		System.out.println(d);
	}

}
