/*�� �ȿ� �ݹ��� ������ �ִ�
 * 
 * 
 *  �޼ҵ�
 *  1) ����
 *  		������ �޼ҵ�� (�Ű����� �ִ� 3��) = �����
 *  		{
 *  			��� ������
 *  			return �����       => �������� ������� ���� ���������̾�� ��
 *  		}
 *  		==> �������� ���� ��� ==> return�� ������
 *  		==> ��� �޼ҵ�� �����ϱ� ���� �ݵ�� �������� ������ ����ؾ� �Ѵ�
 *  					����) => ���ǹ��� ����ؼ�  return ����� �� ����
 *  					=> return�� �Ʒ��� � ���嵵 ����� �Ұ��� 												; ���Ḧ �ǹ��ϱ� ����
 *  		display(10);			
 *  		static void display(int a)
 *  		{
 *  			System.out.println(a);
 *  			return;
 *  			System.out.println(a+1);							// ����
 *  		}
 *  
  *  		display(10);			
 *  		static void display(int a)
 *  		{
 *  			System.out.println(a);
 *  			if(a==10)											// �߰��� ���ǹ��� �ɾ return�ָ� �߰��� �����ϱ� ������ �������� �ʴ´�
 *  				return;
 *  			System.out.println(a+1);						
 *  		}
 *  
 *  2)������ : �⺻��, Ŭ����, �迭
 *  		int method()
 *  		Movie method()  
 *  		int[] method()
 *  		������� ���� ��� => void
 *  
 *  3) �Ű����� : ����� ��û��
 *  		=> 3�� �̻��̸� ��� ��û => �迭, Ŭ����
 *  			ex) ȸ������ ( Ŭ���� )
 *  					�Խ��� �۾��� ( Ŭ���� )
 *  
 *  4)�Ű����� ���۹�
 *  call by value :  �⺻��, String
 *  	============ �޸𸮸� ���� ���� ( ������)
 *  call by reference :  �迭, Ŭ����
 *   ============= ���� �ּҸ� �̿��� ���� ����
 *  
 *  5)ȣ��
 *  				�޼ҵ��()
 *  				�޼ҵ��(10,20)
 *  				=========== return�� ���� ���
 *  				�������� ���� = �޼ҵ�()
 *  				�������� ���� = �޼ҵ�(19,20)
 *  			** ���޼ҵ�� ������ ���� �� �ٽ� ȣ���� ��ġ�� ���ƿ´�
 *  			** �޼ҵ带 ������ ȣ��� => �Ѱ��� �޼ҵ尡 ������ �����ؾ� ���� �޼ҵ带 ȣ���� �� �ִ�   = ����ȭ ���   =�̰� �ذ��Ϸ��� ������ ���� �ŷ�
 *  
 */
// �Ű����� ���� -> call by value   [ �޸𸮰� ���� �����Ǳ� ������ ���� ���� ������� ���� ]
public class �޼ҵ� {
	static void swap(String a, String b)
	{
		System.out.println("prior swap:a=" + a + "b= "+b);
		//����
		String temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a=" + a + "b= "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hi";
		String b="Java";
		swap(a,b);
		System.out.println("main:a=" + a + "b= "+b);
	}
// swap(int a, int b)  �Ű��������� ���������� ������ �޸𸮰� ������ 
	// main() ���� swap(a,b)�� ȣ�������Ƿ� ������  a,b�� ����� �׷��Ƿ� ��������� ����
}
