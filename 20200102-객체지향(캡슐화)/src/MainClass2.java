/*
 *  변수 초기화
 *  ========
 *  (1)선언과 동시에 초기화
 *  
 *  	int a=10;
 * ((Aber))
 *  	arr[0]=10;   				=>  구현에 해당하기 때문에 오류난다.
		a=20;   => X
 * ================= 
 * 
 * (2)초기화 블록 사용 
 * 
 *  {
 *  	a=100;
 *  }
 *  ================ ( 멤버변수의 초기화)
 *  
 *  (3)static 초기화 블록 사용
 *  
 *  static
 *  {
 *    		코딩코딩
 *   }
 *  ================  (멤버변수 static의 초기화)
 *  
 *  클래스명()
 *  {
 *  	a=200;
 *  }
 */
class MyData{
		static int[]arr =new int[6];
		MyData()
		{
			for( int i=0; i<6;i++)
			{
				arr[i]=(int)(Math.random()*100)+1;
			}
		}

}	
public class MainClass2 {

	public static void main(String[] args) {
	
		 MyData m1=new MyData();
			for(int i=0; i<6; i++)
			{
				System.out.print(m1.arr[i]+" ");
			}
			System.out.println("\n====================");
		 MyData m2=new MyData();
			for(int i=0; i<6; i++)
			{
				System.out.print(m2.arr[i]+" ");
			}
			System.out.println("\n====================");
		 MyData m3=new MyData();
			for(int i=0; i<6; i++)
			{
				System.out.print(m3.arr[i]+" ");
			}
			System.out.println("\n====================");	
			for(int i=0; i<6; i++)
			{
				System.out.print(m1.arr[i]+" ");   // 바뀌면 싹 바뀌니까 (static) 최종 값 m3.arr이 출력된다.
			}
	
			
	
		
		/*
		 MyData m1=new MyData();
		 
		for(int i=0; i<6; i++)
		{
			System.out.print(m1.arr[i]+" ");
		}
		
		System.out.println("\n====---------====");
		
		MyData m2=new MyData();
		for(int i=0; i<6; i++)
		{
			System.out.print(m1.arr[i]+" ");
		}
		*/
		
	}

}
