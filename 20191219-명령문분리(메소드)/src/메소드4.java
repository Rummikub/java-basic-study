/*		=========================
 * 		1. �޼ҵ� ȣ��
 * 		2. �޼ҵ� ������� ����
 * 		3. ��Ͼȿ� �ִ� ��� ���� ����
 * 		4. �޼ҵ� ȣ�� ��ġ�� ���ư���
* 		=========================
*     
* 		�Խ���
* 			������ return					�����Ͱ��� �־ �޾Ƽ� ó���Ѵ�
* 			= �Ű�����:page   
* 			���뺸�� return														====> �� ������ �޼ҵ��
* 			=�Ű�����: �Խù� ��ȣ  ; �迭�� ÷�� / ������: Ŭ���� 
* 			�۾���	 void       �Ű����� ����
* 			�����ϱ� void  �Ű����� ����
* 			�亯�ޱ� void �Ű����� ����
* 			�����ϱ� void
* 			ã��  return
* 			= �Ű�����: �˻��� / ������ : �迭
* 			������ void     /  String���ε� �����ѵ� ���� �� ������ �����غ�
* 			= �Ű����� : ��
* 			�α��� 
* 			= id,pw / String (����� ���� 3+)
* 
* 			[�޼ҵ� ����]
* 			set =  ���� �ִ´�  ex) void
* 			get  = ���ڸ� ����´�  ex) return     											�ζ� �����ȣ �޶� =    return�� :     get     / �Ű����� :     ������
* 			is = boolean, ���翩��    ex) boolean is login
* 
* 
* 			�Ű������� Ʋ���� �ٸ� �޼ҵ��.
 */         

import java.util.Scanner;
public class �޼ҵ�4 {

		static void gugudan(int dan)
		{
			for(int i=0; i<=9; i++)
			{
				System.out.printf("%d*%d=%d\n",dan, i, dan*i);
			}
		}
		
		static String  gugudan2(int dan)   // String�� return������ �޴´�
		{
			String result=" ";
			for(int i=0; i<=9; i++)
			{
				result+=dan+"*"+i+"="+(dan*i)+"\n";
						
			}
			return result;
		}
		
		static void process() 
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �Է�:  ");
		int dan = scan.nextInt();
		// ������ ���
		String res= gugudan2(dan);
		System.out.println(res);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			process();  
	}	 										// main������ ��ü�� �����ϴ� process�� ����ϴ� ��
}
