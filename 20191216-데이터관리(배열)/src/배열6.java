// 5명의 이름을 입력받아 저장한 다음에 출력   **** for each 구문
import java.util.Scanner;
public class 배열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String []arr= new String[5];


		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"이름을 입력하라");
			arr[i]=scan.next();
		}
		// 출력
		
		for(String name:arr) 
		{
			System.out.println(name);
		}
		// for -each => 배열, 집합체(Collection)
		/*
		 * 			int[] data={1,2,3,4,5}
		 * 			for(int i=0; i<data.length;i++)
		 * 		{
		 * 			System.out.println(data[i]);
		 * 		}
		 * 
		 * 		for (int i:data)									데이터값을 받을때 사용  -- > 값이 더이상 없으면 그대로 종료
		 * 		{
		 * 				System.out.println(i);
		 * 		}
		 */
		System.out.println();
		
		
	}

}
