/*
 * 		�ڹٿ��� �����ϴ� Ư������
 * 		1) \n 	=> newLine => ���� �ٿ� ��� System.out.println()
 * 		2) \t   => tab  =>  ���� ����
 * 		3) \"   => " => ����ǥ ��� ( �ο��ȣ)
 * 				System.out.println("\"Hello Java\"")
 *		
 *		 ��� ����	
 *		 ȫ�浿
 *		 ��û��
 *		 �ڹ���
 *
 *			=====> System.out.println(" ȫ�浿 ");
 *							 System.out.println(" ��û�� ");
 * 							 System.out.println(" �ڹ��� ");
 * 
 * 		ȫ�浿 ��û�� �ڹ���
 * 				 System.out.print(" ȫ�浿\t ");
*					System.out.print(" ��û��\t ");
*					System.out.print(" �ڹ���\n ");
*
*				������ �ִ� ��� ==> JDK 1.5
*
*				1) %d   => ����
*				System.out.printf("%5d%5d%5d",100,90,60);  
*							100--90---60
*				2) %f		=> �Ǽ�
*				3)  %c	=> ����
*				4) %s	=> ���ڿ�
*				System.out.printf();
*				�̸�		����		���� 		����		����
*				ȫ�浿		90			90		 90				270
 */
public class ����������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%-5d%-5d%-5d\n",100,90,60);   // ���� ���� �ϰ� ������ %-Nd
		
		System.out.printf("%-9.2f%-9.2f%-9 .2f",10.0000,90.0,60.7);   	// �� 10�ڸ��߿� �Ҽ��� 2�ڸ����� ��� %N.nf
		
		System.out.printf("%2c%2c%2c\n", 'A' , 'B' ,'C');
		
		System.out.printf("%10s%10s%10s\n", "Hello", "Jvava", "!!");
		
		System.out.printf("%7s%5d%5d%5d%7.2f%c\n","ȫ�浿", 34, 2,1,80.000, 'C');   // �����Ͱ� ���� �� �� �ִ�
	}

}
