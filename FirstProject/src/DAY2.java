class Student {
	String name ;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal;
	float getAverage;
	
}
public class DAY2 { 		// day => Student
	

	public static void main(String[] args) {
		
		Student s= new Student();
		s.name ="ȫ�浿";
		s.ban=1;
		s.no= 1;
		s.kor=100;
		s.eng=60;
		s.math =76;
		s.getTotal= s.kor+s.eng+s.math;
		s.getAverage= s.getTotal/3.0f;
		System.out.println(" �̸�: "+s.name);
		System.out.println(" ����: "+s.getTotal);
		System.out.printf("���: %.2f", s.getAverage); //%.2f
		

	}

}
