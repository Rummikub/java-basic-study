import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제2
		int pay=1500000;
		int perhour=55000;
		int tax= pay*1/10;
		int total= pay+perhour-tax;
		
		System.out.println("실수령액 ="+total);
		
		//문제3
		String name="이효리";
		String depart="개발부";
		String pos="대리";
		int sal=1500000;
		
		System.out.println("이름: "+ name);
		System.out.printf("부서: "+depart+"\n");
		System.out.print("직위: "+pos+"\n");
		System.out.println("급여:"+sal);

		//문제4
		String Input_Name="민들래";
		int kor=90;
		int eng=70;
		int mat=75;
		
		 total = kor+eng+mat;
		 
		 double avg= total/3.0;
		 
		Scanner  scan = new Scanner (System.in); 
		System.out.println("이름");
		Input_Name=scan.nextLine();
		
		System.out.println("합계점수");
		total=scan.nextInt();
		
		System.out.println("평균점수");
		avg=scan.nextInt();


		System.out.println("이름"+Input_Name);
		System.out.println("합계점수:" +total );
		System.out.println("평균점수:" +avg);
		
		
		//문제6
		
		int numOfApples = 123;
		int sizeOfBucket =10;
		int numOfBucket= (numOfApples%10);
		
		System.out.println(numOfBucket);

		
		
	}

}
