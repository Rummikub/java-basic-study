/*			cast
 * 		����ȯ  (boolean�� ����) (int)"10" --x, ���ڿ��� ����ȭ �ȵ� ��,Integer.paseInt("10") 
 * 																(String)10 -- x,   ��, String.valueOf(10)
 * 		=====
 * 		Up  			c>='A'     => c>=65
 * 		Down		int  => char      ex) (char)65 �׳� ����ϸ�  A��� ���ڰ� �����⶧��
 * 							double => int     ex) (int)10.5      
 * 
 * 							char, short, byte ==> ����(int)
 * 
 * 							(double)10
 * 
 * 						byte<char,short<int<long<float<double
 * 
 * 						&& || !  ==> �� (true/false)
 * 							=> if 
 */
public class ���׿�����_��������2 {  // �׻� ������ �ΰ��� �ٴ´�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� = boolean
		boolean b1=(6<7) && (7==7); // false
		//								true			true	==> &&
		System.out.println(b1);
		
		b1=(6>7) && (7==7); // false
		System.out.println(b1);
		
		b1=(6>7) || (7==7); //true
		System.out.println(b1);
		
		b1= (6<7)|| (7==7); // true
		System.out.println(b1);
		
		b1=(6>7) || (7!=7); //false
		System.out.println(b1);
	}

}
