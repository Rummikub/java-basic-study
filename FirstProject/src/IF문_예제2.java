/*
 * ���� �ΰ��� �����ڸ� �޾Ƽ� ��Ģ����
 * 
 * ù��° ���� �Է� : 10
 * �ι�° ���� �Է� : 20
 * ������ �Է�: +   ==>String op = scan.next()
 * 											char c = op.chaAt(0)
 * 
 * ����� 
 * =) 10+20=30
 */

import java.util.Scanner;

public class IF��_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������Է�
	Scanner scan=new Scanner(System.in);
	System.out.print("ù��° ������ �Է��ϼ���");
	int first=scan.nextInt();
	
	System.out.print("�ι�° ������ �Է��ϼ���");
	int third=scan.nextInt();
	
	System.out.print("�����ڸ� �Է��ϼ���");
	String op = scan.next();
	
	// ������ ��ȯ
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
			System.out.println("0���� ���� �� ����");
		else
		System.out.println(first+"/"+third+"="+(first/third));
	}

	
	}

}
