/*
  		Ŭ������ ����
  		=========
  		1. �߻�Ŭ���� :  ���� => �������� ���� �޼ҵ带 �����ϰ� �ִ�
  									�������� ��Ƶΰ� [�۾� ���� ] => �ش� ���α׷����� ���� 
  									1) ���� �ٸ� Ŭ������ ����
  									2) ������ Ŭ������ ��Ƽ� ����
  									3) ǥ��ȭ ( ������ ��� ) 
  			public abstract class ClassName
  			{
  					�Ϲݺ���
  					int a=10;
  					������ �޼ҵ�
  					public void display(){
  							~~~~
  					}
  					������ �ȵ� �޼ҵ�
  					public abstract int display() ;			
  						=> �̿ϼ��� Ŭ���� - �ڽ��� �޸� �Ҵ��� �� �� ���� (new�� ����� �� ����, �����ÿ��� �ݵ�� ������ ����Ŭ������ ���� ������ ����)       
  			}  
  			��) 
  					public abstract class A
  					{
  							������ �ȵ� �޼ҵ�
  					}
  					public class B extends A
  					{
  							��ӽÿ� �ݵ�� �����ؼ� ���
  					}
  					
  					B b=new B();
  					A a =new A();  ( X)
  					A a=new B();   (ǥ��)
  							===================> Ŭ���� ��ü ����
  																				===========
  																							new �� ����, ���� �����ڸ� �������� ������ = �߻�Ŭ���� or �������̽�
  																							List list =new ArrayList()
  		2.�������̽� [ �۾� ���� ] <= �߻�Ŭ������ �� ����   / �� : Ŭ������ �ƹ��ų� �� �� �ִ� 
  															���� �ٸ� Ŭ���� ����
  															*ǥ��ȭ �۾� ( ������ Ʋ�� �� ���� ) 
  															������ ���õ� Ŭ������ ��� ����
  				public interface Interface�� {
  						����
  						int a=10;   =======> public static final int a=10;
  																=============
  																������ �� ����
  						���� �� �� �޼ҵ�
  						void display();   ==> public abstract void display ();�� ����
  																===========
  						public void display(); => public (abstract) void display();  						======�������̽��� ��� �޼ҵ�� �߻�޼ҵ�
  				}
  				
  	Ȱ�� ��=====> ���̺귯��
  								Swing => �̺�Ʈ ó��
  								===============
  								������Ʈ
  								JButton 
  										=> JButton  => JButton, JMenu
  										=> ToggleButton => JRadioButton, JCheckBox
  										====================================
  												=> ó�� => interface : ActionListener
  															  => actionPerformed()
  										�Է�â
  											����
  												JTextField  = > JPasswordField
  											������    
  												JTextArea => JTextPane 
  													=> ó�� => interface : ActionListener
  															  => actionPerformed()
  											������
  												JTable  	=> MouseListener
  												JTree 	=> MouseListener
  												JList 		=>ItemListener
  												JComboBox  => ItemListener
  												
  												====================================== KeyListener
  													========
  													1) �ڵ� ȣ��
  													2) ������ �޼ҵ�
  								�����ͺ��̽� => DB
  								Collection 
  		3. ����Ŭ����
  			=	��� Ŭ���� : thread, ��Ʈ��ũ ����  / �ڿ� ������ ������  
  				public class A
  				{		O ,X  => �ڿ�
  						class B
  						{
  						}
  				}
  			=	�͸� Ŭ����	: ��Ӿ��� �������̵�, �޼ҵ� �߰��� �����ϴ�. Aó��
  					public class A
  					{
  							B b= new B() {
  								public void display() {}
  								public int plus () {}
  							};
  					}
  					public class B
  					{
  						public void display() {}
  					}
  			=	���� Ŭ���� : �޼ҵ� �ȿ� Ŭ���� ���� 
  					public class A
  					{
  						public void display() {
  							class B
  							{
  							}
  						}
  					}
  		4.����Ŭ���� : ���̻� Ȯ�� ���� Ŭ���� ( ǰ�� ) 
 			public final class A
 				{
 				}*/
abstract class Ani{
	public abstract void walking();
	public abstract void eating();
	//// ���� Ŭ�������� ������ ������ ����� �Ѵ�
	public  void  setName() {
		System.out.println("");
	}
	/// �ʿ�ÿ��� Override  ( �̹� �����Ǿ��ֱ� ���� ) 
}
class Human extends Ani {  // Ani���� walking eating�� ������ ����� �ȴ� (Add unimplemented methods)

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("����� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("����� �Դ´�");
	}
	
	public void setName() {
		System.out.println("���");
	}
	
	
}
class Dog extends Ani {

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("���� �ȴ´�");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("���� �Դ´�");
	}
	
}
class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("�׹߷� �ȴ´�");	
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Դ´�");
	}
	
}
public class MainClass3 {
 

	public static void main(String[] args) {
		Ani ani=new Human();
		ani.walking();
		ani.eating();
		ani.setName();
		
		ani = new Dog();  // �ּҸ� �ٲ㼭 ó��
		ani.walking();
		ani.eating();
		ani.setName();
		
		ani=new Pig();
		ani.walking();
		ani.eating();
		ani.setName();
	}
	//==> ���õ� ��ü�� ��Ƽ� �ϳ��� Ŭ������ �����Ѵ� ( ǥ��ȭ�� �ȴ�) 
}
