/*	오라클을 연결
 *   에러를 확인하는 방법 : getMessage / printStackTrace 
 */
package com.sist.exception1;//C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext     사용자정의 라이브러리
import java.sql.*;  // 오라클 연결 => CheckException
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null; // 오라클 연결 (Socket)   => finally로 서버 소켓을 닫는 역할
		PreparedStatement ps=null;  // SQL  문장 전송 => 수신
		try
		{
			//1. 오라클 드라이버 설정 : thin [오라클과 자바를 연결해주는 역할만 하는 드라이버] , oci 드라이버 [ 오라클에서 모든 정보를 가져다 놓고 자바와 연결] 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 연결
			String url="jdbc:oracle:thin:@localhost:1521:XE";   //오라클 주소  local host  = 내 컴퓨터 
			conn=DriverManager.getConnection(url, "hr", "happy");	// XML
			
			//3. SQL문장
			String sql="SELECT ename,job,sal FROM emp";
			ps=conn.prepareStatement(sql);     // !! ps 가 커넥션
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())    // sql에서 위-아래로 한줄씩 데이터를 읽어옴  - previous ; 아래-위로 읽어옴 
			{
				System.out.println(rs.getString(1)+" "
						+rs.getString(2)+" "
						+rs.getInt(3));
			}
			rs.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());    // 어떤 오류가 났는지 메시지를 알려줌
			ex.printStackTrace();  // 어느 부분이 잘못됐는지를 보여줌 java:16 
			System.out.println("d");
		}
		finally
		{
				try   // finally에서도 오류처리는 별도로 해야 됨.
				{ 
					if(ps!=null) ps.close();  
					if(conn!=null) conn.close();   // 서버를 종료하는 방법 : 연결이 됐다면 종료     
				}catch(Exception ex) {}
		}
	}

}
