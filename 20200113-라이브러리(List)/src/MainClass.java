import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		//ArrayList = Vector = LinkedLIst ( �޼ҵ尡 ������ )
		List<String> list=new LinkedList <String>();  
		// interface 				������ Ŭ���� 
		//String []list 
		int i;
		//����
		list.add("KYD"); //0
		list.add("JDY"); //2
		list.add("UTD"); //3
		
		//�߰��� ����
		list.add(1,"EGG"); //1 
		
		//���  ( for each = �迭/�÷���)
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		// ����
		list.set(2, "TTT");
		System.out.println("==========================");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//������ ����� ����
		 System.out.println("����� ����: "+list.size());
	}

}
