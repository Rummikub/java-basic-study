// 5���� �̸��� �Է¹޾� ������ ������ ���   **** for each ����
import java.util.Scanner;
public class �迭6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String []arr= new String[5];


		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"�̸��� �Է��϶�");
			arr[i]=scan.next();
		}
		// ���
		
		for(String name:arr) 
		{
			System.out.println(name);
		}
		// for -each => �迭, ����ü(Collection)
		/*
		 * 			int[] data={1,2,3,4,5}
		 * 			for(int i=0; i<data.length;i++)
		 * 		{
		 * 			System.out.println(data[i]);
		 * 		}
		 * 
		 * 		for (int i:data)									�����Ͱ��� ������ ���  -- > ���� ���̻� ������ �״�� ����
		 * 		{
		 * 				System.out.println(i);
		 * 		}
		 */
		System.out.println();
		
		
	}

}
