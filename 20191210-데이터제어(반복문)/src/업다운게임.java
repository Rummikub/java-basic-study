/*
 * 			��ǻ��   =>  1~100������ ������ ���� ����
 * 
 * 			��Ʈ =>  UP  / DOWN
 */
import java.util.Scanner;
public class ���ٿ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �߻�	�Ͷ�������
				int com=(int)(Math.random()*100)+1;
				Scanner scan=new Scanner(System.in);
				while(true)
				{
					System.out.printf("1~100������ ���ڸ� �Է��ϼ���: ");
					int user=scan.nextInt();
					
					//����   === >  ����ó���Ҷ��� or�� �� ȿ����
					if(user<1 || user>100)
					{
						 System.out.println("ERROR");
						 continue;// while => ���ǽ����� �̵�
					}
					//  ó��
					if(com>user)
					{
						System.out.println("UP");
					}
					else if(com<user)
					{
					  System.out.println("DOWN");
					}
					else 
					{
						System.out.println("GAME OVER");
						System.exit(0);
						
						//���� 		1) break;   // �̽������� while�� ����2) System.exit(0);
						
					}
				}
			
				
						
	}

}
