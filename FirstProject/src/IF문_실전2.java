/*
 *  1. if ~ else
 *  		������ �Ѱ� �Է¹޾Ƽ� ¦��/Ȧ�� ���
 *  2.  char a='A' �빮��/�ҹ��� ���
 *  3. ���� ������ �Է¹޾Ƽ� ��� => 90���̻� = A, B,C,D
 *  
 */
import java.util.Scanner;
public class IF��_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // ����1
	/*Scanner scan=new Scanner(System.in);
		 int a = scan.nextInt();
		 
		if (a%2==0)
		{
			System.out.println(a+"�� ¦��");-
		}
		else
		{
			System.out.println("a��"+a+"  Ȧ��");
		}
		
		//����2 
		char b= 'Z';
				 
	   if (b>='A' && b<='Z')
		{
		   System.out.println(b+"�� �빮��");
		   }
	   else
	   {
		   System.out.println(b+"�� �ҹ���");
	   }
	   */
	   
	   //���� 3
	   
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
		System.out.println("F�Դϴ�");
		}
		else
		{
			if(average>=90 && average<=100)
			System.out.println("A�Դϴ�");
			if(average>=80&& average<90)
				System.out.println("B�Դϴ�");
			if(average>=70&& average<80)
				System.out.println("C�Դϴ�");
			if(average>=60&& average<70)
				System.out.println("D�Դϴ�");
		} 	
		*/
	}
	


}
