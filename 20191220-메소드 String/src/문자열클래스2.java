//�α���â�� ����� ���� 

//equals => return (boolean)
// ����� ���ڿ��� ������ Ȯ���ϴ� �Լ� 
/*
 *  equals : ��ҹ��� ���� ��
 *  equalsIgnoreCase:  ��ҹ��� ���� ���� ��
 *  
 *  startsWith : ���۹��ڰ� ���� ��� (true)
 *  endsWith : ������ ���ڿ��� ���� ��� (true)
 *  contains : ���忡 ���ڿ��� ���Ե� ��� (true)
 */
import java.util.Scanner;
public class ���ڿ�Ŭ����2 {
	// �´� ���̵� �α��� ����
	static boolean isLogin(String id, String pw)
	{
		boolean bCheck=false;
		final String ID = "admin";
		// ID = "aaa";  (X) ����̱� ������ ���ϴ� ���� ���� �� ����
		
		final String PW="1234";
		if(id.equalsIgnoreCase(ID)	&& 	pw.equals(PW))      // : ��ҹ��� ���о��� Case�� Ignore
		//if(id.equals(ID)	&&	pw.equals(PW))
		{
			bCheck=true;
		}
		return bCheck;
	}
	// �Է°� - ���� ���̵�� �´��� 
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("ID �Է�: ");
			String id=scan.next();
			System.out.print("��й�ȣ �Է�: ");
			String pw=scan.next();
			
			boolean bCheck=isLogin(id,pw);
			
			if(bCheck==true)
			{
				System.out.println(id+"�� �α��� �Ǿ����ϴ�");
				break; // while���� ������ ����
			}
			else
			{
				System.out.println("���̵� �н����尡 Ʋ�ȴ�  \n �ٽ� �Է��Ͻÿ�");
			}
		}
	}
	
	public static void main(String[] args) {
       process();
	}

}
