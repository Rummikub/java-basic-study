import java.util.*;
public class MainClass2 {
/*
 *  	Map=> key , value
 *  	�ߺ�			 X   	  O
 *  		===============> ����		=> put (Ű,��)	
 *  												����� �� => get(key) 
 *  		Map (interface)
 *  		=============
 *  		������ Ŭ����
 *  		Hashtable
 *  		HashMap => table�� ������ Ŭ����
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
