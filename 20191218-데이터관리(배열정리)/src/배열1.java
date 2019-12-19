/*   ====  �迭�� for���� �̿��ؼ� �޷��� ������
 * 
 * 
 * 
 *  1. ��� ���( ������ )
 *  		�迭 ==> Ŭ���� ==> ��Ű�� ==> ���̺귯�� (jar)
 *  		===
 *  		
 *  				���α׷�
 *  					������+ ��ɹ� ( �޼ҵ�) => Ŭ����
 *  					============
 *  								Ŭ���� ������ ==> ���� (�ڹ�CBD)
 *  
 *  2.   �ڹ� ==> ����Ŭ ( ������ ���� ��ġ) => HTML (CSS, JavaScript) ==> JSP ==> MVC ==> Spring 
 *  		( 	����   )  																	==========================    ==============
 *  																									Front(����Ʈ,��,����db)								Back*****
 *    ==> Kotlin( ����� ��� )
 *    ====================================> ����
 *    
 *    	�迭 ���� : ������, ������ �Ұ����ϴ�   ======> ������ ( ArrayList )    === > ���� ���������� ��Ƽ� ���
 *    	======
 *       �׷���)  ����� => �޸� ũ�⸦ ����
 *       ============================
 *       		1) ����
 *       				int [] arr;
 *       				===  === �迭�� ( ���� ����� ������ �ּ�)
 *       				��������
 *       
 *       		2) �ʱ�ȭ -- �޸𸮸� ����� ���� �־��� ������ �ϱ� ���� ����� ��
 *       				arr={1,2,3,4,5}
 *       				arr=new int[5]  => �޸� ���� �Ҵ� => ������ ����
 *       
 *       		3) ���� �б�, ���� ==> �ε���
 *       	
 *       				int[]arr= { 10,30,40,50}
 *       					arr										arr[0] [1]  .....    ==> ������ �Ȱ��� ���
 *       				=======							=====================
 *       						100											10		30 		40			50
 *       				=======								|====================
 *																	100       						
 */
import java.util.*;
import java.text.*;
public class �迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * �޷� ���!!						============>  �޼ҵ尡 4�� + ( ����ȭ�� ����)
			 *  1) 20XX�⵵, �� �Է¹޴´�
			 *  2) 1���� ���� ��� -> �� for�� ������ ����Ͽ� �Ʒ��� ����
			 *  3) ���������� �����ΰ�
			 *  4) ���
			 */

	
//	while(true)
//	{
//		Date date = new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:dd");
//		System.out.println(sdf.format(date));
//		try
//		{
//			Thread.sleep(1000);   // sleep �ʸ��� �ϳ��� ����ϴ� ��
//		}catch(Exception ex) {}
//		
//	}
		
		  Scanner scan= new Scanner (System.in); 
		
		  System.out.print("���� �Է��ϼ���: "); 
		  int year= scan.nextInt(); 
		  
		  System.out.print("���� �Է��ϼ���: ");
		  int month=scan.nextInt(); 
		  
		  System.out.print("���� �Է��ϼ���: ");
		  int day=scan.nextInt(); 
		  
		  System.out.println(year+"��"+month+"��"+day+"��");
		 System.out.println("\n");
		 
		/*
		 * System.out.print("��\t"); System.out.print("��\t"); System.out.print("ȭ\t");
		 * System.out.print("��\t"); System.out.print("��\t"); System.out.print("��\t");
		 * System.out.print("��\t");
		 */
		 
		 char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		 // MONTH => 0   +1
		 // DAY_OF_WEEK => 1 -1
		 
		 Calendar cal=Calendar.getInstance();
		 int y=cal.get(cal.YEAR);
		 int m=cal.get(cal.MONTH)+1;
		 int d=cal.get(cal.DATE);
		 int w=cal.get(cal.DAY_OF_WEEK);
		 System.out.println(y+"�⵵"+m+"��"+d+"��"+ strWeek[w-1]+"����");
		 System.out.println();
		 
		 
		 for(int i=0; i<7;i++)
		 {
			 System.out.print(strWeek[i]+"\t");
		 }
		 
		 //1 ���� ���� ?    v  ������ ������ �Ѵ�
		 /*
		  *  ���⵵�� 12/31������ �� 
		  */
		  
		    int total=(year-1*365)
		    			+ (year-1)/4
		    			-(year-1)/100
		    			+(year-1)/400;
		    
		  /*  ���ޱ����� ��
		  *  +1 ====> %7 ==> ������ ���Ѵ�
		  */
		    
		    int[] lastDay= {31, 28, 31, 30,  31, 30, 31, 31,30,31,30,31};
		    if((year%4==0)&&(year%100!=0)||(year%400==0))
		    	lastDay[1]=29;
		    else
		    	lastDay[1]=28;
		    
		    for(int i=0; i<month-1; i++)
		    {
		    	total+=lastDay[i];
		    }
		    // +1 
		    total++; // ������ 1����
		    
		    
		 int week=total%7	 ;   // 0= �Ͽ��� / ���ϰ��
		
		 
		 System.out.println();
		 for(int i=1; i<=lastDay[month-1]; i++)
		 {
			 if(i==1)
			 {
				 for(int j=0; j<week; j++)
				 {
					 System.out.print("\t");
				 }
			 }
			 System.out.printf("%2d\t", i);
			 week++;
			 if(week>6)
			 {
				 week=0;
				 System.out.println();
			 }
		 }
		 
		 
		// ��¥�� �Էµǰ� �غ�
		 

		//System.out.println("������: "+ (total+day)%7);
		
	}

}
