// 답이 정답과 맞는지
import java.util.Scanner;
public class 배열12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

			char [] dap=new char [10];
			for(int i=0; i<dap.length; i++)
			{
				int k=(int)(Math.random()*2);
				if (k==0)
					dap[i]='O';
				else
					dap[i]= 'X';
			}
			// 출력
		/*
		 * for(char c: dap) { System.out.print(c+"  "); }
		 */
			
			// 사용자의 예측과 얼마나 맞나
			char[] user=new char [10];
				Scanner scan = new Scanner(System.in);
				
				for(int i=0; i<user.length;i++)
				{
					System.out.print((i+1)+"번 답: ");
					String s=scan.next();
					
					 user[i]=s.charAt(0);
				}
	// 출력
				System.out.println("정답: ");
				for ( char c: dap)
				{
					System.out.print(c+"  ");
				}
				System.out.println("\n 사용자 입력값 : ");
				for(char c:user)
				{
					System.out.print(c+"  ");
				}
				
				System.out.println("\n 결과: ");
				
				int count=0;
				for(int i=0;i<dap.length;i++)
				{
					if(dap[i]==user[i])
						count++;
				}
				System.out.println("점수 : "+ ( count*10) + "점");
	}
	
	

}
