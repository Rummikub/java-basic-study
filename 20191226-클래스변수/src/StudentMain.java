import java.util.Scanner;

class StudentVO{
	String name;
	int kor,eng,math;
}
public class StudentMain {

	public static void main(String[] args) {
		StudentVO[] s=new StudentVO[3];
		Scanner scan=new Scanner(System.in);

		for( int i=0; i<3; i++)
		{
			StudentVO v= new StudentVO();   // garbage collection 에다가 루프한번 돌때마다 새로운 주소에 저장하기 때문에 변수 1개로 3개 공간 창출이 가능하다.
			System.out.println(v);
			System.out.println("이름:  ");
			v.name=scan.next();
			
			System.out.println("국어: ");
			v.kor=scan.nextInt();
		
			System.out.println("영어: ");
			v.eng=scan.nextInt();
			
			System.out.println("수학: ");
			v.math=scan.nextInt();
			
			s[i]=v;  // 마지막에 저장한다
		}
		 for (StudentVO aa  : s)
		 {
			 System.out.println(aa.name+"  "+aa.kor+"  "+aa.eng+"  "+aa.math);
		 }
	}

}
