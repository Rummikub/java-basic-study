/* ��Ʈ��ũ ���α׷�/ ������ ���α׷��� ¥�� ���� �ڹٸ� ����
 * 	�ڵ� ����ȯ
 * 			--> int + double = double    ---- double�� ��ȯ
 * 			-->  char + int = int ---- int ��ȯ
 * 			--> char c='A';
 * 				c>='A' && c<='Z'     ----- A=65  Z=90   === > char�� ��� ���� => int�� ���� 
 * 
 * 			--> byte+byte = int
 * 			--> short+short=int
 * 			--> char+char=int
 * 	���� ����ȯ : cast ������   --> Ư�� down����ȯ �Ҷ� ��) int > char or double > int
 * 				int==> char
 * 			--> int a=65 ==> char b=(char)a;
 * 			--> char c=65;  (O) / int a=10.7(X)  / float f=10.7;(x)
 */
public class ����ȯ���� 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=(char)65.0;
		System.out.println(c);
		float f=10; 
		System.out.println(f);
		double d='A';
		System.out.println(d);
	}

}
