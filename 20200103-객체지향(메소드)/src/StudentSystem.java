// 액션(동작) => 기능 설정
public class StudentSystem {
	//총점구하는 메소드
	public int totalData (int kor, int eng, int math)       		//	===> 매개변수가 3+ 일때는 클래스로 한번에 넘겨라 (아래 참고) 
	{
		return kor+eng+math;
	}
	//평균구하는 메소드
	public double avgData(int total)
	{
		return total/3.0;
	}
	//학점구하는 메소드
	public char scoreData(double avg)
	{
		char c='A';
		switch((int)(avg/10))
		{
		case 10:  case 9: c='A';break;
		case 8 : c='B'; break;
		case 7: c='C'; break;
		default : c='F';
		}
		return c;
	}
	
	
	// call by ref
	public void hakjumData(Student s)								//=========> 매개변수 많아서 리턴형으로 클래스 넘겨옴
	{
		s.setTotal(s.getKor()+s.getEng()+s.getMath());
		s.setAvg(s.getTotal()/3.0);
		char c='A';
		switch((int)(s.getAvg()/10))
		{
		case 10:  case 9: c='A';break;
		case 8 : c='B'; break;
		case 7: c='C'; break;
		default : c='F';
		}
		s.setScore(c);
	}
}
