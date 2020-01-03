// getter setter 쓰는 방법
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 생성
		Sawon s1= new Sawon();
		//활용 = 값 설정 setter
		s1.setSabun(1);
		s1.setName("홍길동");
		s1.setDept("개발부");
		s1.setLoc("서울");
		s1.setPay(3500);
		
		//출력 = getter
		System.out.println("사번 " +s1.getSabun());
		System.out.println("이름 " +s1.getName());
		System.out.println("부서 " +s1.getDept());
		System.out.println("근무지 " +s1.getLoc());
		System.out.println("연봉 " +s1.getPay());
		/*
		s1=null;      				// garbage collection에다가 변수를 회수하게 하려면 , 변수 소멸 
		System.gc();
		*/
		
		System.out.println("\n");
		
		//s1은 더이상 사용하지 않는다고 생각하기 때문에  gc로 이동한다.
		Sawon s2= new Sawon();

		s2.setSabun(2);
		s2.setName("하하하");
		s2.setDept("영업부");
		s2.setLoc("인천");
		s2.setPay(3800);
		
		System.out.println("사번 " +s2.getSabun());
		System.out.println("이름 " +s2.getName());
		System.out.println("부서 " +s2.getDept());
		System.out.println("근무지 " +s2.getLoc());
		System.out.println("연봉 " +s2.getPay());
	}

}
