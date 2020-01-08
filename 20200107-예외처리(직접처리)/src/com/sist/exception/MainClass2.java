package com.sist.exception;
/*
  	Exception �� ����
  	=============
  			���ܺ���: try ~ catch ( ���� ó�� ) 		==========> 70%
  			����ȸ��: throws ( ���� ó�� )  => �ý��ۿ� ���� ó�� 
  			���ܹ߻�: throw ( ����� ���� ����ó��)
 			==========================================
 				 try ~ catch ~ finally ( �����ص� ���� ) 
 				����)
 						try
 						{
 								���� ������ �� �� �ִ� ����
 								1�� ����
 								2�� ����
 								3�� ����				=> 1���� ���� �߻�   = 1,2,6,9,10����  ( catch ���� �ϰ� �������� )
 								4�� ����
 								5�� ����
 						}catch (����Ǵ� ���� 1) 
 						{
 								���� ����
 								6�� ����
 						}catch (����Ǵ� ���� 2)
 						{
 								���� ����
 								7�� ����
 						}catch (����Ǵ� ���� 3)
 						{		���� ���� 
								8�� ����
 						}  finally    ~ ���� ����
 						{
 								(���� ���� or ���� ������ �����ϵ�) ������� ������ �����ϴ� ����          & ������ ������ ���� �� 
 								9�� ����
 						}
 								10�� ����					===> ������ �ȳ��ٸ�? 1,2,3,4,5,9,10
 				**������ **				
 								try
 								{  
 								   for(int i=0; i<10; i++)
 								   	{
 								   			try
 								   			{
 								   			���๮�� ==> i ==5 ���ܹ߻�  :  1) i~4���� �������� ��.
 								   			}catch(Exception e) {}     ==> i~4 ���� 6~i ���� ����  ( for���� �������� �ʾ����Ƿ� �ٽ� ���������� �ö󰡾� �ϱ⶧��)
 								} 1)catch(Exception e){}
 					*/	
 
public class MainClass2 {

	public static void main(String[] args) {
		/*
		 * try { for ( int i=1; i<=10; i++) { if (i==5) { int a =10/0; // => �����߻� ���� }
		 * System.out.println("i= "+i); } }catch (Exception ex) // catch ã�´� {
		 * System.out.println("Error"); // ���� �����Ѵ� ( ��������) }
		 */
		for ( int i=1; i<=10; i++)
		{
			try
			{
				if(i==5)
				{
					int a=10/0;
				}
				System.out.println("i= " +i);
			}catch( Exception ex)
		{
				System.out.println("���� �߻�");
			}
		}
	}

}
