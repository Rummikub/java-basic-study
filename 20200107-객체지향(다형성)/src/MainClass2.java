/*
 * 		�������̵� (�޼ҵ��� ���Ǹ� �ٲ۴� )       - ������ �ϱ� ����
 * 		======== �߻�Ŭ���� , �������̽�
 * 		����� ����
 * 		�޼ҵ�� ����
 * 		�Ű����� ����
 * 		�������� ����
 * 		������������ Ȯ��
 * 		==============>  private <default < protected < public						
 *
 *			=> interface		I
 *				{
 *						int a ;								=> ERROR => public static final int a=10 (* ������� ���� �̸� ��� ��) 
 *						void display();									  => public abstract void display();      												// �ڵ�����
 *				}
 *
 *				public  A implements I
 *				{
 *						(public)	void display() {		=> ERROR = > default�� ��������� ��ҵǾ�����  (public �� �߰������ �����ذ� )
 *							}
 *				}
 *
 *			����� �ȵǴ� Ŭ����	:  ���� Ŭ����  (ǰ���� Ŭ���� = Final Class)
 *			public final class 
 *			����� ���� :  static, ������
 *
 *
 */
class Super
{
	public void display( ) { 
		System.out.println("Super: display() call");
	}
}

// 1.  Super ��� 
class Sub extends Super 
{
	/* �� �ȿ��� ������ ���ԵǾ� �ִ�.
	 * public void display( ) { 
		System.out.println("Super: display() call");
	}
	 */
	public void display() {
		System.out.println("Sub: display() call");
	}
}

//  2. ���� Ŭ���� ( ���� ���� �ٷ� ����� ��� ) 
class Subs {
	Super su= new Super();      
}

// ***.  ��Ӿ��� ��� = �͸��� Ŭ����
class Sub2 {
		Super su= new Super () {
			public void display() {
				System.out.println("Sub2:display() call");
			}
		};  //�� !!!
}


 // 3. ���� / ���� 
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();  // 2.�� ��찡 �� ȿ�����̴�.
		sub.display();
	}

}
