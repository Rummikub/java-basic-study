// getter setter ���� ���
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ���� ����
		Sawon s1= new Sawon();
		//Ȱ�� = �� ���� setter
		s1.setSabun(1);
		s1.setName("ȫ�浿");
		s1.setDept("���ߺ�");
		s1.setLoc("����");
		s1.setPay(3500);
		
		//��� = getter
		System.out.println("��� " +s1.getSabun());
		System.out.println("�̸� " +s1.getName());
		System.out.println("�μ� " +s1.getDept());
		System.out.println("�ٹ��� " +s1.getLoc());
		System.out.println("���� " +s1.getPay());
		/*
		s1=null;      				// garbage collection���ٰ� ������ ȸ���ϰ� �Ϸ��� , ���� �Ҹ� 
		System.gc();
		*/
		
		System.out.println("\n");
		
		//s1�� ���̻� ������� �ʴ´ٰ� �����ϱ� ������  gc�� �̵��Ѵ�.
		Sawon s2= new Sawon();

		s2.setSabun(2);
		s2.setName("������");
		s2.setDept("������");
		s2.setLoc("��õ");
		s2.setPay(3800);
		
		System.out.println("��� " +s2.getSabun());
		System.out.println("�̸� " +s2.getName());
		System.out.println("�μ� " +s2.getDept());
		System.out.println("�ٹ��� " +s2.getLoc());
		System.out.println("���� " +s2.getPay());
	}

}
