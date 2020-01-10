/*	컬렉션 
		=====
		데이터를 메모리에 저장하는 방법, 표준화가 되는 상태
																	==== 인터페이스
		여러개 데이터 쉽게 제어
		가변 배열 => 데이터 갯수를 클래스에서 제어
		*단점 : 서로다른 데이터타입을 저장할 수 없다 => 데이터타입 통일 => 제네릭스 타입
																								======
																								<데이터타입>
																								========== 클래스형
																								<int> (X)
																								<Integer>  (O)
			** 저장 => 같은 데이터형으로 통일하는게 제어가 편리해 
			
					종류
							Collection
							========
									| ====> Queue, Stack
					==================
					List			  Set			Map   ===> (interface)
					  |					|   			   |
		=========		======     ======			==> (interface 를 구현한 클래스)
		ArrayList			HashSet	Hashtable
		Vector				TreeSet	HashMap   :   Hashtable을 보완
		LinkedList							==> key,value =>순서 無	
		*순서 有				*순서 無				key => 중복 	不	
		*중복 可				*중복 	不				value=>중복 可	
		=======================================================
		자료구조=>  메모리에 저장된 데이터관리
															=======
															읽기, 쓰기, 검색, 수정, 삭제
															=================
															메소드 => 쓰기 =>
																			add(데이터)   *****
																			add(index, 데이터)
																				읽기 =>
																			get(int index)
																				수정 =>							[	바꿔치기   ]
																			set(index, 데이터)
																				삭제 =>
																			remove(index)   ~ 중복이 허용되니까 인덱스가 확실하지
																			remove(데이터)  ~ 중복된 데이터가 한번에 제어되는 단점 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//데이터 추가
		list.add("홍홍홍");
		list.add(39);
		list.add("Seoul");
		list.add("1111-1111");
		list.add(180.5);
		list.add('A');
		
		//  데이터 처리
		String name=(String) list.get(0);     // Object를 String으로 형변환
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
		// 통일성 없는 데이터형 = 제어문 사용 불가  /  의미없다
	}

}
