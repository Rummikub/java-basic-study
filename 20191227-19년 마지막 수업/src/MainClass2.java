/* [ ������ ������ �ʱⰪ ]
 *  ���� 
 *  1) instance 										= new�� ���� �޸� ���� ��쿡 ����
 *  2) static 												= ������ ������   ; �޼ҵ忡���� ����� �Ұ��� / Ŭ�������� '��'���
 *  ====================> �ڵ� �ʱ�ȭ					
 *  3) ��������											= �޼ҵ� ȣ�� �� 
 *  =====================> �ݵ�� �ʱ�ȭ ����� ��
 */
class Data{ 
	// Ŭ�����ȿ�����  '����'�� �� �� �ִ� = '����' X => ������, ���, �ݺ���, �޼ҵ� ȣ��   => �޼ҵ� ��� { }
	int a; // 0
	float f; // 0.0F
	double d; // 0.0
	boolean boo=false; //false
	long l; //oL
	char c='\0'; //'\0'
	String s; // null  - �ּҰ��� ���ٴ� ���̴�
	String ss="";    // ��� ���� �ִ� ������! 
	// �⺻ ��������   --> ��������(�������)�� ���������� �޸� �ʱⰪ�� �ڵ����� ������ �Ǵ���
	
	static int aa;  // 0
}
public class MainClass2 {

	public static void main(String[] args) {
		System.out.println(Data.aa);
		/*
		 * Data dd=new Data(); // dd�� ��ü�� ( ������ �Ѱ��� �����͸� �����ϴ� ���̰� ��ü�� �������� �ѹ��� �����ϴ� �� =
		 * ���� ���� Ŭ������ ������� ���� ) System.out.println(dd.a); System.out.println(dd.boo);
		 * System.out.println(dd.d); System.out.println(dd.l); System.out.println(dd.s);
		 * System.out.println(dd.ss); System.out.println(dd.f);
		 * System.out.println(dd.c);
		 */

	}

}
