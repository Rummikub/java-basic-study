/*
 * 	Ŭ������ �������
 * 	======================
 * 	����( ��������, ������� )
 * 	=> �ٸ� Ŭ�������� ��� ����
 * 	=> �޸𸮿��� �����Ǵ� ������ ���α׷� �����
 * 		(�޸� =>  heap) 
 * 	======================
 * 	������ : ��������� �ʱ�ȭ      ==> �ڵ� �α��� ó�� ���� ���� ȣ��Ǵ� �Լ�
 * 	Ư¡ ) 	
 * 			1. Ŭ������� ����
 * 			2. �������� ���� (void�� ������)
 * 			3. �����ڴ� �������� ���� �� �ְ�, ������� ���� ���� �ִ� => JVM�� �ڵ����� ����
 * 			4. �����ε��� ����
 * 				======
 * 				1) �Ѱ��� Ŭ���� �ȿ��� ���� �̸��� �޼ҵ带 ������ ���
 * 					=====-------
 * 				2) �Ű������� �ٸ��� ��������� �� ( �������� Ȥ�� ������ Ʋ���� �ٸ� �޼ҵ�� �ν�)
 * 				3) �������� ���� ���� 
 * 						void display()
 * 						int display()      =>  �� ���� �����ε� x, ���� �޼ҵ�� �ν�
 * 						int display(int a)
 * 				4) ����� ����
 * 						plusInt(int a, int b)
 * 						plusDouble(double d1, double d2)
 * 			5. ��� ���� ���� (static, ������)
 * 	======================
 * 		==> ��ɹ��� ���� => ���õ� ��ɹ� ��Ƽ� ó�� (������ ���α׷�) 
 * 	�޼ҵ� : ��������� Ȱ�� => ���
 * 				=	����ó�� + ��� ó��
 * 					=> ����� ��û�� ó�� 
 * 	======================
 */
public class MainClass {
	String name;
	String sex;
	int age;

	// �ʱ�ȭ (������) => MainClass mc=new MainClass() => ������, ��Ʈ��ũ, �����ͺ��̽�
	public MainClass() {
		name = "��û";
		sex = "����";
		age = 25;
	}

	// �Ű������� ������ �ִ� ������
	public MainClass(String name, String sex, int a) {
		// ���������� ��������� ���� => ���������� �켱�����
		System.out.println("this= " + this);
		this.name = name; // this Ŭ������ ������ �����Ͷ�
		this.sex = sex;
		this.age = a;
		// MainClass.this; new �޸� �Ҵ��� �Ҷ� this�� �ڵ����� �����Ѵ�
		// �ڽ��� ��ü �ּ� => this => �ݵ�� �޼ҵ� �ȿ����� ��밡��
	}

	public static void main(String[] args) {
		// static�� �ƴ� ������ ��������� ������ ����� ���� (new)
		
		  MainClass mc1 = new MainClass("�̼���", "����", 30); // -> ��ü ���
		 
		System.out.println("mc1= " + mc1);
		System.out.println(mc1.name);
		System.out.println(mc1.sex);
		System.out.println(mc1.age);
		
		  MainClass mc2 = new MainClass("��û", "����", 25);
		 
		System.out.println("mc2= " + mc2);
		System.out.println(mc2.name);
		System.out.println(mc2.sex);
		System.out.println(mc2.age);
		
		  MainClass mc3 = new MainClass("������", "����", 65);
		 
		System.out.println("mc3= " + mc3);
		System.out.println(mc3.name);
		System.out.println(mc3.sex);
		System.out.println(mc3.age);

		System.out.println(new MainClass("�ڹ��� ", "���� ", 10).name);  // -> ��ü  ��� x
		System.out.println(new MainClass("�ڹ��� ", "���� ", 10).sex);
		System.out.println(new MainClass("�ڹ��� ", "���� ", 10).age);
		/*
		 * mc2.name="aaa"; // this -200
		 * 
		 * �����ڴ� ȣ��ÿ� �ݵ�� new �ٿ��� �� new MainClass();
		 * 
		 * System.out.println(mc.name); System.out.println(mc.sex);
		 * System.out.println(mc.age);
		 */
	}

}
