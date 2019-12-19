/* 으아아아아아아아 어려우어어
 * 
 * 
 * 
 * 3명의 학생 = 국영수 입력 후 출력     // 변수 15개 배열 5개
 * ========================
 * 80 80 80 240   A  2 80.0
 * 90 90 90 270  B   1  90.0
 * 70 70  70   210  C   3  70.0
 */
import java.util.Scanner;
public class 배열8 {

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
			System.out.print((i+1)+"번째 국어점수");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어 점수");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학 점수");
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
		// 출력
		for(int i=0; i<3; i++)
		{
			System.out.println(kor[i]+ "  " + eng[i]+ "  " + math[i]+ "  "+ total[i]+ "  "+ score[i]+"    "+ avg[i]);
		}
	}

}
