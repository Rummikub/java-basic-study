// 컴퓨터가 난수를 발생, 사용자 입력값 ==> 가위, 바위, 보
 import java.util.Scanner;
public class 선택조건문_예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,2 :  가위,바위,보   ===> 모든 프로그램은 정수로 조절한다
	 int com=(int)(Math.random()*3);
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.print("가위(0),바위(1),보(2): ");
	  int user=scan.nextInt();
	  
	  // 선택
	 if (com==0)
			 System.out.println("컴퓨터: 가위");
		 if (com==1)
			 System.out.println("컴퓨터: 바위");
		 if (com==2)
			 System.out.println("컴퓨터: 보");
		 
	  if(user==0)
		  System.out.println("사용자: 가위");
	  if(user==1)
		  System.out.println("사용자: 바위");	 
	  if(user==2)
			  System.out.println("사용자: 보");
	  
	  // 결과  --> com-user
	  /*if(com==0) //  가위
	  {
		  	if(user==0) // 가
		  	{
		  			System.out.println("비겼다");
		  	}
			if(user==1) // 바
		  	{
				System.out.println("이겼다");
		  	}
			if(user==2) // 보
		  	{
				System.out.println("졌다");
		  	}
		  	}
	  if(com==1) //  바위
	  {
		  	if(user==0) // 가
		  	{
		  			System.out.println("졌다");
		  	}
			if(user==1) // 바
		  	{
				System.out.println("비겼다");
		  	}
			if(user==2) // 보
		  	{
				System.out.println("이겼다");
		  	}
		}
	  if(com==2) //보
	  {
		  	if(user==0) // 가
		  	{
		  			System.out.println("졌다");
		  	}
			if(user==1) // 바
		  	{
				System.out.println("이겼다");
		  	}
			if(user==2) // 보
		  	{
				System.out.println("비겼다");
		  	}
		  }
		  */
	  // player wins when -1,2   com wins when 1,-2
	  
	 int result=com-user;
	 
	 if(result==-1 || result==2)
			System.out.println("WIN");
	 if(result==1 || result==-2)
			System.out.println("LOSE");
	 if(result==0)
			System.out.println("TIE");
	 }
	}
    
