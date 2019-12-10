import java.util.Scanner;

/*
 *  정수 2개를 입력 받아서 ==> 연산자1개 ==> 사칙연산
 *  자바어 => 입력을 받을 때=> char를 받을 수 없고, String으로 받아야 한다.
 *  String => (==), equals   주소를 비교하는것이 == 임
 */
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a=(int)"10"
		// Integer.parseInt("10")
		
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수:  ");
		 int num1=scan.nextInt();
		 
		 System.out.println("두번째 정수: ");
		 int num2=scan.nextInt();
		 
		 System.out.println("연산자");
		  String op=scan.next();
		  
		  //처리
		  //결과값 출력
		  if(op.contentEquals("+"))
		  {
			  System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);  //d 정수값
			  // printf \n = println   but 문자가 많을 때는  f쓰는게 낫다
		  }
		  else if(op.equals("*"))
		  {
			  System.out.printf("%d*%d=%d\n",num1,num2,num1*num2); 
		  }  
		  else if(op.equals("-"))
		  {
			  System.out.printf("%d-%d=%d\n",num1,num2,num1-num2); 
		  }
	      else if(op.equals("/"))
	      {
			  if(num2==0)
				  System.out.println("0으로 나눌 수 없다");
			  else
	    	  System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2); 
			  //=> 자동형변환이 안되기 때문에 내가 맞춰야 한다.+
	      }
	      else 
	      {
	    	  	System.out.println("ERROR");
	      }
	}

}
