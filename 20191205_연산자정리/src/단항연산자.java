
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10;
			int b=a++;
			int c=++a;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			char ch='A';
			System.out.println(++ch); //  ���� 65->66 �ϰ� ��� B�Ѵ�.
			
			int i=10;
			// 				i+1       i+1                                i+1       i+1     i- 1 
			int j=i++ + i++  + ++i + ++i + i++ + i++ + i-- + --i;
			// 				10 		11 	13	14		14		15	16		14
			System.out.println(j);
			
			int x=10;
			int y=9;
			
			boolean bCheck=!((x>y)||(++y==x));
			
		
			System.out.println(bCheck);
			System.out.println("x= "+x);
			System.out.println("y= "+y);
			// ���������� ==> �ݺ��� 
			
			// ! => ���������� => boolean => ���ǹ��� ���� ��   ~ ������ �����Ҷ� ���� �ް� �տ� ! ���̸� �ȴ�.
			// 3,5      124678   => !(seat==3||seat==5)
	}

}
