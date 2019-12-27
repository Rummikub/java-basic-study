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
		s.name ="È«±æµ¿";
		s.ban=1;
		s.no= 1;
		s.kor=100;
		s.eng=60;
		s.math =76;
		s.getTotal= s.kor+s.eng+s.math;
		s.getAverage= s.getTotal/3.0f;
		System.out.println(" ÀÌ¸§: "+s.name);
		System.out.println(" ÃÑÁ¡: "+s.getTotal);
		System.out.printf("Æò±Õ: %.2f", s.getAverage); //%.2f
		

	}

}
