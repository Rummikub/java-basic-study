							/*StringTokenizer
							============= ���ڿ� �����ٶ� ����ϴ� Ŭ����
							1) ��ü������ ����
							2) ���ڿ� (0)
							 		id|pw|avatar					split ==> regex ( ���Խ�)
							 		
							 		1.hasMoreTokens() : �ִ� ������ŭ�� while���� ������
							 		2.nextToken() 
							 							*/
import java.util.*;

/*class Info
{
	String id;
	String name;
	String pw;
	String sex;
	String addr;
	String tel;
}*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="admin|kim|1234|male|Seoul|1111-1111111";
		StringTokenizer st=new StringTokenizer(data,"|");    // default = ���� ("")
		/*String id=st.nextToken();   // 1��° ��ū = admin
		String name=st.nextToken();
		String pw=st.nextToken();
		String sex=st.nextToken();
		String addr=st.nextToken();
		String tel=st.nextToken();
		
		System.out.println("ID:  "+id);
		System.out.println("Name: "+name);
		System.out.println("Password: "+pw);
		System.out.println("Sex: "+sex);
		System.out.println(	"Address: "+addr);
		System.out.println("Tel: "+tel);*/
		//Info info=new Info(); 
		while(st.hasMoreTokens())  //  �ܾ �߷��ִ´�� �ϳ��� �����Ͷ�   => ���й��ڸ� ����
		{
			System.out.println(st.nextToken());
		}
	}

}
