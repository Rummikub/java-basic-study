/*// �� �;ƾ�
 * 		�ڹ�(Ŭ���� ������) => �� ���� or ���� ����
 * 		�Ѱ��� ���Ͽ��� ���
 * 		==============
 * 		class A
 * 		class C	
 * 		class D
 * 		public class B   => public Ŭ������ �ϳ� �־�� ��
 * 		==============   B.java
 * 		class A
 * 		class B
 * 		====== (A/B).java  => egal aber ������ �ִ� �κ��� �����ϴ� ���� ����
 */
class News{  // new �� ���� ���� : title content reference date = instance ���� ( Ŭ���� ���� ���� ���� â�� )  
	String title;
	String content;
	String reference;
	String date;
	//static String site;  �������� ����  static �ڿ� �ٴ� ���� ( ������ 1�� â�� ) 
	// ���� �� �� �ִ� ����   = ������ �ȵȴ� (��) ���� �о����, ������, ��� ... 
}  // News ���������� �������


// ����!
public class MainClass {

	public static void main(String[] args) {
		// ���� =>  ������
		// �޸� ����  ( n1 �̶�� �ּ� �ȿ� )
		News n1 = new News ();  
		n1.title="200�� ���� ���б� \"�õ�\", �¼��Ǹ��� ���� ���..��� ���� �õ�";
		n1.content= "[������ ����] ��ȭ '�õ�'(���� ������)�� ũ�������� ���� "
				+ "������ �¼��Ǹ��� ��¼� �� �̹� �� 200�� ���ĸ� ���տ� �θ� ���༼�� �̾�� �ִ�.";
		n1.reference= "������������";
		n1.date= "19.12.27";
		
		News n2= new News();
		n2.title="���켺, '����' �̾� '��Ǫ����'���� ������ �ŷ�";
		n2.content=" ��� ���켺�� '��Ǫ���� ��� ���� ���µ�(����� ����)'���� ������ �ŷ��� �����δ�. "
				+ "'��Ǫ���� ��� ���� ���µ�'�� �λ� ������ ��ȸ�� �� ������ �����ϱ� ���� �ּ��� ���Ѵ�.";
		n2.reference="��Ÿ������";
		n2.date="19.12.27";
		// ���
		System.out.println(n1.title);
		System.out.println(n2.title);

	}

}
