/*
 *  	������ => dan�� �Է� �޾Ƽ� 
 *  
 *  		���α׷�   --------   ����� ���� +java���̺귯��+ �ܺο��¼ҽ�( mvnrepository.com)
 *  														=====================  ���� ����
 *  
 *  														5*1=5
 *  														5*2=10         --- ���������� �ʿ��ϰڱ��� 1~9
 */
import java.util.Scanner;
public class �ݺ���8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		int dan=scan.nextInt();    					//**** �Է°��� �޴°� ��������
		
		//ó��
		int i=1;
	
		while(i<=9)
		{
			System.out.printf("%2d  *  %2d  =  %2d\n",dan,i,dan*i);
			i++;

		}
	
		
	}
	

}
