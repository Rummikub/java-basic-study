/*
 * String = Ŭ���� ,   ���� : �޼ҵ�  , ����ȯ�� �ȵȴ� ���!!  = 4byte (��ü, �޼ҵ�Ѵ� )
 *  	String : ���ڿ� ����
 *  =======
 *  			���
 *  			1) ���ڿ��� �и�     substring()
 *  			2) ���� ã��					indexOf(), lastIndexOf()
 *  														c:\javaDev\javaStudy
 *  			3) ���� �� 				equals
 *  														equals IgnoreCase  -- ��ҹ��� ���� x
 *  			4) ���鹮�� ����		trim()
 *  			5) ��ҹ��� ����		toUpperCase,toLowerCase
 *  			6) ��� ���������� ���ڿ��� ���� valueOf()
 *  			7) ������ ���� 			length()
 *  			9) ���� 						 replace, replaceAll
 *  	
 *  			String ==> char[]
 */
public class ���ڿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s=   " Hello Java !!";  // ���鵵 ���ڴ� :12��
								//  012345
			System.out.println("���ڼ�:"+s.length());
			System.out.println(s.substring(0,5));
			//5�� ����  (endIndex �� -1�̴�)
			System.out.println(s.replace("l", "k"));
			System.out.println(s.toUpperCase());
			System.out.println(s=s.toLowerCase()); // s ���� ��ü���� ��ȭ ��ų ���� ����.
			System.out.println(s);
			System.out.println(s.trim());
			// �̴º�ȯ �޼ҵ� �ȿ����� ���� ������ s���� ��ü�� ��ȭ���� �ʴ´�. 
			System.out.println(s.indexOf("l"));
			System.out.println(s.lastIndexOf("l"));
			
			String s1="Hello";
			String s2="hello";
			
			String res=s1.equalsIgnoreCase(s2)?"����":"�ٸ���";
			System.out.println(res);

	}

}
