import java.util.*;// Scanner  입력값을 받아서 쓸 때, 스캐너를 사용한다
/*
 * 자바 => 클래스
 * C => 함수단위
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 => 값을 설정 => 직접입력
		/*
		 * int a; //선언
		 * a=10
		 * 
		 * inta=10; //  선언과 동시에 값 대입
		 * 
		 * 입려한 값을 받아 저장
		 * 랜덤(난수) => 임의의 수를 저장
		 * int a=(int)(Math.random()*100)+1;
		 * Math.random => 0.0~0.99 => 0.0~99.0 => 정수형 0~99 +1 
		 *  1~100
		 *  	System.out.println("a="+a);
		 *   Scanner scan = new Scanner(System.in);    
		 *   													==========> 키보드 입력값을 받는다    new; stack이 아닌 heap에 저장한다
		 *    System.out.println("정수 입력:");
		 *    int b=scan.nextInt();
		 *     System.out.println("b="+b);
         */
		 
		 // 산술연산자 ==> +./
		 //국어, 영어, 수학 점수를 받아서 총점,평균 =) 소수점 2자리 출력
		int kor,eng,math,total;
		double avg;
		
		 //입력할 수 있는 기능의 클래스를 가져온다. -- 나중에 알려준대
	
		Scanner scan = new Scanner (System.in) ;
		System.out.println("국어점수:");
		kor=scan.nextInt();
		
		 System.out.println("영어점수:");
		eng=scan.nextInt();
		
		 System.out.println("수학점수:");
		math=scan.nextInt();
		
		total=kor+eng+math;
		
		avg=total/3.0;
		 System.out.println("국어점수: "+ kor);
		 System.out.println("영어점수: "+ eng);
		 System.out.println("수학점수: "+ math);
		 System.out.println("총점: "+ total);
		 System.out.printf("평균:%.2f", avg);
		 
		 
	}

}
