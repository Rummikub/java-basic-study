class MyException{
	//구현된 내용중에 예상되는 에러가 있다면 = > 시스템에 알려준다  => throws
	public void display() throws NumberFormatException,NullPointerException
	{
		System.out.println("MyException:display Call...");
	}

}
public class MainClass {

	public static void main(String[] args) {
		//  메모리 할당
		//NumberFormatException, NullPointerException,ArithmeticException
		//RuntimeException => 생략가능
		MyException m=new MyException();  // m주소에 display() 저장
		m.display();
	/*	try
		{

		} catch(Throwalbe e ) {}
	
	*/
	}

}
