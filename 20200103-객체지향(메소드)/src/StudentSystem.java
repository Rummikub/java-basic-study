// �׼�(����) => ��� ����
public class StudentSystem {
	//�������ϴ� �޼ҵ�
	public int totalData (int kor, int eng, int math)       		//	===> �Ű������� 3+ �϶��� Ŭ������ �ѹ��� �Ѱܶ� (�Ʒ� ����) 
	{
		return kor+eng+math;
	}
	//��ձ��ϴ� �޼ҵ�
	public double avgData(int total)
	{
		return total/3.0;
	}
	//�������ϴ� �޼ҵ�
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
	public void hakjumData(Student s)								//=========> �Ű����� ���Ƽ� ���������� Ŭ���� �Ѱܿ�
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
