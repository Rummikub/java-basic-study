/*
 *  		Wrapper Ŭ����   ( �⺻���� Ŭ����ȭ)         = ����ƽ �޼ҵ带 ���� �ִ�  ! ������ �޸� �Ҵ��� ���� �ʰŵ�   ( new �� Ŭ�����϶��� ���� ( �ּҰ� ���� ))
 *  		============
 *  			�⺻�� (int,long..) ���� ��� �����ϰ� ������� Ŭ����
 *  			 int => Integer   (Ŭ����)  => Boxing �� AutoBoxing (Ŭ���� -������ȭ)
 *  			Integer ii=new Integer(10);   
 *  			int i= ii.valueOf();
 *  
 *  			int i=ii;
 *  			Integer ii=10;
 *  			double => Double											Ŭ������.parseŬ������ (����)
 *  			byte => Byte
 *  			boolean => Boolean
 *  
 *  			===> String s="100"
 *  						int i=(int)s;
 *  						
 */

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Integer ii=new Integer(100); int i=ii; int k=1000; //AutoBoxing �ڵ���ȯ �Ǵ� ��
		 * Integer kk=k;
		 * 
		 * Scanner scan=new Scanner(System.in); System.out.println("�����Է�: "); String
		 * no1=scan.next();
		 * 
		 * System.out.println("�����Է�: "); String no2=scan.next();
		 * 
		 * //but ������ ���� �ȵȴ� String no1="  20"; String no2="100"; =>
		 * NumberFormatException (RuntimeException �߻�)
		 * 
		 * System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2)); // ������ ���ڷ�
		 * �ޱ� ������ ����� �ȵȴ�!!.
		 */	
		String s="true";
		if(Boolean.parseBoolean(s)==true)  // or (s.equals("true"))  +  ==true �������� ~ �⺻�� 
		{
			System.out.println("���");
		}
		
		String score="4.5";
		System.out.println(Double.parseDouble(score)+1);
		boolean b=true;
		System.out.println(String.valueOf(b));    // ��� �����͸� ���������� �ٲ� ���� valueOf
		}
	}


