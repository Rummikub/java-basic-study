/* ���ƾƾƾƾƾƾ� �������
 * 
 * 
 * 
 * 3���� �л� = ������ �Է� �� ���     // ���� 15�� �迭 5��
 * ========================
 * 80 80 80 240   A  2 80.0
 * 90 90 90 270  B   1  90.0
 * 70 70  70   210  C   3  70.0
 */
import java.util.Scanner;
public class �迭8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int [] kor= new int[3];
		int [] eng= new int[3];
		int [] math= new int[3];
		int []total = new int[3];
		double [] avg = new double[3];
		char [] score = new char[3];


		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"��° ��������");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"��° ���� ����");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"��° ���� ����");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]= total[i]/3.0;
			
			switch( (int)avg[i]/10)
			{
			case 9: 
				score[i]='A';
				break;
			case 8: 
				score[i]='B';
				break;
			case 7: 
				score[i]='C';
				break;
				default: 
					score[i] = 'F';
			}
		}
		// ���
		for(int i=0; i<3; i++)
		{
			System.out.println(kor[i]+ "  " + eng[i]+ "  " + math[i]+ "  "+ total[i]+ "  "+ score[i]+"    "+ avg[i]);
		}
	}

}
