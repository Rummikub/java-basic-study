//메소드2를 구조화/모듈화 시키는 방법

import java.util.Scanner;
public class 메소드3 {
	// 입력 
	static int userInput()   // 입력한 값을 가져오기만 하면 되기때문에 매개변수는 없는 것
	{
		 Scanner scan= new Scanner(System.in);
		 System.out.println("정수 입력: ");
		 int input=scan.nextInt();
		 return input;
	}
	// 이진법 처리
	static int[] toBinary(int input)  // 입력한 값을 받아와야 되기때문에 매개변수 있다
	{
		int []binary= new int[16];   //  선언을 해야 쓸 수 있다
		int index=15; 																	
		while(true)
		{
			binary[index]=input%2;
			input=input/2;   
			if(input==0) 
				break;
		  index--;
		}
		return binary;
	}
	// 출력
	static void print(int[] binary)
	{
		for( int i=0; i<16;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print("  ");
			System.out.print(binary[i]);
		}
	}
	// 조립
	static void process()
	{
		int input= userInput();
		int [] binary=toBinary(input);
		print(binary);
	}
	public static void main(String[] args) {
		process();
	}

}
