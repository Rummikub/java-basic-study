/*	�÷��� 
		=====
		�����͸� �޸𸮿� �����ϴ� ���, ǥ��ȭ�� �Ǵ� ����
																	==== �������̽�
		������ ������ ���� ����
		���� �迭 => ������ ������ Ŭ�������� ����
		*���� : ���δٸ� ������Ÿ���� ������ �� ���� => ������Ÿ�� ���� => ���׸��� Ÿ��
																								======
																								<������Ÿ��>
																								========== Ŭ������
																								<int> (X)
																								<Integer>  (O)
			** ���� => ���� ������������ �����ϴ°� ��� ���� 
			
					����
							Collection
							========
									| ====> Queue, Stack
					==================
					List			  Set			Map   ===> (interface)
					  |					|   			   |
		=========		======     ======			==> (interface �� ������ Ŭ����)
		ArrayList			HashSet	Hashtable
		Vector				TreeSet	HashMap   :   Hashtable�� ����
		LinkedList							==> key,value =>���� ��	
		*���� ��				*���� ��				key => �ߺ� 	��	
		*�ߺ� ʦ				*�ߺ� 	��				value=>�ߺ� ʦ	
		=======================================================
		�ڷᱸ��=>  �޸𸮿� ����� �����Ͱ���
															=======
															�б�, ����, �˻�, ����, ����
															=================
															�޼ҵ� => ���� =>
																			add(������)   *****
																			add(index, ������)
																				�б� =>
																			get(int index)
																				���� =>							[	�ٲ�ġ��   ]
																			set(index, ������)
																				���� =>
																			remove(index)   ~ �ߺ��� ���Ǵϱ� �ε����� Ȯ������
																			remove(������)  ~ �ߺ��� �����Ͱ� �ѹ��� ����Ǵ� ���� */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//������ �߰�
		list.add("ȫȫȫ");
		list.add(39);
		list.add("Seoul");
		list.add("1111-1111");
		list.add(180.5);
		list.add('A');
		
		//  ������ ó��
		String name=(String) list.get(0);     // Object�� String���� ����ȯ
		int age=(int)list.get(1);
		String addr= (String) list.get(2);
		String tel=(String)list.get(3);
		double height=(double)list.get(4);
		char bloodtype=(char)list.get(5);
		
		System.out.println("Name   "+name);
		System.out.println("Age    "+age);
		System.out.println("Address    "+addr);
		System.out.println("Phone    "+tel);
		System.out.println("Height    "+height);
		System.out.println("Bloodtype    "+bloodtype);
		// ���ϼ� ���� �������� = ��� ��� �Ұ�  /  �ǹ̾���
	}

}
