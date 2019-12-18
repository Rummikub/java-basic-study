/*
 * 정수 두개와 연산자를 받아서 사칙연산
 * 
 * 첫번째 정수 입력 : 10
 * 두번째 정수 입력 : 20
 * 연산자 입력: +   ==>String op = scan.next()
 * 											char c = op.chaAt(0)
 * 
 * 결과값 
 * =) 10+20=30
 */

import java.util.Scanner;

public class IF문_예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수값입력
	Scanner scan=new Scanner(System.in);
	System.out.print("첫번째 정수를 입력하세요");
	int first=scan.nextInt();
	
	System.out.print("두번째 정수를 입력하세요");
	int third=scan.nextInt();
	
	System.out.print("연산자를 입력하세요");
	String op = scan.next();
	
	// 연산자 변환
	char c =op.charAt(0);
	
	if (c=='+')
	{
		System.out.println(first+"+"+third+"="+(first+third));
	}	
	if (c=='-')
	{
		System.out.println(first+"-"+third+"="+(first-third));
	}	
	if (c=='*')
	{
		System.out.println(first+"*"+third+"="+(first*third));
	}	
	if (c=='/')
	{
		if(third==0)
			System.out.println("0으로 나눌 수 없다");
		else
		System.out.println(first+"/"+third+"="+(first/third));
	}

	
	}

}
