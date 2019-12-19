/*   ====  배열과 for문을 이용해서 달력을 만들어보자
 * 
 * 
 * 
 *  1. 묶어서 사용( 데이터 )
 *  		배열 ==> 클래스 ==> 패키지 ==> 라이브러리 (jar)
 *  		===
 *  		
 *  				프로그램
 *  					데이터+ 명령문 ( 메소드) => 클래스
 *  					============
 *  								클래스 여러개 ==> 조립 (자바CBD)
 *  
 *  2.   자바 ==> 오라클 ( 영구적 저장 장치) => HTML (CSS, JavaScript) ==> JSP ==> MVC ==> Spring 
 *  		( 	로직   )  																	==========================    ==============
 *  																									Front(리액트,뷰,몽고db)								Back*****
 *    ==> Kotlin( 모바일 언어 )
 *    ====================================> 웹앱
 *    
 *    	배열 단점 : 고정적, 수정이 불가능하다   ======> 가변형 ( ArrayList )    === > 같은 데이터형만 모아서 사용
 *    	======
 *       그래서)  선언시 => 메모리 크기를 결정
 *       ============================
 *       		1) 선언
 *       				int [] arr;
 *       				===  === 배열명 ( 실제 저장된 데이터 주소)
 *       				데이터형
 *       
 *       		2) 초기화 -- 메모리를 만들고 값을 넣어줌 저장을 하기 위해 만드는 것
 *       				arr={1,2,3,4,5}
 *       				arr=new int[5]  => 메모리 공간 할당 => 데이터 대입
 *       
 *       		3) 값을 읽기, 쓰기 ==> 인덱스
 *       	
 *       				int[]arr= { 10,30,40,50}
 *       					arr										arr[0] [1]  .....    ==> 변수랑 똑같이 취급
 *       				=======							=====================
 *       						100											10		30 		40			50
 *       				=======								|====================
 *																	100       						
 */
import java.util.*;
import java.text.*;
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * 달력 출력!!						============>  메소드가 4개 + ( 세분화가 관건)
			 *  1) 20XX년도, 월 입력받는다
			 *  2) 1일의 요일 출력 -> 후 for문 돌리고 토요일에 아래로 내림
			 *  3) 마지막날은 언제인가
			 *  4) 출력
			 */

	
//	while(true)
//	{
//		Date date = new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:dd");
//		System.out.println(sdf.format(date));
//		try
//		{
//			Thread.sleep(1000);   // sleep 초마다 하나씩 출력하는 것
//		}catch(Exception ex) {}
//		
//	}
		
		  Scanner scan= new Scanner (System.in); 
		
		  System.out.print("년을 입력하세요: "); 
		  int year= scan.nextInt(); 
		  
		  System.out.print("달을 입력하세요: ");
		  int month=scan.nextInt(); 
		  
		  System.out.print("요일 입력하세요: ");
		  int day=scan.nextInt(); 
		  
		  System.out.println(year+"년"+month+"월"+day+"일");
		 System.out.println("\n");
		 
		/*
		 * System.out.print("일\t"); System.out.print("월\t"); System.out.print("화\t");
		 * System.out.print("수\t"); System.out.print("목\t"); System.out.print("금\t");
		 * System.out.print("토\t");
		 */
		 
		 char[] strWeek= {'일','월','화','수','목','금','토'};
		 // MONTH => 0   +1
		 // DAY_OF_WEEK => 1 -1
		 
		 Calendar cal=Calendar.getInstance();
		 int y=cal.get(cal.YEAR);
		 int m=cal.get(cal.MONTH)+1;
		 int d=cal.get(cal.DATE);
		 int w=cal.get(cal.DAY_OF_WEEK);
		 System.out.println(y+"년도"+m+"월"+d+"일"+ strWeek[w-1]+"요일");
		 System.out.println();
		 
		 
		 for(int i=0; i<7;i++)
		 {
			 System.out.print(strWeek[i]+"\t");
		 }
		 
		 //1 일의 요일 ?    v  공백을 띄어줘야 한다
		 /*
		  *  전년도의 12/31까지의 합 
		  */
		  
		    int total=(year-1*365)
		    			+ (year-1)/4
		    			-(year-1)/100
		    			+(year-1)/400;
		    
		  /*  전달까지의 합
		  *  +1 ====> %7 ==> 요일을 구한다
		  */
		    
		    int[] lastDay= {31, 28, 31, 30,  31, 30, 31, 31,30,31,30,31};
		    if((year%4==0)&&(year%100!=0)||(year%400==0))
		    	lastDay[1]=29;
		    else
		    	lastDay[1]=28;
		    
		    for(int i=0; i<month-1; i++)
		    {
		    	total+=lastDay[i];
		    }
		    // +1 
		    total++; // 각달의 1일자
		    
		    
		 int week=total%7	 ;   // 0= 일요일 / 요일계산
		
		 
		 System.out.println();
		 for(int i=1; i<=lastDay[month-1]; i++)
		 {
			 if(i==1)
			 {
				 for(int j=0; j<week; j++)
				 {
					 System.out.print("\t");
				 }
			 }
			 System.out.printf("%2d\t", i);
			 week++;
			 if(week>6)
			 {
				 week=0;
				 System.out.println();
			 }
		 }
		 
		 
		// 날짜가 입력되게 해봐
		 

		//System.out.println("요일은: "+ (total+day)%7);
		
	}

}
