/*
 * 		��������� (+,-,*,/,%) : �ٸ� ��.������ ������� ���
 * 		1)int ���� ��������(byte,short,char) = ����ó�� => int �ιٲٸ� �ڵ�����ȭ byte�� �Ἥ �ٲٸ� ���� ����ȭ!
 * 			byte + byte => int
 * 			char + byte => int
 * 			short+byte+char => int
 * 
 * 			byte+int => int
 * 			short+char+int => int       					��, ���� ū ������������ �ٲ��
 * 
 * 		   short+char+int+double => double  => String 
 * 								""+77 ==> "77"     - ���ڰ� ����� ���� ���� ���ڿ��� �޴�  String�� double���� �� ū �������� ���ȴ�.
 */
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b=110;
		//byte c=20; 
		//byte d=(byte)(b+c);
		//System.out.println(d);
		//byte b=(byte)300;
		//System.out.println(b);
		//System.out.println(Integer.toBinaryString(300));
		/*
		 *  300
		 *  		1         00101100 ( ������ ����� �ᱹ�� �ڿ��� 8bit�� �����Ѵ� ) = 32+8+4  �ڿ��� N�ڸ� ��ŭ �����Ѵ�.
		 */
		int a=(10+20)*3;
		System.out.println(a);
	}

}
