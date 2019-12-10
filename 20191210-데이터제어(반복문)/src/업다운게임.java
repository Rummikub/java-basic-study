/*
 * 			컴퓨터   =>  1~100사이의 임의의 수를 추출
 * 
 * 			힌트 =>  UP  / DOWN
 */
import java.util.Scanner;
public class 업다운게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생	와랄랄랄라
				int com=(int)(Math.random()*100)+1;
				Scanner scan=new Scanner(System.in);
				while(true)
				{
					System.out.printf("1~100사이의 숫자를 입력하세요: ");
					int user=scan.nextInt();
					
					//오류   === >  오류처리할때는 or이 더 효율적
					if(user<1 || user>100)
					{
						 System.out.println("ERROR");
						 continue;// while => 조건식으로 이동
					}
					//  처리
					if(com>user)
					{
						System.out.println("UP");
					}
					else if(com<user)
					{
					  System.out.println("DOWN");
					}
					else 
					{
						System.out.println("GAME OVER");
						System.exit(0);
						
						//종료 		1) break;   // 이시점에서 while문 종료2) System.exit(0);
						
					}
				}
			
				
						
	}

}
