// call by reference ( �ּ�) => �迭 Ŭ����					* �޸𸮸� ���� ������ �ʿ䰡 ��� �ӵ��� ����       ** ��ȸ�� ������ �� ����ϴ������������ζ󵵶��
/*
 * 	class A
 * 	{
 * 			int a=10;
 * 	}
 * 	swap(A aa)
 * 	{
 * 			aa.a=1000;
 * 	}
 *  A aa=new A();   = > Ŭ������ �����ϴ� ������ heap�� ���������
 *  swap(aa)
 *  
 *  aa,a    => �迭�� �ε��� ���� ������ �ϴ� ( . )  �� �ȿ� ����Ǿ� �ִ� �� �����Ͷ�				= 1000
 */
public class �޼ҵ�2 {
	static void swap(int []arr)
	{
		System.out.println("prior swap: arr[0]:" + arr[0] + " arr[1]: "+arr[1]);
		// ����
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("swap: arr[0]:" + arr[0] + " arr[1]: "+arr[1]);
	}
	public static void main(String[] args) {
		// �迭 

		�޼ҵ�2 a=new �޼ҵ�2();
		�޼ҵ�2 b=new �޼ҵ�2();
		�޼ҵ�2 c=new �޼ҵ�2();
		�޼ҵ�2 d=new �޼ҵ�2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		int []arr= {100,200};
		swap(arr);  							//�ּ����� *( ������ �Ѿ)
		System.out.println("main  swap: arr[0]:" + arr[0] + " arr[1]: "+arr[1]);
			
	}

}
