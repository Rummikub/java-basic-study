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
			StudentVO v= new StudentVO();   // garbage collection ���ٰ� �����ѹ� �������� ���ο� �ּҿ� �����ϱ� ������ ���� 1���� 3�� ���� â���� �����ϴ�.
			System.out.println(v);
			System.out.println("�̸�:  ");
			v.name=scan.next();
			
			System.out.println("����: ");
			v.kor=scan.nextInt();
		
			System.out.println("����: ");
			v.eng=scan.nextInt();
			
			System.out.println("����: ");
			v.math=scan.nextInt();
			
			s[i]=v;  // �������� �����Ѵ�
		}
		 for (StudentVO aa  : s)
		 {
			 System.out.println(aa.name+"  "+aa.kor+"  "+aa.eng+"  "+aa.math);
		 }
	}

}
