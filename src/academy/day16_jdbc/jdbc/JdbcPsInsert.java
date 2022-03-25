package day16_jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPsInsert {
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
			query.append("INSERT INTO 				");
			query.append("				students   ");
			query.append("VALUES (					");
			query.append("		stu_seq.NEXTVAL	");
			query.append("		,?					");  // 수정 여지가 있는 값들을 "?"로 넣고 아래 에서 넣어줄 수 있다.
			query.append("		,?					");
			query.append("			)				");
			
			ps = con.prepareStatement(query.toString());
			
			
			int idx =1 ; // index 값이 1부터 시작 계속 생각하기 귀찮기 떄문에 idx값을 변수로 만들고 ++ 증가식을 넣어 자동으로 인덱스 자리 찾아가도록 
			
			// 첫번재 물음표 자리 
			ps.setString(idx++, "예반");      //PrepareStatement setString은 인덱스가 1부터 시작 
//			ps.setString(1, "예반");      //PrepareStatement setString은 인덱스가 1부터 시작 
				//    index() , 값        
			
			// 두번째 물음표 자리
//			ps.setInt(2, 200); 			// 2번째 물음표 > 인덱스2 값 200 
			ps.setInt(idx++, 200); 			// 2번째 물음표 > 인덱스2 값 200 
			
			int cnt = ps.executeUpdate(); // select문이 아니기 때문에  Update
			
			if (cnt >0) {
				System.out.println(cnt + "행이 삽입 되었습니다.");
				
				// 연달아 쿼리문 실행하기 (비추천 나중에 기능들을 메소드로 관리하면 할꺼라 이렇게 사용안함)
				ps.close(); // 한번 닫고 다시 만들기
				ps = con.prepareStatement("SELECT * FROM students"); // 버퍼 쓰는게 강제X 수정에 용이해서 사용 하지만 여기처럼 짧은 DML문은 그냥 작성해도 됨 
				
				rs = ps.executeQuery();
				
				while(rs.next()) {
					int stuId = rs.getInt("stu_id");
					String stuName = rs.getString("stu_name");
					int stuScore = rs.getInt("stu_score");
					System.out.println("아이디: " + stuId + ", 이름: " + stuName + ", 점수: " + stuScore);
				}
				
				
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) try {ps.close();} catch(SQLException e) {}
			if (rs != null) try {rs.close();} catch(SQLException e) {}
			if (con != null) try {con.close();} catch(SQLException e) {}
		}
	}
}