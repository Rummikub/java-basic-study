// ? : 
// (���ǹ�?��1:��2)  => ��(React=> ���׿�����)
// ���� (true) => ��1
// ���� (false) => ��2
/*<%
 *  				int sex =1;
 *  				if(sex==1)
 *   			{
 *  %> 
 *  				����
 *  
 * <%  
 * 				}
 * 				else
 * 				{
 *<%
 * 				����
 * %>
 * ====================     JSP�� �ڵ��ϴ� �� 
 * <%
 * 			sex==1? "����" : "����"
 * %>
 */
import java.util.Scanner;
/*
 * ����, ����, ���� ������ �Է¹޾Ƽ� ��� => ����� 60�̻��̸� pass,  nopass
 *    //���� ���̸� �Է� ==>15�� �̻��̸� (��ȭ��������)/ ���ϸ� (��ȭ�����Ұ�)
 *    // ����2 �¼� => 12345=>124=> �¼����� �Ұ��� ,35=> �¼����� ����
 */
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ����: ");
		//����
		int kor=scan.nextInt();
		System.out.print("���� ����: ");	
		int eng=scan.nextInt();
		System.out.print("���� ����: ");
		int math=scan.nextInt();
		
		int avg=(kor+eng+math)/3;
		
		String result=avg>=60? "Pass":"NonPass";
		System.out.println("���:"+result);
		

		// ����
		Scanner scan1 = new Scanner(System.in);
		System.out.print("����: ");
		int age=scan1.nextInt();
		
		 result = age>=15?"��ȭ��������":"��ȭ�����Ұ�";
		 System.out.println("���: "+ result);
		
		 
		 // ����2
			Scanner scan2 = new Scanner(System.in);
			System.out.print("�¼� ��ȣ: ");
			int seat=scan2.nextInt();
			
			 result=(seat==3||seat==5)?"�¼����Ű���":"�¼����źҰ���";

			 System.out.println("���: "+ result);
			 
	}

}
