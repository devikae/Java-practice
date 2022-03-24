package day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		// result 필요 없음 select문 사용하는게 아니라

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
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";
			
			con = DriverManager.getConnection(url,id,pw);
			
			stmt = con.createStatement(); 
			
			StringBuffer query = new StringBuffer();
			query.append("UPDATE					");
			query.append("			students	");
			query.append("SET stu_name = '카우'	");
			query.append("WHERE		1=1			"); // 의미없는거 한 후 AND절에서 조 
			query.append(" AND stu_id = 3		");
			
			int cnt = stmt.executeUpdate(query.toString()); // 스트링 버퍼 그대로 넣을 수 없음
			
			if(cnt>0) {
				System.out.println(cnt + "행 수정 되었습니다.");
			}else {
				System.out.println("업데이트에 실패 했습니다.");
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			
			if(con != null) try {con.close();}catch(SQLException e) {}
		}

	}

}
