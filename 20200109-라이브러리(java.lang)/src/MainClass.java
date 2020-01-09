/*
 *  		�ڹٿ��� �����ϴ� ���̺귯��
 *  		=> �ڹ�
 *  			1) ����� ����
 *  			2) ���̺귯��
 *  			==========		1) + 2)  ==> ���� 
 *  			�ڹ� ����
 *  			======
 *  			java.lang   : import ���� �ʰ� ���   ( �ڵ� ȣ�� )
 *  				= String : ���ڿ�
 *  					1)equals      ( == ) X
 *  					2)trim()
 *  					3)indexOf() lastIndexOf()
 *  					4)length() 
 *  					5)startsWith, endsWith
 *  				*	6)subString()
 *  					7)split()
 *  					8)valueOf()
 *  				= System : ���α׷� ����, ��/���,  GC
 *  					1) gc
 *  					2) exit
 *  				= Object :  ��� Ŭ�����ǻ��� Ŭ����	
 *  					1) clone() : ����
 *  							A a = new A();
 *  							A b = a ; 
 *  						 	A c = a.clone();
 *  					2) finalize() : �Ҹ���
 *  				= Math : ����
 *  					1) random()
 *  					2) ceil()
 *  				= StringBuffer : ���ڸ� �ӽ� ������ ���� 
 *  			*		1) toString()  .... ��θ�?
 *  					2) append() : ���ڿ� ����
 *  				= Thread
 *  			java.util		: �����ϰ� ����� �� �ִ� Ŭ������ ����
 *  				= Scanner  ( �� �Ⱦ� ) 
 *  				= StringTokenzier 
 *  				= Collection (�迭 )
 *  				= ArrayList, Vector , LinkedList, Map : �ڷᱸ�� 
 *  				  ========										====
 *  				�ڷᱸ�� : �޸� ���� ����
 *  				= Thread
 *  			java.io
 *  				= Reader, Writer
 *  				= InputStream, OutputStream (1byte)
 *  				= File
 *  				= ObjectInputStream, ObjectOuptupStream
 *  			java.net
 *  				= Socket
 *  				= URL;
 */
class  My
{

	public My() {
		System.out.println("My() ������ �Լ� ȣ��... (��ü����) ");
	}
	public void display() {
		System.out.println("My: display() Call.....");
	}
	@Override  // Source > implements
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		System.out.println("��ü �Ҹ� ");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My m=new My();  // ����
		// Ȱ��
		m.display();
		// �Ҹ�
		m=null;
		System.gc();  // �޸� ȸ��
		
	}

}
