package com.sist.movie;
import java.util.*;
import java.sql.*;   // db와 연결
/*
 		1)	드라이버 등록  => Class.forName("oracle.jdbc.driver.OracleDriver");           =========> 오라클에서 다운로드 ( ojdbc6.jar)
 		2)	오라클 연결 => Connection
 											=> getConnection(URL,username,password)
 		3) 	기능처리 => SQL
 									  => SQL문장을 오라클에 전송 => Statement 
 									  		ResultSet  [ 리턴형 有 ]   executeQuery() => 검색 (SELECT)
 									  		executeUpdate() =>데이터 변경 (INSERT,UPDATE,DELETE)   => commit() 			 											*AUTOCOMMIT 이 됨
  		4)	오라클 해제 => close()
  		
  		private int mno;
		private String title;
		private double  score;
		private String genre;
		private String regdate;
		private String time;
		private String grade;
		private String director;
		private String actor;
		private String story;
		private int type;
  		String sql="INSERT INTO movie VALUES("+mno+",' "+title+" ',"+score+",' "+genre+" ',' "+regdate+" ',' "+time+" ',' "+grade+" ',' "+director+" ',' "+actor+" ',' "+story+" ',"+type+")";
  		-- 문자에는 작은 따옴표를 붙여줘야 한다
  		String sql="INSERT INTO movie VALUES(?,?,?,?,?,?,?,?,?,?,?)   => PREPAREDSTATEMENT = 값을 나중에 채워줌 (오류가 적다)
 */
public class MovieDAO {
		private Connection conn;  // Socket
		private PreparedStatement ps; // OutputStream , BufferedReader
		private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		
		// 드라이버 등록
		public MovieDAO()
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch (Exception ex) 
			{
				ex.printStackTrace();
			}
		}
		//오라클연결
		public void getConnection()
		{
			try
			{
				conn=DriverManager.getConnection(URL,"hr","happy");
			}catch (Exception ex) {}
		}
		//오라클해제
		public void disConnection()
		{
			try
			{
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {}
		}
		//기능 처리 => 추가 => CURD
		public void movieInsert(MovieVO vo)
		{
			try
			{
				getConnection();  // 열기
				String sql="INSERT INTO movie VALUES("
										+"(SELECT NVL(MAX(mno)+1,1) FROM movie),?,?,?,?,?,?,?,?,?,5) ";   // 넘버링 기법 1. 현재상영 2.개봉예정
				
				ps=conn.prepareStatement(sql); // 커넥션 생성
				
				// ?에 데이터 넣어주기
				ps.setString(1, vo.getTitle());
				ps.setDouble(2, vo.getScore());
				ps.setString(3, vo.getGenre());
				ps.setString(4, vo.getRegdate());
				ps.setString(5, vo.getTime());
				ps.setString(6, vo.getGrade());
				ps.setString(7, vo.getDirector());
				ps.setString(8, vo.getActor());
				ps.setString(9, vo.getStory());
				
				ps.executeUpdate(); // 데이터 갖고와
			}catch(Exception ex)
			{
				ex.printStackTrace();  // 복구
			}
			finally  // N개의 데이터를 저장할 때 마다 닫아줘야 메모리 줄임
			{
				disConnection(); //닫기
			}
		}
}
