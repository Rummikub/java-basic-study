// ������� �Է°��� �޾Ƽ� (¦/Ȧ)
import java.util.Scanner;
public class ���׿�����_�񱳿�����2 {
	
		 public static void main(String[]args) {
			 Scanner scan=new Scanner(System.in);
			 System.out.println("���� �Է�:");
			 int num=scan.nextInt();
			 
			 String result =num%2==0 ?"¦��":"Ȧ��";  // if ~else (���ǹ�)
			 System.out.println(num+" is "+result);
			 
		 }
}
		 
