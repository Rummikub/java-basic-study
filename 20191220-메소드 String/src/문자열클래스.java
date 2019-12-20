// String : ���ڿ��� ����
/*
 *   java.lang => import�� ������ �� �ִ�
 *   ���ڿ��� �����ϴ� ���
 *   		1)	 String ������ = " Hello Java ";
 *   		2) 	 String  ������ = new String (" ");   ���� ���ڿ� => ������ ����
 *   														===
 *   														���ο� �޸𸮿� ����
 *   
 *   String ���� �����ϴ� ���
 *   1)  equals : ����� ���ڿ� ��ġ ����  (true/false)
 *   			ID , PW ; �α���( ��ҹ��� ����)
 *   			���ڿ���(==)�� ����ϸ� �ȵ�.
 *   
 *   		String s= " Hello ";
 *   		String s1= " Hello" ;   				// �ּҰ��� �����ϱ� �񱳰� ��
 *   		String s2= new String ("Hello");
 *   			if (s==s1)  true    (s1==s2) false
 *   => �׷��ϱ� s.equals(s1) �̰� ���
 *   
 *   => ����
 *   			boolean equals(String data) 
 *   
 *   2)  substring : ���ڿ��� �ڸ���
 *   			String s = "0123456789";
 *   			substring(3)   =>3456789
 *   			String s= "112��,15���̻������"
 *   			substring(0,3)   => " 112"
 *   									== end-1     === > 012				
 *   			substring(int start)
 *   			substring( int start, int end)
 *   3)  length  : ���ڿ� ����
 *   		String s="Hello ȫ�浿";
 *   4)  trim : �¿��� ���鹮�� ����
 *   		String s="Hello Java";
 *   						=> s.trim().length
 *   5)  startsWith, endsWith
 *   			; ���۹��ڿ��� ���� ��, �ձ���/�ޱ��ڰ� ���� ���� ã�ƶ�   ex) �˻���
 *   			startsWith("�ڹ�")
 *   6)  indexOf, lastIndexOf
 *   		������ ��ġ( indexOf: �տ���, lastIndexOf: �ڿ���)
 *   		String s="Hello Java";
 *   		s.indexOf('a') =  7
 *   		s.lastIndexoOf('a') = 9
 *   7)  split
 *  		String s="�̺���, ������, ����, ������, ������"  
 *  		String [] names= s.split(,);
 *  	 	���Խ�  ( ip�ܾ���� ��)
 *  		=====
 *  				211.238.142.181
 *  				211.238.142.180
 *  				211.238.142.1
 *  				211.238.142.0
 *  				211.238.1.1
 *  				[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3}\\.[0-9] {1,3}      = ���� 0���� 9���� / ���� ���ڸ����� ���ڸ�����
 *  /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])   = email���Խ�
 *   8)  toUpperCase, toLowerCase   : ��/�ҹ��� ��ȯ
*				String s="Hello";
*				s.toUpperCase()		==> HELLO
*				s.toLowerCase() 		==> hello
 *   9) replace,replaceAll    ===> ���Խ�
 *   							String s="113��"
 *   							s.replaceAll("[^0-9]","")  ==>113     			^�� �ǹ�: ������
 *   							s.replaceAll("^[0-9]","")   								 ^[ �� �ǹ� : ���ڷ� �����ϴ�
 *   							s.replaceAll("[0-9]$","")									]$�� �ǹ� : ���ڷ� ������   
*   							s.replaceAll("[^��-�R]","") 
 *   							s.replaceAll("[^A-Za-z]","") 
 *   		=======
 *   			���� ==>   String s="Hello Java"
 *   									s.replace('a','b') ="Hello Jbvb"
 *   
 *   10)  contains ()  : ���Ե� ���ڸ� ã�� ���
 *  
 */
import java.util.Scanner;
public class ���ڿ�Ŭ���� {
	
	static String[] autoComplate(String data)
	{
		String[] ss= {
				"�ڹٿ�JSP","�ڹ� ���α׷���", "������ 5","Ajax�� JSP","�������� ����Ʈ",
				"�ڹٿ� ����Ŭ","MVC ����","��Ʋ���� �ȵ���̵�","��Ʋ�� ���α׷�","������ ������",
				"ȥ�� ���� �ڹ�","�������� ���α׷�","�� ���α׷�","�ڹ� �����α׷�","����Ŭ �ڹ�"
		};
		String[] findData= new String[10];
		int j=0;
		for(int i=0;i<ss.length; i++)
		{
			if(ss[i].contains(data))
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�: ");
		String data=scan.next();
		
		String [] fd=autoComplate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
			{
				System.out.println(fd[i]);
			}
		}
		
		
	}

}
