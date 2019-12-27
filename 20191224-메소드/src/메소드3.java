import java.util.Scanner;

// year입력 받아서 => 윤년여부 확인
// int 0,1 => boolean   ( true, false )
// void  可
public class 메소드3 {
	/*내가 한 코딩
	 * static int input()
	{
		 Scanner scan=new Scanner( System.in);
		 System.out.println("연도를 입력하세요: ");
		 int year=scan.nextInt();
		 return year;
	}
	static void process ( int year)
	{
		boolean isTrue=false;
		if( year%400==0 || year%100!=0 && year%4==0)
				isTrue=true;
		System.out.println("yes");
	}
	*/
	
	//  void 사용하기
	static void isYear(int year)
	{
		if(year%400==0 || year%100!=0 && year%4==0)
			System.out.println("윤년");
		else
			System.out.println("윤년이 아니다");
	}
	
	//  boolean  사용하기
	 static boolean isYear2(int year)
	 {
			if(year%400==0 || year%100!=0 && year%4==0)
				return true;
			else
				return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int year=2019;
	  isYear(year);    //변수가 반드시  year로 일치시킬 필요는 없다.
	  
	  
	  boolean wow=isYear2(year);
	  if(wow)
			System.out.println("윤년");
		else
			System.out.println("윤년이 아니다");
	}

}
