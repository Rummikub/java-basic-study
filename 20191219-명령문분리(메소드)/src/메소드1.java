/* 		��ü ���� = �������� ���α׷�
 * 		�޼ҵ� 
 * 		=====
 * 			�ڹ�( ��ü���� => Ŭ���� )    *   Ŭ���� : ���� + �޼ҵ�   * �޼ҵ� : ������ + ���
 * 
 * 	����) 
 * 				������(ó�������)  �޼ҵ��(�Ű����� ...)   => �����
 * 				==============	  ======
 * 					�⺻��								���: ���޼ҵ�� �ҹ��ڷ� ����
 * 					======											getText()    ===> nextInt()
 * 					�迭��
 * 					Ŭ������
 * 					====== ������� ������ 
 * 				{
 * 					=> ������
 * 					����ó��
 * 					��� ( �Ƚᵵ �� ) 
 * 				
 * 					return  �����
 * 				}
 * 		
 * 		** return ���� 1�� ������ ����
 * 
 * 				�������� ��� ==> ��� �����ش�		(�迭)
 * 
 * 		** ��� �޼ҵ�� return�� ������ ����						 
 * 
 * 		** java lang ���� ,void �� return �������� => JVM�� �ڵ����� return�߰�
 * 		-----------------------------------------
 *		** ������� �� �������� ����ؾ� ��    => ����ڰ� ��û�� ��?  ó�����   
 *		** ȣ�� (����ñ�)
 *		-------------------------------------------
 */
import java.util.Scanner;
public class �޼ҵ�1 {
					//  +
					static int plus(int a, int b)
					{
						return a+b;
					}
					// -
					static int minus(int a, int b)
					{
						return a-b;
					}
					// *
					static int multi( int a, int b)
					{
						return a*b;
					}
					//   /
					static double div( int a, int b)
					{
						return a/ (double) b;
					}
					//���� �����
					static void process()	
					{
						Scanner scan = new Scanner(System.in);
						System.out.print("���� 1 �Է�: ");
						int a=scan.nextInt();
						System.out.print("���� 2 �Է�: ");
						int b=scan.nextInt();
						System.out.print("������(+-*/) �Է�: ");
						String op=scan.next();
					
							switch(op)    // {}�� ġ�� ���� ������ ������ ����� �� ����
							{
								case"+":
								{	
									int res=plus(a,b);
									System.out.printf("%d%s%d=%d\n", a, op, b,res);   // ����
								}	
								break;
								case"-":
								{	
									int res=minus(a,b);
									System.out.printf("%d%s%d=%d\n", a, op, b,res);
								}	
								break;
								case"*":
								{	
									int res=multi(a,b);
									System.out.printf("%d%s%d=%d\n", a, op, b,res);  
								}	
								break;
								case"/+":
								{	
									double res=div(a,b);
									System.out.printf("%d%s%d=%f\n", a, op, b,res);       // * double, f����!!
								}	
								break;
							}   // main�� ���� �����ٰ� �� �� ���� ������ �ۿ� ���� �� ��
					}
					public static void main(String[] args) {
						// TODO Auto-generated method stub
						Scanner scan=new Scanner(System.in);
						while(true)
						{
							process();
							System.out.print("y|n �Է�:  ");
							String ex= scan.next();
							switch(ex)
							{
							case "y":
								System.exit(0);   // �����ض�
								break;
							case "n":
								break; 
							}
						}
						//process();  //���⼭ ȣ�� �� �� �־�
						// return;
				
					}

}
