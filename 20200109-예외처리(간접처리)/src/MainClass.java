class MyException{
	//������ �����߿� ����Ǵ� ������ �ִٸ� = > �ý��ۿ� �˷��ش�  => throws
	public void display() throws NumberFormatException,NullPointerException
	{
		System.out.println("MyException:display Call...");
	}

}
public class MainClass {

	public static void main(String[] args) {
		//  �޸� �Ҵ�
		//NumberFormatException, NullPointerException,ArithmeticException
		//RuntimeException => ��������
		MyException m=new MyException();  // m�ּҿ� display() ����
		m.display();
	/*	try
		{

		} catch(Throwalbe e ) {}
	
	*/
	}

}
