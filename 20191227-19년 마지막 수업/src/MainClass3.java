// [ ������ �켱���� ]
/*
 * 				�������� ( �������� : �޼ҵ� �ȿ��� ����Ǵ� ���� & �Ű����� ) {}�� ����Ǹ� ������� ����
 * 				
 */
class Sawon{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;									//=> heap 
	 static String company;  		 //=>static ������ ����
	 
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
		s1.name="ȫ��";
		s1.dept="���ߺ�";
		s1.loc="����";
		s1.pay=3500;
		s1.company="SIST";
				
		Sawon s2=new Sawon();
		s2.sabun=2;
		s2.name="������";
		s2.dept="�λ��";
		s2.loc="��õ";
		s2.pay=3700;
		s2.company="wowow";      // �����Ǿ ���������� �� �ٲ��.
		
		Sawon.company="werwer";    // Ŭ���� �̸� Ȥ�� ��ü.������ ���ε� ȣ���� �� �ִ�.
		
		System.out.println(Sawon.company);
		System.out.println(s1.company);
		System.out.println(s2.company);

	}

}
