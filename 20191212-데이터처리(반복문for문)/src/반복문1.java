import java.util.Scanner;

/*
 * for: �ݺ���(�ݺ�Ƚ���� �����Ǿ� ����)
 * 
 *   [�Ϲ� for]
 *   			����)
 *   						for(�ʱⰪ;���ǽ�;������)
 *   								���๮��
 *   
 *  						=> �ʱⰪ=> ���ǽ� = ���๮�� => ������   ____ false�϶� ����
 *  						
 *  						= �ʱⰪ   ==> 0
 *  						=	���๮���� ����
 *  							====================> {} :�ѹ��忡�� ���� �ʿ� ������ �������忣 �ʼ�
 *  						= ������	==> 1���� �����ϴ°� �⺻, ���̻� ����
 *  						= ������ �Ѱ��̻� / ���ǵ� ������ ���ļ� �� �� ����
 *  							for(int i=0, j=1;j<1=   &&   j>=1;
 *  						= for(int i=0; ....)  => �������� i�� for�� �ȿ����� ���
 * 						��������
 * 						{
 * 
 * 						}
 *  
 *   [ ��� for]  :     (JDK 1.5+)   --     �迭,�÷���(�����ͺ��̽�)
 *   
 *    ******�޼ҵ�( �Ϲ� �޼ҵ�, ���ٽ�(�Լ�������):JDK1.8)
 */
public class �ݺ���1 {

	static public  void main(String[] a) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("i="+i);
	}

}
