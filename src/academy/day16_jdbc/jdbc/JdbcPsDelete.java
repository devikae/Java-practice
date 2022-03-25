package day16_jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPsDelete {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

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

			con = DriverManager.getConnection(url, id, pw);

			StringBuffer query = new StringBuffer();
			query.append("DELETE		 				");
			query.append("				students   ");
			query.append(" WHERE 1=1					");
			query.append(" AND stu_id in (?, ?)	");
			
			ps = con.prepareStatement(query.toString());

			int idx = 1; 

			ps.setInt(idx++, 4);
			ps.setInt(idx++, 5);
			
			int cnt = ps.executeUpdate(); // select문이 아니기 때문에 Update

			if (cnt > 0) {
				System.out.println(cnt + "행이 삭제 되었습니다.");

				// 연달아 쿼리문 실행하기 (비추천 나중에 기능들을 메소드로 관리하면 할꺼라 이렇게 사용안함)
				ps.close(); // 한번 닫고 다시 만들기
				ps = con.prepareStatement("SELECT * FROM students"); // 버퍼 쓰는게 강제X 수정에 용이해서 사용 하지만 여기처럼 짧은 DML문은 그냥 작성해도
																		// 됨

				rs = ps.executeQuery();

				while (rs.next()) {
					int stuId = rs.getInt("stu_id");
					String stuName = rs.getString("stu_name");
					int stuScore = rs.getInt("stu_score");
					System.out.println("아이디: " + stuId + ", 이름: " + stuName + ", 점수: " + stuScore);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
				}
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
	}
}