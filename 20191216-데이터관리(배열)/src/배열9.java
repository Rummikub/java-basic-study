/*  �ʱⰪ�� �� 0�ΰ��� �ƴϴ� !!
 * 
 * 
 *  5���� ������ �޾Ƽ�  --  �迭�� �Ѱ�
 *  �ִ밪 �ּҰ� -- ������ ��Ƽ� ó��
 *  
 * 1) ����
 * 		int a,b,c,d,e     ==  �뵵�� ���� == ������ ==�迭
 * 		int max, min 
 * 
 * 2) �ʱⰪ ���
 * 
 * 		�ʱⰪ�� �� 0�ΰ��� �ƴϴ�
 */
import java.util.Scanner;
public class �迭9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  �Է°��� �޴´�
		
		Scanner scan=new Scanner(System.in);
		
		// ������ ����ش�
		int [] arr=new int[5];
		
		// �� �Է�    --- ������ �Է��� ���� �ֱ⿡  int max=0�̶�� �ϸ� �ȵȴ�
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		int max=0;
		int min=100;  // min�� ���� ū ���� ��� max�� ���� �۰� �����, �ƴϸ� ������ �߻���Ű�� ��� ����
		
		for(int i:arr)
		{
			if(arr[i] >max)
				max= i;
			if(arr[i] <min)
				min= i;
		}
		//���
		
		for(int i:arr)
		{
			System.out.println(i+"  ");
		}
		System.out.println();
		System.out.print("�ִ밪:" +max);
		System.out.println("�ּҰ�: "+min);
	}

}
