// add, remove, set     index번호에 유의하라
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//이름목록
		list.add("KYS");  //0
		list.add("LSJ");	//1
		/*
		 * 	========
		 *  	add() //2
		 */
		list.add("Can");  //3
		list.add("KKK");  //4		
		list.add("YUQ"); //5
		
		//저장된 개수 확인
		System.out.println("저장된 인원수 "+list.size());     // size (크기 확인)
		
		// 출력
		for(int i=0; i<list.size(); i++)
		{
				String name=(String)list.get(i);
				System.out.println(name);
		}
		// 데이터형이 통일되면 제어하기 편하다!
		
		System.out.println("=======================");
		
		//추가
		list.add("kim");    // = 맨마지막에 추가
		
		//출력
		for(int i=0; i<list.size(); i++)
		{
				String name=(String)list.get(i);
				System.out.println(name);
		}
		
		System.out.println("=======================");
		list.add(2,"강감찬");  // -> 2번자리에 끼어들게 하고 추가 
		
		//출력
				for(int i=0; i<list.size(); i++)
				{
						String name=(String)list.get(i);
						System.out.println(name);
				}
		System.out.println("=======================");				
		//삭제
		list.remove(3);
		
		//출력
				for(int i=0; i<list.size(); i++)
				{
						String name=(String)list.get(i);
						System.out.println(name);
				}		
		System.out.println("=======================");		
				
		//수정
		list.set(3, "고구마");
		
		//출력
		for(int i=0; i<list.size(); i++)
		{
				String name=(String)list.get(i);
				System.out.println(name);
		}
		
		//문제발생  => ClassCastException ( 형변환 오류 )
		list.add(100);
		
		//출력
		for(int i=0; i<list.size(); i++)
		{
				String name=(String)list.get(i);   //int를 String에 넣음
				System.out.println(name);
		}		


	}
}
