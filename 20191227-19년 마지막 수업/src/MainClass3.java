// [ 변수의 우선순위 ]
/*
 * 				지역변수 ( 지역변수 : 메소드 안에서 선언되는 변수 & 매개변수 ) {}이 종료되면 사라지는 변수
 * 				
 */
class Sawon{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;									//=> heap 
	 static String company;  		 //=>static 별도의 공간
	 
	 Sawon()
	 {
		 int sabun=10;						//=> stack
		 this.sabun=sabun;   
	 }												
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.sabun=1;
		s1.name="홍길";
		s1.dept="개발부";
		s1.loc="서울";
		s1.pay=3500;
		s1.company="SIST";
				
		Sawon s2=new Sawon();
		s2.sabun=2;
		s2.name="가나다";
		s2.dept="인사부";
		s2.loc="인천";
		s2.pay=3700;
		s2.company="wowow";      // 공유되어서 최종값으로 다 바뀐다.
		
		Sawon.company="werwer";    // 클래스 이름 혹은 객체.변수명 으로도 호출할 수 있다.
		
		System.out.println(Sawon.company);
		System.out.println(s1.company);
		System.out.println(s2.company);

	}

}
