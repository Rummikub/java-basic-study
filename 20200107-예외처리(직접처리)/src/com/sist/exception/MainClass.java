package com.sist.exception;
			/*
			 *  ����ó��
			 *  ====== �ҽ��󿡼� ������ ������ ���� ( ������ ����: ���α׷��Ӱ� ó�� ������ ����)
			 *  		��)		0���� ������  / ���ϸ��� Ʋ���� / IP�� Ʋ���� / URL �ּҰ� Ʋ���� / �迭�� ������ �ʰ�
			 *  
			 *  ���� 
			 *  	1) ������ �߻��� ��������
			 *  	2) ������ �߻��� ������ ���� , ���α׷� ���� �ȵǰ� ����
			 *   
			 *   ����ó��
			 *   							�ڹ�								
			 *   				=============
			 *   				|								|
			 *   			������ (javac) 		����� (java) 
			 *   			==========		==========
			 *   			JVM�� �˻�			����ø��� ����
			 *   		=> �ݵ�� ����ó��	=> �ʿ��ϸ� ����ó��
			 *   			�����
			 *   				=	�޸� �����
			 *   					System.out.print()
			 *   					System.in.read()	
			 *   				= File �����	
			 *   				= ��Ʈ��ũ �����
			 *   	
			 */
public class MainClass {

	public static void main(String[] args) {
		
		int [] arr=new int [6];
		// 6���� ���� ���� - ����ó��   ( unchecked exception ) 
		//try {   
			for (int i=0 ; i<=6; i++)
			{
				arr[i]=(int)(Math.random()*45)+1;		
			}
		//}catch (Exception e) {System.out.println("���� �߻�");}   //������ �߻��� ������ catch���� ������
		
		for( int i=0; i<6; i++)
		{
			System.out.print(arr[i]+" ");
			
			try { 
				Thread.sleep(500);  // ����ó���� ���� ������ ������ ���� ( checked exception ) 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
// try catch�� �κи� Ȥ�� ��ü�� �� ���� �� �ִ� �ΰ��� ��� ����
}
