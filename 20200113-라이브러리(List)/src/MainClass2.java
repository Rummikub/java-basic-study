import java.util.*;
public class MainClass2 {
/*
 *  	Map=> key , value
 *  	중복			 X   	  O
 *  		===============> 저장		=> put (키,값)	
 *  												저장된 값 => get(key) 
 *  		Map (interface)
 *  		=============
 *  		구현한 클래스
 *  		Hashtable
 *  		HashMap => table을 보완한 클래스
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map map= new HashMap();
			map.put("id", "admin");
			map.put("pw","1234");
			
			System.out.println("ID: "+map.get("id"));
			System.out.println("Password: " +map.get("pw"));
	}

}
