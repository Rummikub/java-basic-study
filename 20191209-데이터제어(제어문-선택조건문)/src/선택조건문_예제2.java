// ��ǻ�Ͱ� ������ �߻�, ����� �Է°� ==> ����, ����, ��
 import java.util.Scanner;
public class �������ǹ�_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,2 :  ����,����,��   ===> ��� ���α׷��� ������ �����Ѵ�
	 int com=(int)(Math.random()*3);
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.print("����(0),����(1),��(2): ");
	  int user=scan.nextInt();
	  
	  // ����
	 if (com==0)
			 System.out.println("��ǻ��: ����");
		 if (com==1)
			 System.out.println("��ǻ��: ����");
		 if (com==2)
			 System.out.println("��ǻ��: ��");
		 
	  if(user==0)
		  System.out.println("�����: ����");
	  if(user==1)
		  System.out.println("�����: ����");	 
	  if(user==2)
			  System.out.println("�����: ��");
	  
	  // ���  --> com-user
	  /*if(com==0) //  ����
	  {
		  	if(user==0) // ��
		  	{
		  			System.out.println("����");
		  	}
			if(user==1) // ��
		  	{
				System.out.println("�̰��");
		  	}
			if(user==2) // ��
		  	{
				System.out.println("����");
		  	}
		  	}
	  if(com==1) //  ����
	  {
		  	if(user==0) // ��
		  	{
		  			System.out.println("����");
		  	}
			if(user==1) // ��
		  	{
				System.out.println("����");
		  	}
			if(user==2) // ��
		  	{
				System.out.println("�̰��");
		  	}
		}
	  if(com==2) //��
	  {
		  	if(user==0) // ��
		  	{
		  			System.out.println("����");
		  	}
			if(user==1) // ��
		  	{
				System.out.println("�̰��");
		  	}
			if(user==2) // ��
		  	{
				System.out.println("����");
		  	}
		  }
		  */
	  // player wins when -1,2   com wins when 1,-2
	  
	 int result=com-user;
	 
	 if(result==-1 || result==2)
			System.out.println("WIN");
	 if(result==1 || result==-2)
			System.out.println("LOSE");
	 if(result==0)
			System.out.println("TIE");
	 }
	}
    
