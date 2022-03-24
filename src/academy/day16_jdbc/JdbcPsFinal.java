package day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPsFinal {

	/*
	 * 한번 실행(Run) 할 때 마다 김사장은 정대리에게 월급 250만원을 송금한다.
	 * 김사장 계좌에서 -250만원 -> 정대리의 계좌 + 250만원 
	 * 만약 김사장의 계좌의 잔액이 0원 이하가 된다면 
	 * 없었던 일로 하고 되돌린다. -> 이러한 과정을 "트랜잭션" 
	 */
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
			
			// 트랜잭션 (Transaction)설정 
			// 자동으로 커밋(commit)되는 것을 막은 다음 모든 DB작업이 안전하게 종료되는 시점에
			// 수동으로 커밋을 하며, 도중에 에러 발생시
			// 롤백(rollback) 되도록 하는것 
			con.setAutoCommit(false);
			
			// 민우씨 계좌에서 250만원 빼기 
			
			StringBuffer query = new StringBuffer();
			query.append("UPDATE										");
			query.append("			bank							");
			query.append(" SET bank_acount = bank_acount - ?		");
			query.append(" WHERE		1=1								");  
			query.append(" AND bank_name = ?						");
			
			ps = con.prepareStatement(query.toString());
			
			int idx = 1;			
			ps.setInt(idx++, 2500000);
			ps.setString(idx++, "민우사장");
			
			int cnt = ps.executeUpdate();
			
			if (cnt > 0) {
				System.out.println("민우씨 계좌에서 250만원이 인출되었습니다.");
				
				ps.close();
				ps = con.prepareStatement("select * from bank WHERE bank_name = '민우사장' ");
				
				rs = ps.executeQuery();
				
				int minwooAc = 0;
				while(rs.next()) {
					String Name = rs.getString("bank_name");
					minwooAc = rs.getInt("bank_acount");
					System.out.println(Name + "씨의 잔액: "+ minwooAc);
					con.commit();
				}
				
				if (minwooAc <= 0) {
					System.out.println("이번달 월급은 없었던 일로 합시다.");
					con.rollback();
				
					
				}else {
					ps.close();
					StringBuffer query2 = new StringBuffer();
					query2.append("UPDATE										");
					query2.append("			bank								");
					query2.append(" SET bank_acount = bank_acount + ?		");
					query2.append(" WHERE		1=1								");  
					query2.append(" AND bank_name = ?							");
					
					ps =con.prepareStatement(query2.toString());
					
					int index =1;
					ps.setInt(index++, 2500000);
					ps.setString(index++, "재훈대리");
					
					int count = ps.executeUpdate(); 
					
					if( count > 0 ) {
						System.out.println("재훈씨 계좌에 월급이 들어왔습니다. ㅋㅋㄹㅃㅃ");
						// commit 해야함 위에서 autocommit false로 바꿔서 
						
						con.commit();
						
						ps.close();
						
						ps = con.prepareStatement("SELECT * FROM bank ");
						
						rs.close(); // 위에서 써서 닫은 후 다시 담기 
						
						rs = ps.executeQuery();
						
						while(rs.next()) {
							System.out.println(rs.getString("bank_name")+ ", " + rs.getInt("bank_acount"));
						}
					}
				}

			} else {
				System.out.println("월급이 정상적으로 지급되지 않았습니다.");
				con.rollback();

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {	con.rollback();}catch (SQLException s){ s.printStackTrace();} 
		}finally {
			if (ps != null) try {ps.close();} catch(SQLException e) {}
			if (rs != null) try {rs.close();} catch(SQLException e) {}
			if (con != null) try {con.close();} catch(SQLException e) {}
		}
	}
}