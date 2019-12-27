/*	 		[   �ڵ����� ����� �ִ� 3�� :  		import-java.lang       void - return			 default ������    ]
 * 			
 * 			������ �������� =========>    Ŭ���� ( ����, ����+�޼ҵ�, �޼ҵ�)
 * 																					=====
 * 																					~VO  , ~DTO       
 * 	 ��) RecipeVO, MovieVO, MusicVO     :  �ѹ��� ���� �� �ִ� �����͸� ! ���� ����
 * 																					~Manager, ~Service, ~DAO
 * 			�����ͺ��̽� == [	����=> �迭 => ����ü	=> Ŭ���� => ���� =>  RDBMS  (����Ŭ)      ]
 * 			
 * 			�ڹ� Ŭ���� ���� ( ������� : ���� + �޼ҵ� + ������ )
 * 																								==	==
 * 		*	������ ����� ������ �� : ���Ϻ��� => int year,month...
 * 																		Ŭ����		 => String name...     	JButton b1,b2...    => ����� ���� ��������
 * 																		�迭 			=>  
 * 				=> ������Ʈ ���̽� 
 * 					��) ��ǻ�ͱ��� 
 * 								CPU, �޸�, �ϵ� ��ũ ... ( ������Ʈ :  ����� ������ ���� ) 
 * 
 * 			class  ClassName
 *		 	{
 *				======Ŭ������ ������ �ִ� ���� =====	�������� ( �ٸ� Ŭ���������� ������ �� �� ����)
 *				=> �޸𸮿� ���� ����Ǵ� ����	( instance )  => new //  heap�� ����
 *				=> �����ϴ� ���� (static )   => �޸� ������ �Ѱ� // �ڵ�����
 *				===============================
 *				������ �Լ� : ���������� �ʱ�ȭ  ==> �ѹ��� ȣ��, ��ü������ �� ó������ ȣ��
 *				������, ��Ʈ��ũ, �����ͺ��̽�
 *				Ŭ������� �����ϰ� �������� ����
 *				==> ���࿡ �����ڰ� ���� ��쿡�� JVM�� �ڵ����� ���� (default ������)
 *				===============================
 *				�޼ҵ� : ��� ����
 *				===============================
 *		 	}
										 *The Queen's Corgi (2019)
								
										����9.1/10
										�ִϸ��̼�/�ڹ̵�/����
										2019.12.24 ����
										82��, ��ü������
										(����) �� ��Ÿ��, ��Ʈ �ɽ��ڷ�Ʈ
										(�ֿ�) �ɱ���
 */
class MovieVO{ 																				
	// instance  ���� => �޸𸮿� ����Ǵ� ���� => new��� ( ���ο� �޸𸮸� ���� �� ���� �ּҰ� ������ )   
	 // ����� ���� 4byte
	
			// class MovieVO   ��������� Ŭ���� ��������
	String title;
	double score;
	String genre;
	String regdate;
	int time;
	String grade;
	String director;
	String actor;
}
public class MainClass {

	public static void main(String[] args) {
		
			// �޸� ���� => ȣ�� 
			MovieVO m1=new MovieVO();						// new = �޸� ũ�� Ȯ�� �� �޸� ����
			m1.title="The Queen's Corgi (2019)";
			// (.) = �޸� �ּ� ���� ������ 
			MovieVO m2=new MovieVO();
			m2.title="õ��: �ϴÿ� ���´� (2018)";
			MovieVO m3=new MovieVO();
			m3.title="Ĺ�� (2019)";
			
			MovieVO m4=m3;     // �ּҰ��� ���������� ������ ��ü�ȴ� ���� �ּҿ��� �����ϰ� �����ϱ�.
			m4.title= "�õ�(2019)";
			
			System.out.println("m1:  "+m1);
			System.out.println("m2: "+m2);
			System.out.println("m3:  "+m3);
			System.out.println("m4: "+m4);
	
			System.out.println("����� ��ȭ���� ���: " );
			System.out.println(m1.title);
			System.out.println(m2.title);
			System.out.println(m3.title);
			System.out.println(m4.title);
			
			
			// ����� �� ������ �Ϸ��� ( �迭 + for�� )
		  MovieVO[] vo= {m1,m2,m3,m4};
		  for(int i=0; i<vo.length;i++)
		  {
			  System.out.println(vo[i].title);
		  }
	}
	
}
