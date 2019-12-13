/*
 *   			1)			3명의 학생 => 국,영,수 점수 => 평균, 총점,학점을 출력
 *   																808080					80		240	B
 *   																707070						70		210    C
 *   																909090					90		270	A
 */
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  필요변수 kor ,eng,math,total,avg 
		int kor,eng,math,total,avg ;   //  변수를 선언하고 sysout에 식을 넣어도 됨
		String result ="";  // 결과값을 문자열로 받으니까
		int i=1;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.print("국어점수: ");
			 kor=scan.nextInt();
			 
			System.out.print("영어점수: " );
			 eng=scan.nextInt();
			 
			System.out.print("수학점수: ");
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
		

	System.out.println("국어  영어 수학 총점 평균 학점");
	System.out.println(result);

		
	}

}
