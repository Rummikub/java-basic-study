import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		//ArrayList = Vector = LinkedLIst ( 메소드가 동일함 )
		List<String> list=new LinkedList <String>();  
		// interface 				구현된 클래스 
		//String []list 
		int i;
		//저장
		list.add("KYD"); //0
		list.add("JDY"); //2
		list.add("UTD"); //3
		
		//중간에 저장
		list.add(1,"EGG"); //1 
		
		//출력  ( for each = 배열/컬렉션)
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		// 수정
		list.set(2, "TTT");
		System.out.println("==========================");
		i=0;
		for(String name:list)
		{
			System.out.println(name+":"+i);
			i++;
		}
		
		//데이터 저장된 개수
		 System.out.println("저장된 개수: "+list.size());
	}

}
