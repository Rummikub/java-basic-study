/*
 *  ���� �ʱ�ȭ
 *  ========
 *  (1)����� ���ÿ� �ʱ�ȭ
 *  
 *  	int a=10;
 * ((Aber))
 *  	arr[0]=10;   				=>  ������ �ش��ϱ� ������ ��������.
		a=20;   => X
 * ================= 
 * 
 * (2)�ʱ�ȭ ��� ��� 
 * 
 *  {
 *  	a=100;
 *  }
 *  ================ ( ��������� �ʱ�ȭ)
 *  
 *  (3)static �ʱ�ȭ ��� ���
 *  
 *  static
 *  {
 *    		�ڵ��ڵ�
 *   }
 *  ================  (������� static�� �ʱ�ȭ)
 *  
 *  Ŭ������()
 *  {
 *  	a=200;
 *  }
 */
class MyData{
		static int[]arr =new int[6];
		MyData()
		{
			for( int i=0; i<6;i++)
			{
				arr[i]=(int)(Math.random()*100)+1;
			}
		}

}	
public class MainClass2 {

	public static void main(String[] args) {
	
		 MyData m1=new MyData();
			for(int i=0; i<6; i++)
			{
				System.out.print(m1.arr[i]+" ");
			}
			System.out.println("\n====================");
		 MyData m2=new MyData();
			for(int i=0; i<6; i++)
			{
				System.out.print(m2.arr[i]+" ");
			}
			System.out.println("\n====================");
		 MyData m3=new MyData();
			for(int i=0; i<6; i++)
			{
				System.out.print(m3.arr[i]+" ");
			}
			System.out.println("\n====================");	
			for(int i=0; i<6; i++)
			{
				System.out.print(m1.arr[i]+" ");   // �ٲ�� �� �ٲ�ϱ� (static) ���� �� m3.arr�� ��µȴ�.
			}
	
			
	
		
		/*
		 MyData m1=new MyData();
		 
		for(int i=0; i<6; i++)
		{
			System.out.print(m1.arr[i]+" ");
		}
		
		System.out.println("\n====---------====");
		
		MyData m2=new MyData();
		for(int i=0; i<6; i++)
		{
			System.out.print(m1.arr[i]+" ");
		}
		*/
		
	}

}
