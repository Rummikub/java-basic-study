/*
 *  ===========
 *  method   ����(static)
 *  ===========
 *  stack  =>  �޸� ����({} ����� ������ �������� ȸ��)					[��������]
 *  ===========
 *  heap   => ����ڰ� ���� => �������÷��� 			[�������(��������)]
 *  ===========
 */
public class ���׿�����_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++,--
		int a=10;
		a++;  // ��ġ����
 		a++; 
		a++;
		System.out.println("a="+a);
		
		int b=10;
		++b;
		++b;
		++b;
		System.out.println("b="+b);
		
		int c=10;
		int d=c++;
		 System.out.println(d);
	}

}
