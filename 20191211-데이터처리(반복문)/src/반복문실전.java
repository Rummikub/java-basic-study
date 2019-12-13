// 100부터 999     7의배수가 몇개, 4의배수가 아닌 개수는 몇개?


public class 반복문실전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int i=100;  // 루프변수
		int res1=0,res2=0;  // 카운트니까
		while(i<=999)
		{
			if(i%7==0)
			   res1++;
		
			if(i%4!=0)
				res2++;
			
			//System.out.println(i);
			i++;   // 이거 안걸면 무한루프 걸린다
		}
		System.out.println("7의 배수는 "+res1+"개");
		System.out.println("4의 배수가 아닌 개수 "+res2+"개");   // 프린트가 {} 밖에 있어야 출력이 된다
		
		
	}

}
