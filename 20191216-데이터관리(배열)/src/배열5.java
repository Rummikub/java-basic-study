// �迭 4�� �迭�� ¥�� ����
import java.util.Scanner;
public class �迭5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year,month;
		Scanner scan=new Scanner(System.in);
		System.out.println("YEAR");
		year=scan.nextInt();
		System.out.println("MONTH");
		month=scan.nextInt();
		
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if ((year%4==0 && year%100!=0) || (year%400==0))   // �̰� ���߿� �޼ҵ�� ����ָ� �ҷ��� �� �ִ�
			lastDay[1]=29;
		else
			lastDay[1]=28;
		
		System.out.println(month+" ���� ��������: "+ lastDay[month-1]);   // 0���� �����̴ϱ�
	}

}
