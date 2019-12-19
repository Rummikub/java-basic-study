// 5개의 정수를 입력받아 5개 정수 출력 + 합, 평균 출력
import java.util.Scanner;
public class 배열7 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		// 5개 정수 저장 공간 
		int [] arr= new int[5];
		// 총점 저장
		int total=0;
		// 평균 저장
		double avg=0.0;   						//초기값 잡아주기
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"번째 정수를 입력하라");
			arr[i]=scan.nextInt();
		}
		
		for(int score: arr) 
		{
			System.out.println(score);
			total+=score;
		}
		
		avg= total/(double)arr.length;
		
		
		System.out.println("총점:"+total);
		System.out.printf(" 평균: "+avg);
	}

}
