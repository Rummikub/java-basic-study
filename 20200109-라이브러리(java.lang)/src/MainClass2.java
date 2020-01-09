// Object -- clone 사용 새로운 메모리를 가져오기 때문에 (b1=b2) !=b3
class Box implements Cloneable { 			 //Interface지만 기능은없고 모아주는 역할만 해서 구현하는 메소드가 필요 없음
	int a=10;						// new했을 때 호출하면 10,20을 출력하겠지
	int b=20;
	@Override   // Source > Override > clone  컴파일 예외처리 해줘야 사용 가능
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=b1;   //  같은 주소로 변경 ( 참조 )
		
		b2.a=100;
		b2.b=200;
		
		System.out.println("b1.a= "+b1.a);
		System.out.println("b1.b= "+b1.b);
		try
		{
			Box b3=(Box) b1.clone();    // Object를 리턴하기 때문에 형변환 잘 해줘야 함 ** 
			
			// 라이브러리는 모두 Object 니까 문자를 가져오고 싶다면 subString X , toString O
			
			System.out.println("b3.a= "+b3.a);
			System.out.println("b3.b= "+b3.b);
			
			b3.a=1000;
			b3.b=2000;
			
			System.out.println("b1.a= "+b1.a);
			System.out.println("b1.b= "+b1.b);
		}catch (Exception ex) {}

		
	}

}
