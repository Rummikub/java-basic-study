// 5���� ������ �Է¹޾� 5�� ���� ��� + ��, ��� ���
import java.util.Scanner;
public class �迭7 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		// 5�� ���� ���� ���� 
		int [] arr= new int[5];
		// ���� ����
		int total=0;
		// ��� ����
		double avg=0.0;   						//�ʱⰪ ����ֱ�
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"��° ������ �Է��϶�");
			arr[i]=scan.nextInt();
		}
		
		for(int score: arr) 
		{
			System.out.println(score);
			total+=score;
		}
		
		avg= total/(double)arr.length;
		
		
		System.out.println("����:"+total);
		System.out.printf(" ���: "+avg);
	}

}
