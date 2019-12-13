/*
 * 			알파벳을 대문자로 입력
 * 				DDD===>AAA
 * 				ZZZ ===> WWW
 */
import java.util.Scanner;
public class 반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("대문자 여러개 입력:");
	String a=scan.next();
	
		for(int i=0; i<a.length();i++)    // 문자a의 길이까지
		{
			char c=a.charAt(i);
			System.out.print ((char)(c-3));
		}
		
	}

}
