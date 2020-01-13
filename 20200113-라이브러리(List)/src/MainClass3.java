import java.util.*;
interface I
{
	public void display();
}
class A implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A Call");
		
	}
	
}
class B implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("B  Call");
		
	}

}
class C implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("C Call");
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("a", new A());		
		map.put("b", new B());		
		map.put("c", new C());
		
		I i=(I)map.get("a");
		System.out.println("i=" +i);
		i.display();

		
	 i=(I)map.get("b");		
		i.display();
	
	 i=(I)map.get("c");
		
		i.display();
		
		i=(I)map.get("a");
		System.out.println("i=" +i);
	}
//  한개의 메모리를 여러번 사용한다 = 싱글톤
}
