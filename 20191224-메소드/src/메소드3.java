import java.util.Scanner;

// year�Է� �޾Ƽ� => ���⿩�� Ȯ��
// int 0,1 => boolean   ( true, false )
// void  ʦ
public class �޼ҵ�3 {
	/*���� �� �ڵ�
	 * static int input()
	{
		 Scanner scan=new Scanner( System.in);
		 System.out.println("������ �Է��ϼ���: ");
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
	
	//  void ����ϱ�
	static void isYear(int year)
	{
		if(year%400==0 || year%100!=0 && year%4==0)
			System.out.println("����");
		else
			System.out.println("������ �ƴϴ�");
	}
	
	//  boolean  ����ϱ�
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
	  isYear(year);    //������ �ݵ��  year�� ��ġ��ų �ʿ�� ����.
	  
	  
	  boolean wow=isYear2(year);
	  if(wow)
			System.out.println("����");
		else
			System.out.println("������ �ƴϴ�");
	}

}
