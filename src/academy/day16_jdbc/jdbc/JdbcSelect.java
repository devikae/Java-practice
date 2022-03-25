package day16_jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) {
		
		// 변수 정의
		Connection con = null; // java.sql import
		Statement stmt = null;
		ResultSet rs = null;   // DML문의 결과를 담을 변수 
		
		// 1.드라이버 로딩 (프로젝트에서 한번만 로딩 해주면 된다)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
			System.exit(0); // 프로그램 종료   
		}
		
		try {
			// 2.데이터 베이스의 서버와 연결(Connection)
			// ip주소 > 터미널 ifconfig , localhost (본인 컴퓨터) (localhost 127.0.0.1)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";
			
			
			con = DriverManager.getConnection(url,id,pw);  // 위에 값들을 한줄로 넣어도 되지만 너무 길어짐 
			
			// 3.쿼리문 객체를 생성 
			stmt = con.createStatement(); 
			
			// 4.쿼리문 실행과 동시에 결과를 객체에 담는다.               //ResultSet rs = null;   // DML문의 결과를 담을 변수 
			
			StringBuffer query = new StringBuffer();       // 아래 rs에 넣듯이 하면 한줄로 쓰기 어려워 보통 이 방법으로 많이 쓴다
			query.append("SELECT		           	");
			query.append("       stu_id        	");
			query.append("     ,stu_name  AS name ");      // SQL처럼 as 사용 가능 
			query.append("     ,stu_score      	");
			query.append("FROM						");
			query.append("			students  		");
//			rs = stmt.executeQuery("SELECT * FROM customer");  // rs는 Set
			rs = stmt.executeQuery(query.toString()); 
			
			// 5. 실행결과 처리   // 보통 while로 꺼냄 
			while(rs.next()) { // rs.next >>> 다음 행이 있으면 true를 반환화며, 커서가 한칸 내려간다. 
				int stuId = rs.getInt("stu_id");  // 컬럼명 대소문자 구별안함 
				String stuName = rs.getString("name");  // " 위에서 사용한 as로 적용 가능하다."
				int stuScore = rs.getInt("stu_score");  
				System.out.println("아이디: " + stuId + ", 이름: " + stuName + ", 점수: " + stuScore);
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			// 6.자원정리(close)
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(stmt != null) try {rs.close();}catch(SQLException e) {}
			
			// 객체 먼저 닫고 connection 가장 나중에 닫기 (중요)
			if(con != null) try {rs.close();}catch(SQLException e) {}
		}
		
		
		
		
		
		

	}

}
