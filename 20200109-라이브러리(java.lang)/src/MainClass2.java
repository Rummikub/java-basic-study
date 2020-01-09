// Object -- clone ��� ���ο� �޸𸮸� �������� ������ (b1=b2) !=b3
class Box implements Cloneable { 			 //Interface���� ��������� ����ִ� ���Ҹ� �ؼ� �����ϴ� �޼ҵ尡 �ʿ� ����
	int a=10;						// new���� �� ȣ���ϸ� 10,20�� ����ϰ���
	int b=20;
	@Override   // Source > Override > clone  ������ ����ó�� ����� ��� ����
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=b1;   //  ���� �ּҷ� ���� ( ���� )
		
		b2.a=100;
		b2.b=200;
		
		System.out.println("b1.a= "+b1.a);
		System.out.println("b1.b= "+b1.b);
		try
		{
			Box b3=(Box) b1.clone();    // Object�� �����ϱ� ������ ����ȯ �� ����� �� ** 
			
			// ���̺귯���� ��� Object �ϱ� ���ڸ� �������� �ʹٸ� subString X , toString O
			
			System.out.println("b3.a= "+b3.a);
			System.out.println("b3.b= "+b3.b);
			
			b3.a=1000;
			b3.b=2000;
			
			System.out.println("b1.a= "+b1.a);
			System.out.println("b1.b= "+b1.b);
		}catch (Exception ex) {}

		
	}

}
