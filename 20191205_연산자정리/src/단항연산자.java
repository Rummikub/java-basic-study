
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10;
			int b=a++;
			int c=++a;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			char ch='A';
			System.out.println(++ch); //  증가 65->66 하고 출력 B한다.
			
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
			// 증감연산자 ==> 반복문 
			
			// ! => 부정연산자 => boolean => 조건문을 만들 때   ~ 조건을 제외할때 조건 달고 앞에 ! 붙이면 된다.
			// 3,5      124678   => !(seat==3||seat==5)
	}

}
