/*
 * 		�޼ҵ�
 * 		= �Ű����� ( ����� ��û�� )  => ����  = ������ or  0��
 * 		= ������ => ��û ���뿡 ���� ����� ����   = 1��  ( if ������ ������ => ��� )
 * 									==================
 * 									�⺻��, �迭, Ŭ����
 * 		============================================================
 * 		����)
 * 						������ �޼ҵ�� ( �Ű�����, ....) => �����
 * 						====		
 * 						{
 * 									==> ������ 
 * 									return �����      ========> ������ = �����  
 * 													====															======= > ������ ���� ���� ���������� �� �� �ִ�
 * 						}
 * 		
 * 						int aaa()
 * 						{
 * 							return ( int, char, byte, short)
 * 						}
 * 	*********** ȣ��
 * 						int a =aaa()
 * 							===> return�� �����Ǵ� ��� ==> void
 * 
 * 					  �迭
 * 						int[] aaa()     
 * 						{
 * 							return  �迭��
 * 						}
 * 							int[] arr=aaa()
 * 
 * 						Ŭ����
 * 						String aaa()
 * 						{
 * 							return " "( ���ڿ� )
 * 						}
 * 							String s=aaa()
 * 
 * 						������� ���� ���
 * 						void aaa()
 * 						{
 * 							return;
 * 						}
 * 							aaa()
 * 						===============================
 * 						�Ű������� �ִ� ���
 * 						int plus(int a, intb)
 * 						===		==========
 * 						{
 * 								a=10, b=30
 * 								return a+b;
 * 								========
 * 						}
 * 						int a=plus(10,30);
 * 
 * 						void aaa)()     //����ȭ
 * 						{
 * 							===	1
 * 							===	2
 * 							===	3
 * 							===	4
 * 							===	5
 * 							===	6
 * 							===	7
 * 						}
 * 							aaa() => 1234567
 * 							aaa() => 1234567 		=> �ݺ��� ����						==> ����� �ݵ�� ������ �����ؾ� �Ѵٴ� Ư¡�� ����
  */
public class �޼ҵ�1 {
	 static void  message() 																						// �ϳ��� ���� static�޸𸮿� ��� ���� ( �������� �Է��� ���� ����ȴ� )
	{
		System.out.println("hello java");
		 return; 																														//  ������ �Ǹ� => JVM�� �ڵ����� �ڵ����ش� 
	}
	 static String ccc()
	 {
		 return " Hello" ;
	 }
	 static int [] ddd()
	 {
		 int [] arr= {1,2,3,4,5};
		 return arr;
	 }
	 static double bbb()
	 {
		 double bbb= 10.5;
		 return bbb;
	 }
	 static int eee(int a)
	 {
		 return a;
	 }
	public static void main(String[] args) {
		//   �޼ҵ�1  a= new  �޼ҵ�1();   																	  // ������ ������ ������ �۵����� �ʴ´�  = > instance = ��ü  ( ���� ���� ) 
		message();
		double b=bbb();
		String s=ccc();
		int [] arr=ddd();
		int aa=eee(10);

		// ȣ�� ==> ����� ,�Ű�����
	}

}
