// if ���๮���� ����
/*
 *    if(���ǹ�)
 *    			���๮�� 1 ======> if�� �Ҽӹ���
 *    			���๮�� 2======> if�� ������ ���� ���� => true/false�� ���þ��� ������
 *    	=> �ڹٿ��� ��� ����� {}�� ���� ��� �ѹ��常 ����
 * 
 * 		if(���ǹ�)
 * 		{
 * 			���๮�� 1 ==> ������
 * 		}
 * 			���๮�� 2
 * 
 *  			=> ������, ����ȭ (�����丵), ���̱׷��̼�(Spring=> SpringBoot)
 *  
 *  			abc() ==> add()
 *  			def()	==>  minus()
  */
public class ���_���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		// �������� ���๮���� ���ÿ� ������ �� ����ϴ� ���ǹ�
		int b=100;
		int a=10;
		// int b=a++;            
		++a;
		System.out.println(a);
		if(num%2!=0)
		{
				
				System.out.println("b��(��)"+b+"�Դϴ�");
				System.out.println(num+"��(��) ¦���Դϴ�.");
				System.out.println("���α׷��� �����մϴ�");
				b++;
		}
		System.out.println(b);
	 // Systm.out.println(b); ==> {}�ȿ����� ����ϴº��� = �������� = ��Ϻ���
		// ++a, a++, a+=1, a=a+1
		int c=10;
		c++;
		c++;
		c++;
		c++;
		
		c++;
		System.out.println("c="+c);
		
		int d =10;
		d+=5;
		System.out.println("d="+d);
	}

}
