//% => 나머지 연산자
// 연산자=> 형변환 
/*
 *  					산술 : /,%      
 *  					정수/정수=정수 --> 정수/실수=실수
*/
public class 이항연산_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=30; double b=4.0; double c=a/b; System.out.println("c="+c); // 0으로 나눌 수
		 * 없다의 증명
		 * 
		 * // 나머지 int d1=5%2; int d2=-5%2; int d3=5%-2; int d4=-5%-2;
		 * System.out.println("d1=" +d1); System.out.println("d2=" +d2);
		 * System.out.println("d3=" +d3); System.out.println("d4=" +d4); // 34567
		 */			
		/*
		 * int e=369;
		 * 
		 * int h100=e/100; int h10=(e%100)/10; int h1=e%10;
		 * System.out.println("100자리:"+h100); System.out.println("10자리:"+h10);
		 * System.out.println("1자리:"+h1);
		 */
			
			String s=100+10.5+""+'A'+10f+100L;
			// 110.5+"" => "110.5"+'A' => "110.5A" +10
			//" 10.5A10" + 100 => 10.5A10100
			
			System.out.println(s);
	}

}
