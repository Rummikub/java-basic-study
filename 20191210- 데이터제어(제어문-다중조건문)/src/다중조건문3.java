import java.util.Scanner;

/*
 *  ���� 2���� �Է� �޾Ƽ� ==> ������1�� ==> ��Ģ����
 *  �ڹپ� => �Է��� ���� ��=> char�� ���� �� ����, String���� �޾ƾ� �Ѵ�.
 *  String => (==), equals   �ּҸ� ���ϴ°��� == ��
 */
public class �������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a=(int)"10"
		// Integer.parseInt("10")
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ����:  ");
		 int num1=scan.nextInt();
		 
		 System.out.println("�ι�° ����: ");
		 int num2=scan.nextInt();
		 
		 System.out.println("������");
		  String op=scan.next();
		  
		  //ó��
		  //����� ���
		  if(op.contentEquals("+"))
		  {
			  System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);  //d ������
			  // printf \n = println   but ���ڰ� ���� ����  f���°� ����
		  }
		  else if(op.equals("*"))
		  {
			  System.out.printf("%d*%d=%d\n",num1,num2,num1*num2); 
		  }  
		  else if(op.equals("-"))
		  {
			  System.out.printf("%d-%d=%d\n",num1,num2,num1-num2); 
		  }
	      else if(op.equals("/"))
	      {
			  if(num2==0)
				  System.out.println("0���� ���� �� ����");
			  else
	    	  System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2); 
			  //=> �ڵ�����ȯ�� �ȵǱ� ������ ���� ����� �Ѵ�.+
	      }
	      else 
	      {
	    	  	System.out.println("ERROR");
	      }
	}

}
