package ����������;
// ���� = ���α׷��� �ʿ��� �Ѱ��� �����͸� �����ϴ� �޸� �̸�
//                								--------------
/*
 * 	���� ���� -> ����
 *  1) ���� 							--- 10���� int a=10,   2���� int b=0b1010, 8���� int c=012, 16���� int d=0xFF
 *  		byte b=10 (127)
 *  		short s=100 (32767)
 * 		 int i=100
 * 		long l=100L
 * 	2) �Ǽ�
 * 		flaoat f=10.5F
 * 		double d=10.5
 * 	3) ����
 * 		char c="A"
 * 	4) ����
 * 		 boolean b=true
 * 	5)���ڿ�
 * 		String s="Hello Java"
 */
public class ���� {
			// 2019�� 9�� 1  -- 0�� �տ� ������ 8�������� �����ϱ� ������ ������ ����
			public static void main(String[] args) {
				// 1. 4byteũ���� �޸𸮸� ������
				// �� �޸��� �̸� => a
				// a��� �޸𸮿� 10�� �����϶�
				int a=10;
				int b=012;
				int c=0xA;
				int d=0b1010;
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("d="+d);
				
			float f=10.5F;
			// 4 = 8
			System.out.println("f="+f);
			
			double d2=10.5D;  // D�� ���������ϴ�.
			System.out.println("d2="+d2);
			
			// + ���������
			// + ���ڿ� ����
			// 7+""+7 -> 77 �ٷ� �ڿ� �ٿ��� ��� ��
			// 7+7 -> 14
			boolean bcheck= true;
			System.out.println("bcheck="+bcheck);
			
			char ch='K';
			System.out.println("ch="+ch);
			
			String name="ȫ�浿";
			System.out.println(name);
			
			int ii=Integer.MAX_VALUE;
			byte bb=Byte.MAX_VALUE;
			long ll= Long.MAX_VALUE;
			System.out.println("ii="+ii);
			System.out.println("bb="+bb);
			System.out.println("ll="+ll);
			}
}
