/*
 * 			���ĺ��� �빮�ڷ� �Է�
 * 				DDD===>AAA
 * 				ZZZ ===> WWW
 */
import java.util.Scanner;
public class �ݺ���6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("�빮�� ������ �Է�:");
	String a=scan.next();
	
		for(int i=0; i<a.length();i++)    // ����a�� ���̱���
		{
			char c=a.charAt(i);
			System.out.print ((char)(c-3));
		}
		
	}

}
