// 정수1개 입력 받아서 => 2진법 출력    ( 입력받는 변수 1개 ) 
// 10 ==> 16bit 
// 0000 0000 0000 1010   ; 같은 용도 16개 ( 배열로 1개 책정 ) 
import java.util.Scanner;
public class 메소드2 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		//  변수 
		int input=0; // 사용자 입력한 값을 받는 변수에 초기값을 줌
		System.out.print("정수 입력:");
		input=scan.nextInt();
	//	System.out.println(Integer.toBinaryString(input));
		
		int []binary= new int[16];
		
		// 배열의 위치를 잡는 변수 하나가 추가로 필요하겠다,
		int index=15; 																	// 배열 =>  값을 변경 => 위치 지정 ( 뒤(length-1), 앞(0))
		//  10%2 == 0 5%2 ==1 2%2== 0 1%2==1
		while(true)
		{
			binary[index]=input%2;   // 15번째에 2로 나눈 나머지값을 저장
			input=input/2;    // input/=2;    
			if(input==0)   // 1/2=0  (정수로 나눠서 소수점 아래 절삭)
				break;
		  index--;
		}
	
		// 출력
		for( int i=0; i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print("  ");
			System.out.print(binary[i]);
		}
	}

}
