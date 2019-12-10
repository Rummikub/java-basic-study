/*			cast
 * 		형변환  (boolean은 제외) (int)"10" --x, 문자열은 정수화 안됨 단,Integer.paseInt("10") 
 * 																(String)10 -- x,   단, String.valueOf(10)
 * 		=====
 * 		Up  			c>='A'     => c>=65
 * 		Down		int  => char      ex) (char)65 그냥 출력하면  A대신 숫자가 나오기때문
 * 							double => int     ex) (int)10.5      
 * 
 * 							char, short, byte ==> 연산(int)
 * 
 * 							(double)10
 * 
 * 						byte<char,short<int<long<float<double
 * 
 * 						&& || !  ==> 논리 (true/false)
 * 							=> if 
 */
public class 이항연산자_논리연산자2 {  // 항상 조건이 두개가 붙는다

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//결과값 = boolean
		boolean b1=(6<7) && (7==7); // false
		//								true			true	==> &&
		System.out.println(b1);
		
		b1=(6>7) && (7==7); // false
		System.out.println(b1);
		
		b1=(6>7) || (7==7); //true
		System.out.println(b1);
		
		b1= (6<7)|| (7==7); // true
		System.out.println(b1);
		
		b1=(6>7) || (7!=7); //false
		System.out.println(b1);
	}

}
