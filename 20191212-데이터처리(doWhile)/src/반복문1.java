/*
 *  		do~while: �ѹ� �̻��� �����ϴ� �ݺ���(�� ���� ����)
 *  		����)
 *  
 *  						//   C. C++. C#. Java => 0 (���ڿ�,�ڷᱸ��( List,Set, Map))
 *  				�ʱⰪ
 *  					do {
 *  							���๮��==> ���������� ����� �� �ִ�
 *  							������ ==>	������
 *  									i++, 		i--
 *  									i+=2,  i-=2
 */
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10����
		int i=1;//  1~10  => ��������
		do
		{
			System.out.println("i= "+i);
			i++;     // �� �������� ������ ���� 10�� ���� �� ���� ������ ���ѷ����� ������
		}while(i<=10);
		System.out.println("10~1");
		do {
			System.out.println("i="+(i-1));
			i--;
		}while(i>1) ;
	}

}
