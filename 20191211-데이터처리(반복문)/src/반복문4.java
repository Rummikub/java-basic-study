//   ==> ���� ==> charAt(0)     -- ���� ���Ե� ���� ����� ã�� �޼ҵ�
// String s="abcdefghijklmnopqrstuvwxyz"

public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s= " theFaskInKUVzqfza";
			System.out.println("s= "+s);
			
			int  i=0;     				// ������ ���ϱ� 0���� ����
			int count=0; 				// a�� ����� ������
			while (i<s.length())    //  �� ������ ����� Ȯ�����ִ� �޼ҵ�    * �ڹٴ� 0���� ����, �ϳ��� ������Ѵ�
			{
				 System.out.println((i+1)+"��° ����:  "+s.charAt(i));
				 char c=s.charAt(i);
				 if( c=='a' || c=='A')
					 count++;
				 i++;
			}
			
	}

}
