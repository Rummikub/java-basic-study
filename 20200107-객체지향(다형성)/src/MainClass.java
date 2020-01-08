// 			오버로딩
/*		===========
 * 		한개의 클래스에서 
 * 		같은 이름의 메소드를 호출
 * 		매개변수가 다르다 (개수, 데이터형이 다르다)
 * 		리턴형은 관계없다
 */


/*
 * 		byte < char/short < int < long < float  < double
 * 		====================> "숫자형"은 변환 된다
 *			String, boolean =======> 자동 변환 안된다
 */
class Calc
{
		// 메소드 이름은 같지만 변수가 다 다르니까 구현이 된다
		public void display(int a)
		{
				System.out.println("a= "+a);
		}
		public void display (int a, int b, int c )
		{
			System.out.println("display(int a, int b, int c) call");
		}
		public void display (float a, int b, int c )
		{
			System.out.println("display(float  a, int b, int c) call");
		}
		public void display (double a, int b, int c )
		{
			System.out.println("display(double a, int b, int c) call");
		}
		public void display (double a, double b, double c )
		{
			System.out.println("display(double a, double b, double c) call");
		}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Calc 객체 생성 ( static이 아니라서 저장이 안됐기 때문)
		Calc c =new Calc();
		c.display(10,10.5,'A');  // 매개변수의 데이터형이 달라도 , 작은 데이터형 (값)이 들어가면 근사치로 출력 int >char
	}

}
