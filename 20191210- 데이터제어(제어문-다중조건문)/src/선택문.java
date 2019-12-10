import java.util.Scanner;

/* ���� if  <=======> switch
 * => Servlet <====> JavaServerPage  ==> ModelViewControler ==> Ʋ(Spring)
 * ���ù� : �Ѱ��� ���� �޾Ƽ� ó�� (�ѹ��� ���� => break)
 * 			����, ��Ʈ��ũ ...
 * 
 *  ����)								
 *  								1        === 1+2 �� out
 *  				switch(����)  ===> ����, ����, ���ڿ�
 *  				{
 *  					 case1  : 
 *  						ó��
 *  							break;
 *  					case2 :
 *  						ó��	
 *  					case3 :
 *  						ó��
 *  							break;
 *  					===========
 *  					default :
 *  						ó��
 *  					============ ������ ����
 *  				}
 *  
 *  				if(score==10 || score==9)    'A'
 *  
 *  				switch(����)
 *  				{
 *  						case 10:
 *  						case 9:
 *  							'A'
 *  				}
 */
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ����:  ");
		 int num1=scan.nextInt();
		 
		 System.out.println("�ι�° ����: ");
		 int num2=scan.nextInt();
		 
		 System.out.println("������");
		  String op=scan.next();
		  
		  // ó��
		  switch(op)
		  {
		  case "+" :
			  System.out.printf("%d+%d=%d\n",num1,num2,num1+num2); 
			  break;
		  case "-" :
			  System.out.printf("%d-%d=%d\n",num1,num2,num1-num2); 
			  break;
		  case "*" :
			  System.out.printf("%d*%d=%d\n",num1,num2,num1*num2); 
		  	  break;
		  case "/" :
			  if(num2==0)
				  System.out.println("0���� ���� �� ����");
			  else
	    	  System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2); 
			  break;
			default:
				System.out.println("ERROR");
		  }
			
	}

}
