//예시)
//이름, 성별, 나이 ,주소, 전화번호 입력받는 것    == > 서로 관계성이 없기 때문에 배열이 아니다.
// 이름을 열개 입력하라 ==> 관계가 있으니까 배열로 처리 됨

/*
 *  예제 ) 연도, 월을 입력받아 월의 마지막 날을 출력하라
 *  30. 31. 28(29)
 *  베열 = 일괄 처리가 가능
 */

import java.util.Scanner;
 public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year,month;   // int[] data=new int[2]    but 최소 3개가 배열에 적당하니까 pass
		
		Scanner scan= new Scanner(System.in);
	
		System.out.print("년도를 입력하시오:");
		year=scan.nextInt();

		System.out.print("달을 입력하시오:");
	    month=scan.nextInt();
	    
	    int lastDay=0;    // 마지막날을 가져와야 하니까
		/*
		 * if (month==4|| month==6|| month==9|| month==11) { lastDay=30; } else if
		 * (month==2) { if ((year%4==0 && year%100!=0) || (year%400==0)) //윤년 조건 {
		 * lastDay=29; } else { lastDay=28; } } else // 가장 결과값이 많은 애를 else로 뺀다 {
		 * lastDay=31; }
		 */
	    
	    
	    
	    switch(month)   //  결과값이 한번씩만 선택이 된다면  switch case가 편하다
	    {
	    	case 4:	case 6:  case 9:  case 11:
	    				lastDay=30; 
	    				break;
	    	 case 2 : 
	    		if ((year%4==0 && year%100!=0) || (year%400==0))
	    		{
	    			lastDay=29;
	    		}
	    		else
	    		{
	    			lastDay=28;
	    		}
	    				break;
	    				default:
	    							lastDay=31;
	    }
		System.out.println("마지막 날 : " +lastDay);
	}


}
