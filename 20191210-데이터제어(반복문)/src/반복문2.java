/*
 * 				while => while(true) : ���ѷ���
 * 				for   =>  for(�ʱⰪ;���ǽ�1;���ǽ�2)   :
 * 
 * 				�ݺ����� ����
 * 				=========== 
 * 					continue : Ư�������� ����
 * 					break : �ݺ����� ����
 */
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while ==> 1~(����� �Է°�) ������ ¦���� ��, Ȧ���� ��, �� ��
		
		//  ����� �Է°� ���
		int sum=0,even=0,odd=0;
		int i=1;

		Scanner scan=new Scanner(System.in);
		System.out.printf("1�̻��� ���ڸ� �Է��ϼ���: ");
		int user=scan.nextInt(); 
		while(i<=user)
		{
			sum+=i;
			if(i%2==0)
					even+=i;
			else
					odd+=i;
					i++;
		}
	
				System.out.println("¦���� ��"+even);
				System.out.println("Ȧ���� ��"+odd);
				System.out.println("�� ��"+sum);
		
		
		
		
	}

}
