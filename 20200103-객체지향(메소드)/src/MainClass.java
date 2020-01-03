// 조립
public class MainClass {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setName("홍길동");
		s1.setKor(99);
		s1.setEng(88);
		s1.setMath(76);
		Student s2=new Student();
		s2.setName("가나다");
		s2.setKor(89);
		s2.setEng(78);
		s2.setMath(56);
		Student s3=new Student();
		s3.setName("라마바");
		s3.setKor(100);
		s3.setEng(86);
		s3.setMath(36);
		
		StudentSystem ss= new StudentSystem();
	
		s2.setScore(ss.scoreData(s1.getAvg()));

		System.out.println("=================");
		System.out.println("name: "+s2.getName());
		System.out.println("korean: "+s2.getKor());
		System.out.println("english: "+s2.getEng());
		System.out.println("math: "+s2.getMath());
		System.out.println("total: "+s2.getTotal());
		System.out.println("average: "+s2.getAvg());
		System.out.println("score: "+s2.getScore());
	}

}
