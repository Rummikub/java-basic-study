// �޼ҵ��� ����!
// ���� �ٸ� Ŭ������ �����ؼ� ���( �Ѱ��� Ŭ������ �̿��Ͽ� ����) 
// �������� Ŭ������ ���� �Ѱ��� ��ü�� ����
abstract class ����{
	abstract void �ȴ´�(); // ���� �ϰ� ���� �� = �߻�޼ҵ� =abstract  
	abstract void �Դ´�();
	void display() {
		System.out.println("���� ǥ��!");
	}
}
class  ��� extends ���� {  
	// �߻�޼ҵ带 �������� ������ ������ ����.( �ϼ��� ����� ��) 
	// ����� Ŀ�� ���� ��� Add unimplemented method �� ��ĥ �� �־�
	@Override
	void �ȴ´�() {
		// TODO Auto-generated method stub
		System.out.println("���ó�� �ȴ´�");
	}

	@Override
	void �Դ´�() {
		// TODO Auto-generated method stub
		System.out.println("���ó�� �Դ´�");
	}  
	
}
class ���� extends ���� {

	@Override
	void �ȴ´�() {
		// TODO Auto-generated method stub
		System.out.println("����ó�� �ȴ´�");
	}

	@Override
	void �Դ´�() {
		// TODO Auto-generated method stub
		System.out.println("����ó�� �ȴ´�");
	}
	
}
class �� extends ���� {

	@Override
	void �ȴ´�() {
		// TODO Auto-generated method stub
		System.out.println("��ó�� �ȴ´�");
	}

	@Override
	void �Դ´�() {
		// TODO Auto-generated method stub
		System.out.println("��ó�� �Դ´�");
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� a=new ���();
				a.�ȴ´�();
				a.�Դ´�();
				
				a=new ��();
				a.�ȴ´�();
				a.�Դ´�();
				
				a=new ����();
				a.�ȴ´�();
				a.�Դ´�();
				
				a.display();
	}

}
