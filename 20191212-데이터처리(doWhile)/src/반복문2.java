/*
 *   			1)			3���� �л� => ��,��,�� ���� => ���, ����,������ ���
 *   																808080					80		240	B
 *   																707070						70		210    C
 *   																909090					90		270	A
 */
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  �ʿ亯�� kor ,eng,math,total,avg 
		int kor,eng,math,total,avg ;   //  ������ �����ϰ� sysout�� ���� �־ ��
		String result ="";  // ������� ���ڿ��� �����ϱ�
		int i=1;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.print("��������: ");
			 kor=scan.nextInt();
			 
			System.out.print("��������: " );
			 eng=scan.nextInt();
			 
			System.out.print("��������: ");
			 math=scan.nextInt();
			 
			 total=kor+eng+math;
			 avg= total/3;
			 
			 char c='A';    //  score
			 switch(avg/10)
			 {
			 case 10:
			 case 9:
				 		c= 'A';
				 		break;
			 case 8:
				 		c='B';
				 		break;
			 case  7:
				 		c='C';
				 		break;
				 default:
				 		c='F';
			 }
				 		result=kor+"    "+eng+"   "+math+"   "+total+"  "+avg+"   "+c+"\n";
				 		i++;
		
		}while(i<=3);
		

	System.out.println("����  ���� ���� ���� ��� ����");
	System.out.println(result);

		
	}

}
