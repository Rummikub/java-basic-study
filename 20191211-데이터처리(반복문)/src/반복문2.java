// A~Z =>  5개씩
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;     									//  루프를 몇번 돌지  
		char	a='A';
		while(i<=26) 							//  알파벳개수
		{
			System.out.print(a++ + "\t");
			if (i%5==0)
				System.out.println();
			i++;
		}
		
		
		// 첫줄은 대문자, 둘째는 소문자 ,셋째는 대문자 ...
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
			// 2,4,6은 소문자 출력은 어떻게 한담;;

		}
		
	}

}
