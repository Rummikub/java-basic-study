//����)
//�̸�, ����, ���� ,�ּ�, ��ȭ��ȣ �Է¹޴� ��    == > ���� ���輺�� ���� ������ �迭�� �ƴϴ�.
// �̸��� ���� �Է��϶� ==> ���谡 �����ϱ� �迭�� ó�� ��

/*
 *  ���� ) ����, ���� �Է¹޾� ���� ������ ���� ����϶�
 *  30. 31. 28(29)
 *  ���� = �ϰ� ó���� ����
 */

import java.util.Scanner;
 public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year,month;   // int[] data=new int[2]    but �ּ� 3���� �迭�� �����ϴϱ� pass
		
		Scanner scan= new Scanner(System.in);
	
		System.out.print("�⵵�� �Է��Ͻÿ�:");
		year=scan.nextInt();

		System.out.print("���� �Է��Ͻÿ�:");
	    month=scan.nextInt();
	    
	    int lastDay=0;    // ���������� �����;� �ϴϱ�
		/*
		 * if (month==4|| month==6|| month==9|| month==11) { lastDay=30; } else if
		 * (month==2) { if ((year%4==0 && year%100!=0) || (year%400==0)) //���� ���� {
		 * lastDay=29; } else { lastDay=28; } } else // ���� ������� ���� �ָ� else�� ���� {
		 * lastDay=31; }
		 */
	    
	    
	    
	    switch(month)   //  ������� �ѹ����� ������ �ȴٸ�  switch case�� ���ϴ�
	    {
	    	case 4:	case 6:  case 9:  case 11:
	    				lastDay=30; 
	    				break;
	    	 case 2 : 
	    		if ((year%4==0 && year%100!=0) || (year%400==0))
	    		{
	    			lastDay=29;
	    		}
	    		else
	    		{
	    			lastDay=28;
	    		}
	    				break;
	    				default:
	    							lastDay=31;
	    }
		System.out.println("������ �� : " +lastDay);
	}


}
