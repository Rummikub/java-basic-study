/*
 *  		Wrapper 클래스   ( 기본형의 클래스화)         = 스태틱 메소드를 갖고 있다  ! 별도의 메모리 할당을 하지 않거든   ( new 는 클래스일때만 설정 ( 주소값 설정 ))
 *  		============
 *  			기본형 (int,long..) 쉽게 제어가 가능하게 만들어진 클래스
 *  			 int => Integer   (클래스)  => Boxing ↔ AutoBoxing (클래스 -데이터화)
 *  			Integer ii=new Integer(10);   
 *  			int i= ii.valueOf();
 *  
 *  			int i=ii;
 *  			Integer ii=10;
 *  			double => Double											클래스명.parse클래스명 (변수)
 *  			byte => Byte
 *  			boolean => Boolean
 *  
 *  			===> String s="100"
 *  						int i=(int)s;
 *  						
 */

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Integer ii=new Integer(100); int i=ii; int k=1000; //AutoBoxing 자동변환 되는 예
		 * Integer kk=k;
		 * 
		 * Scanner scan=new Scanner(System.in); System.out.println("정수입력: "); String
		 * no1=scan.next();
		 * 
		 * System.out.println("정수입력: "); String no2=scan.next();
		 * 
		 * //but 공백이 들어가면 안된다 String no1="  20"; String no2="100"; =>
		 * NumberFormatException (RuntimeException 발생)
		 * 
		 * System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2)); // 정수를 문자로
		 * 받기 때문에 계산이 안된다!!.
		 */	
		String s="true";
		if(Boolean.parseBoolean(s)==true)  // or (s.equals("true"))  +  ==true 생략가능 ~ 기본값 
		{
			System.out.println("출력");
		}
		
		String score="4.5";
		System.out.println(Double.parseDouble(score)+1);
		boolean b=true;
		System.out.println(String.valueOf(b));    // 모든 데이터를 문자형으로 바꿀 때는 valueOf
		}
	}


