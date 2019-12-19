// 배열 4를 배열로 짜는 예제
import java.util.Scanner;
public class 배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year,month;
		Scanner scan=new Scanner(System.in);
		System.out.println("YEAR");
		year=scan.nextInt();
		System.out.println("MONTH");
		month=scan.nextInt();
		
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if ((year%4==0 && year%100!=0) || (year%400==0))   // 이걸 나중에 메소드로 잡아주면 불러올 수 있대
			lastDay[1]=29;
		else
			lastDay[1]=28;
		
		System.out.println(month+" 월의 마지막날: "+ lastDay[month-1]);   // 0부터 시작이니까
	}

}
