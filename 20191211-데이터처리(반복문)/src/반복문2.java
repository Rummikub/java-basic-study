// A~Z =>  5����
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;     									//  ������ ��� ����  
		char	a='A';
		while(i<=26) 							//  ���ĺ�����
		{
			System.out.print(a++ + "\t");
			if (i%5==0)
				System.out.println();
			i++;
		}
		
		
		// ù���� �빮��, ��°�� �ҹ��� ,��°�� �빮�� ...
		System.out.println("\n"+"\n");
		i=1;
		char b='A';
		boolean bCheck=true;
		while(i<=26)
		{
			if(bCheck==true)
				System.out.print(b+"\t");
			else
				System.out.print((char)(b+32)+"\t");
			if(i%5==0)
			{
				System.out.println();
				bCheck=!bCheck;
			}
			// 2,4,6�� �ҹ��� ����� ��� �Ѵ�;;

		}
		
	}

}
