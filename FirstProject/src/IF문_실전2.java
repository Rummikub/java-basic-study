/*
 *  1. if ~ else
 *  		정수를 한개 입력받아서 짝수/홀수 출력
 *  2.  char a='A' 대문자/소문자 출력
 *  3. 정수 세개를 입력받아서 평균 => 90점이상 = A, B,C,D
 *  
 */
import java.util.Scanner;
public class IF문_실전2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // 문제1
	/*Scanner scan=new Scanner(System.in);
		 int a = scan.nextInt();
		 
		if (a%2==0)
		{
			System.out.println(a+"는 짝수");-
		}
		else
		{
			System.out.println("a는"+a+"  홀수");
		}
		
		//문제2 
		char b= 'Z';
				 
	   if (b>='A' && b<='Z')
		{
		   System.out.println(b+"는 대문자");
		   }
	   else
	   {
		   System.out.println(b+"는 소문자");
	   }
	   */
	   
	   //문제 3
	   
	   Scanner scan=new Scanner(System.in);
	   int c = scan.nextInt();
	   int d= scan.nextInt();
	   int e = scan.nextInt();
	   
	   int average=(c+d+e)/3;
	  // 80+90+80 => 250 /3 ==> 834
	   
	   int result=average/10; //8
	   
	   if(result==10 || result==9)
		  System.out.println("A");
	   if(result==8)
		  System.out.println("B");
	   if(result==7)
		  System.out.println("C");
	   if(result==6)
		  System.out.println("D");
	   if(result<6)
		  System.out.println("F");
	   
		/*if(average<60)
		{
		System.out.println("F입니다");
		}
		else
		{
			if(average>=90 && average<=100)
			System.out.println("A입니다");
			if(average>=80&& average<90)
				System.out.println("B입니다");
			if(average>=70&& average<80)
				System.out.println("C입니다");
			if(average>=60&& average<70)
				System.out.println("D입니다");
		} 	
		*/
	}
	


}
