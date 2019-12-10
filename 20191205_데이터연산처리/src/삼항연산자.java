// ? : 
// (조건문?값1:값2)  => 웹(React=> 삼항연산자)
// 조건 (true) => 값1
// 조건 (false) => 값2
/*<%
 *  				int sex =1;
 *  				if(sex==1)
 *   			{
 *  %> 
 *  				남자
 *  
 * <%  
 * 				}
 * 				else
 * 				{
 *<%
 * 				여자
 * %>
 * ====================     JSP가 코딩하는 법 
 * <%
 * 			sex==1? "남자" : "여자"
 * %>
 */
import java.util.Scanner;
/*
 * 국어, 영어, 수학 점수를 입력받아서 평균 => 평균이 60이상이면 pass,  nopass
 *    //문제 나이를 입력 ==>15세 이상이면 (영화관람가능)/ 이하면 (영화관람불가)
 *    // 문제2 좌석 => 12345=>124=> 좌석예매 불가능 ,35=> 좌석예매 가능
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수: ");
		//저장
		int kor=scan.nextInt();
		System.out.print("영어 점수: ");	
		int eng=scan.nextInt();
		System.out.print("수학 점수: ");
		int math=scan.nextInt();
		
		int avg=(kor+eng+math)/3;
		
		String result=avg>=60? "Pass":"NonPass";
		System.out.println("결과:"+result);
		

		// 문제
		Scanner scan1 = new Scanner(System.in);
		System.out.print("나이: ");
		int age=scan1.nextInt();
		
		 result = age>=15?"영화관람가능":"영화관람불가";
		 System.out.println("결과: "+ result);
		
		 
		 // 문제2
			Scanner scan2 = new Scanner(System.in);
			System.out.print("좌석 번호: ");
			int seat=scan2.nextInt();
			
			 result=(seat==3||seat==5)?"좌석예매가능":"좌석예매불가능";

			 System.out.println("결과: "+ result);
			 
	}

}
