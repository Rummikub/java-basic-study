/*
 *  	배열(Array)
 *  	1) 같은 데이터를 여래 모아 한개의 변수명으로 제어
 *  	2) 배열 선언시 자동으로 연속적 메모리 생성
 *  															==========
 *  															시작과 끝이 일관적으로 정해져있음
 *  															0~ 배열개수 ( 반복문 조절)
 *  	3)단점 : 고정적
 *  	4)사용처 => 관련된 데이터가 3개 이상 = 배열을 생각한다
 *  	5) 사용
 *  		1. 선언
 *  			데이터형[] 배열명;							// 자바 권장사항
 *  			데이터형 배열명 [];							// C C++언어
 *  				ex) 
 *  						정수 
 *  						int[] arr;  => int arr[]
 *  						실수
 *  						double[] arr;
 *  						문자
 *  						char[] arr;
 *  						문자열	
 *  						String[] arr;
 *  						
 *  
 *  		2.초기값 설정
 *  						int a; => a+=10  => Error
 *  						int[] arr= {10,20,30,40}  			=> 자동으로 배열개수 = 4
 *  
 *  						arr (100) ==============
 *  												10	20	30	40	       ====>   'A'   'B'    'C'   'D' 
 *  										   |===|== =|= =|====
 *  										100 104 108  112					   	100  102  104  106
 *  
 *  										arr[0]	[1]	[2] [3]
 *  										==== 일반 변수와 동일하게 사용
 *  													값을 변경 => arr[0]=100     10 => 100
 *  																				===  == 
 *  																	   배열명  첨자(인덱스)
 *  						char[] arr= {'A','B','C'}
 *  							====> 주소를 참조해서 데이터 관리 = 참조변수 
 *  											( 배열, 클래스)
 *  			
 *  
 *  				int[] arr=new int[5];
 *  				================
 *  						new           int[5]
 *  						===			====
 *  			메모리할당    정수5개를 저장할 수 있는 공간			
 *  											(연속적 메모리 구조를 만듦)
 *  					*** new초기값 => 전체(0)
 *  					double[] arr= new double[3];   0.0
 *  					String[] arr= new String[3]; null ( 실제 존재하지 않는 값)
 *  					char[] arr=new char[3] ;  '\0'
 *  					boolean[] arr = new boolean[3] ; false
 *  
 *  		3. 활용
 *  			=> 값을 변경
 *  					 첨자를 이용 ==> arr[1]=100, arr[4]=200 ...
 *  															=====
 *  															저장된 메모리의 위치값
 *  			=> 출력		==> 배열의 모든 첨자는  0부터 시작
 *  												for(int i=0......)
 *  
 *  		4. 초과하거나 줄일 수 없다
 *  				Error          ArryIndexOfBoundsException = > 배열의 범위 초과 경고
 *  		5.배열의 개수 ==> 배열명.length
 *  			======================
 *  
 */
//  정수 3개 입력받아서 데이터를 출력
import java.util.Scanner;
public class 배열1 {
		  static int a; // 0을 출력 전역 아닌 지역변수는 초기값을 줘야 함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1");
		a =scan.nextInt();
		
		System.out.print("정수2");
		b =scan.nextInt();
		
		System.out.print("정수3");
		c =scan.nextInt();
		
		// 제어  == > a,b,c중 가장 큰 수 촐력
		/*
		 *  a =10. b=5. c=20 ==> 20을 출력
		 */
		int max=0;
		if(a>max)				//  max=10
			max=a;
		if(b>max)			// Error
			max=b;
		if(c>max)						// max=20
			max=c;
		
		System.out.print("가장 큰 값:"+max);
	}

}
