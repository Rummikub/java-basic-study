/*	����Ŭ�� ����
 *   ������ Ȯ���ϴ� ��� : getMessage / printStackTrace 
 */
package com.sist.exception1;//C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext     ��������� ���̺귯��
import java.sql.*;  // ����Ŭ ���� => CheckException
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null; // ����Ŭ ���� (Socket)   => finally�� ���� ������ �ݴ� ����
		PreparedStatement ps=null;  // SQL  ���� ���� => ����
		try
		{
			//1. ����Ŭ ����̹� ���� : thin [����Ŭ�� �ڹٸ� �������ִ� ���Ҹ� �ϴ� ����̹�] , oci ����̹� [ ����Ŭ���� ��� ������ ������ ���� �ڹٿ� ����] 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. ����
			String url="jdbc:oracle:thin:@localhost:1521:XE";   //����Ŭ �ּ�  local host  = �� ��ǻ�� 
			conn=DriverManager.getConnection(url, "hr", "happy");	// XML
			
			//3. SQL����
			String sql="SELECT ename,job,sal FROM emp";
			ps=conn.prepareStatement(sql);     // !! ps �� Ŀ�ؼ�
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())    // sql���� ��-�Ʒ��� ���پ� �����͸� �о��  - previous ; �Ʒ�-���� �о�� 
			{
				System.out.println(rs.getString(1)+" "
						+rs.getString(2)+" "
						+rs.getInt(3));
			}
			rs.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());    // � ������ ������ �޽����� �˷���
			ex.printStackTrace();  // ��� �κ��� �߸��ƴ����� ������ java:16 
			System.out.println("d");
		}
		finally
		{
				try   // finally������ ����ó���� ������ �ؾ� ��.
				{ 
					if(ps!=null) ps.close();  
					if(conn!=null) conn.close();   // ������ �����ϴ� ��� : ������ �ƴٸ� ����     
				}catch(Exception ex) {}
		}
	}

}
