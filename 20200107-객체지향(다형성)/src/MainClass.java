// 			�����ε�
/*		===========
 * 		�Ѱ��� Ŭ�������� 
 * 		���� �̸��� �޼ҵ带 ȣ��
 * 		�Ű������� �ٸ��� (����, ���������� �ٸ���)
 * 		�������� �������
 */


/*
 * 		byte < char/short < int < long < float  < double
 * 		====================> "������"�� ��ȯ �ȴ�
 *			String, boolean =======> �ڵ� ��ȯ �ȵȴ�
 */
class Calc
{
		// �޼ҵ� �̸��� ������ ������ �� �ٸ��ϱ� ������ �ȴ�
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
	//	Calc ��ü ���� ( static�� �ƴ϶� ������ �ȵƱ� ����)
		Calc c =new Calc();
		c.display(10,10.5,'A');  // �Ű������� ���������� �޶� , ���� �������� (��)�� ���� �ٻ�ġ�� ��� int >char
	}

}
