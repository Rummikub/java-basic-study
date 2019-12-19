/*  초기값이 늘 0인것은 아니다 !!
 * 
 * 
 *  5개의 정수를 받아서  --  배열은 한개
 *  최대값 최소값 -- 낱개로 잡아서 처리
 *  
 * 1) 변수
 * 		int a,b,c,d,e     ==  용도가 같다 == 모은다 ==배열
 * 		int max, min 
 * 
 * 2) 초기값 잡기
 * 
 * 		초기값이 꼭 0인것은 아니다
 */
import java.util.Scanner;
public class 배열9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  입력값을 받는다
		
		Scanner scan=new Scanner(System.in);
		
		// 변수를 잡아준다
		int [] arr=new int[5];
		
		// 값 입력    --- 음수를 입력할 수도 있기에  int max=0이라고 하면 안된다
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		int max=0;
		int min=100;  // min은 가장 큰 값을 잡고 max는 가장 작게 잡던지, 아니면 랜덤을 발생시키는 방법 있음
		
		for(int i:arr)
		{
			if(arr[i] >max)
				max= i;
			if(arr[i] <min)
				min= i;
		}
		//출력
		
		for(int i:arr)
		{
			System.out.println(i+"  ");
		}
		System.out.println();
		System.out.print("최대값:" +max);
		System.out.println("최소값: "+min);
	}

}
