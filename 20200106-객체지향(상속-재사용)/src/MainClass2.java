// �Խ��� ����� ����!
class Board{
	public void write() {
		System.out.println("Board:write(): �۾���");
	}
	public void content() {
		System.out.println("Board:content(): ���뺸��");		
	}
	public void update() {
		System.out.println("Board:update(): �����ϱ�");		
	}
	public void list() {
		System.out.println("Board:list(): ��� ���");		
	}
	public void find() {
		System.out.println("Board:find(): ã��");		
	}
	public void delete() {
		System.out.println("Board:delete(): �����ϱ�");		
	}
}
// '����'�� �����ؾ� �Ѵ�  ( �Ϻθ� ���� ; ��� / ��ü ���� ; ���ο� Ŭ���� ����)
/*
 *  		���� ���� : �������̵� 
 *  		===============�������̵��� ���� 
 *  		1) ����� �޴´�
 *  		2) �޼ҵ�� ����
 *  		3) �Ű������� ����
 *  		4) ������ ����
 *  		5) Ȯ�� O, ���X
 *  			( ���� ������ )
 *  			private < default < protected < public
 *  			
 *  			class A
 *  			{
 *  					void display (){ }
 *  			}
 *  			class B extends A
 *  			{
 *  					void display (){} (O)
 *  					protected void display() {} (O)
 *  					public void display(){} (O)
 *  					private void display () {} (X)
 *  			}
 */
class GalleryBoard extends Board {
	// �ΰ��� ������ ���ְ� �ʹ�! 
	
	public void write() {
		System.out.println("GalleryBoard:write(): �۾���+�̹��� ���ε�");
	}
	public void list() {
		System.out.println("GalleryBoard:list(): ��� ���+�̹����� ���");		
	}
	
}
class DataBoard	extends Board{

	@Override
	public void write() {
		System.out.println("DataBoard:write(): �۾���+���Ͼ��ε�");
		super.write();
	}
	public void write ( int a )
	{
		System.out.println("DataBoard:write(int a)");  // �������̵�( ��ӵǾ ���� ) �ƴϰ� �����ε� ���� �� �� ����
	}
	@Override
	public void content() {
		System.out.println("DataBoard:content(): ���뺸��+���ϴٿ�ε�");
		super.content();
	}
		
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GalleryBoard gb=new GalleryBoard(); gb.content(); gb.list(); gb.write();
		 * gb.update(); gb.delete(); gb.find();
		 * 
		 * DataBoard db=new DataBoard(); db.content(); db.list(); db.write();
		 * db.update(); db.delete(); db.find();
		 */
		Board gb= new GalleryBoard();
		//gb�� ������ �ִ� �޼ҵ常 ȣ�� ʦ��
		/*
		 * 		������
		 * 		===== 
		 * 		���� Ŭ���� ������ = ����Ŭ���� ������();         => �߰��� ���� ��� ȣ���ϴ� ���	
		 * 
		 * 
		 * 		���� �������� 
		 * 		==========		�����ڸ� �� ���� �Ѵ�
		 * 		A a= new A();
		 * 		A b= new B();     A�� ���� �ִ� �� �� B���� ȣ�� ( �����ε� �Ȱ� = �޼ҵ� �̸��� ������ �� but �ٸ� �Լ��� )  = �����ڰ� �ٲ� ������ �޼ҵ��� �ּҰ��� �ٲ��
		 * 		B c = new B();    B�� ��� ���� ȣ��  				  
		 * 		  = > ������ �޼ҵ尡 ȣ��Ǵ����� Ȯ��
		 * 		  => ���� Ŭ������ ���� Ŭ������ '����'+ '�߰��� ����'�������� �� ����, '�������̵� �� ����'�� ������ �����ϴ�
		 */
		gb.content();
		gb.list();
		gb.write();
		gb.update();
		gb.delete();
		gb.find();
		
		gb=new DataBoard();   //  ��ü�� �����ڸ� �ٲپ ��ü ��� ���� *(���2)  = �޼ҵ� ȣ��
		gb.content();
		gb.list();
		gb.write();
		gb.update();
		gb.delete();
		gb.find();
		
		/*
		 * 	<����Ŭ������ ����Ŭ������ ����>
		 * 
		 * 	Board gb= new DataBoard()  ==> ����� �޼ҵ常 ȣ�� ����
		 * 		int a			int a, b
		 * 	====================== ����� �޾��� ��쿡�� ��밡��
		 * 	=> ���� Ŭ������ ���� Ŭ������ ����/ �߰��� �޼ҵ忡 ������ �� ����
		 * 	=> ���� : Ŭ���� Ÿ��
		 * 	=> �޼ҵ� : ������
		 * 
		 */
	
	}

}
