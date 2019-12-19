// 배열1의 결과값을 도출하는 다른 방법 
import java.util.Scanner;
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[3];
		
		Scanner scan= new Scanner(System.in);
		
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"정수 입력");
			arr[i] = scan.nextInt();
			if(arr[i] >max)
						max= arr[i];
		}
		System.out.println("가장 큰 값:"+ max);
	}

}
