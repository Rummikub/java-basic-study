/*
 *  	�迭(Array)
 *  	1) ���� �����͸� ���� ��� �Ѱ��� ���������� ����
 *  	2) �迭 ����� �ڵ����� ������ �޸� ����
 *  															==========
 *  															���۰� ���� �ϰ������� ����������
 *  															0~ �迭���� ( �ݺ��� ����)
 *  	3)���� : ������
 *  	4)���ó => ���õ� �����Ͱ� 3�� �̻� = �迭�� �����Ѵ�
 *  	5) ���
 *  		1. ����
 *  			��������[] �迭��;							// �ڹ� �������
 *  			�������� �迭�� [];							// C C++���
 *  				ex) 
 *  						���� 
 *  						int[] arr;  => int arr[]
 *  						�Ǽ�
 *  						double[] arr;
 *  						����
 *  						char[] arr;
 *  						���ڿ�	
 *  						String[] arr;
 *  						
 *  
 *  		2.�ʱⰪ ����
 *  						int a; => a+=10  => Error
 *  						int[] arr= {10,20,30,40}  			=> �ڵ����� �迭���� = 4
 *  
 *  						arr (100) ==============
 *  												10	20	30	40	       ====>   'A'   'B'    'C'   'D' 
 *  										   |===|== =|= =|====
 *  										100 104 108  112					   	100  102  104  106
 *  
 *  										arr[0]	[1]	[2] [3]
 *  										==== �Ϲ� ������ �����ϰ� ���
 *  													���� ���� => arr[0]=100     10 => 100
 *  																				===  == 
 *  																	   �迭��  ÷��(�ε���)
 *  						char[] arr= {'A','B','C'}
 *  							====> �ּҸ� �����ؼ� ������ ���� = �������� 
 *  											( �迭, Ŭ����)
 *  			
 *  
 *  				int[] arr=new int[5];
 *  				================
 *  						new           int[5]
 *  						===			====
 *  			�޸��Ҵ�    ����5���� ������ �� �ִ� ����			
 *  											(������ �޸� ������ ����)
 *  					*** new�ʱⰪ => ��ü(0)
 *  					double[] arr= new double[3];   0.0
 *  					String[] arr= new String[3]; null ( ���� �������� �ʴ� ��)
 *  					char[] arr=new char[3] ;  '\0'
 *  					boolean[] arr = new boolean[3] ; false
 *  
 *  		3. Ȱ��
 *  			=> ���� ����
 *  					 ÷�ڸ� �̿� ==> arr[1]=100, arr[4]=200 ...
 *  															=====
 *  															����� �޸��� ��ġ��
 *  			=> ���		==> �迭�� ��� ÷�ڴ�  0���� ����
 *  												for(int i=0......)
 *  
 *  		4. �ʰ��ϰų� ���� �� ����
 *  				Error          ArryIndexOfBoundsException = > �迭�� ���� �ʰ� ���
 *  		5.�迭�� ���� ==> �迭��.length
 *  			======================
 *  
 */
//  ���� 3�� �Է¹޾Ƽ� �����͸� ���
import java.util.Scanner;
public class �迭1 {
		  static int a; // 0�� ��� ���� �ƴ� ���������� �ʱⰪ�� ��� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("����1");
		a =scan.nextInt();
		
		System.out.print("����2");
		b =scan.nextInt();
		
		System.out.print("����3");
		c =scan.nextInt();
		
		// ����  == > a,b,c�� ���� ū �� �ͷ�
		/*
		 *  a =10. b=5. c=20 ==> 20�� ���
		 */
		int max=0;
		if(a>max)				//  max=10
			max=a;
		if(b>max)			// Error
			max=b;
		if(c>max)						// max=20
			max=c;
		
		System.out.print("���� ū ��:"+max);
	}

}
