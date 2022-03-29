package submit4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day16_jdbc.jdbc_jsp.model.Student;
import submit4.model.Board;

public class BoardDao {
	private static BoardDao instance = new BoardDao();

	private BoardDao() {
	}

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}

	public ArrayList<Board> boardList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();

		query.append("SELECT		           		");
		query.append("      board_num		     	");
		query.append("     ,board_title 			"); // SQL처럼 as 사용 가능
		query.append("     ,board_writer 			"); // SQL처럼 as 사용 가능
		query.append("     ,board_content      	");
		query.append("     ,board_date		      	");
		query.append("FROM								");
		query.append("			board			  		");

		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();

		ArrayList<Board> result = new ArrayList<Board>();

		while (rs.next()) {
			Board temp = new Board();

			// 각각에 대한 값을 set으로 넣어줌

			temp.setbNum(rs.getInt("board_num"));
			temp.setbTitle(rs.getString("board_title"));
			temp.setbContent(rs.getString("board_content"));
			temp.setbWriter(rs.getString("board_writer"));
			temp.setbDate(rs.getString("board_date"));

			result.add(temp);

		}
		if (ps != null) {
			ps.close();
		}
		if (rs != null) {
			rs.close();
		}
		return result;
	}
	
	// 글쓰기
	public int write(Connection conn, String title, String content, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("Insert into			 ");
		query.append("			board		 ");
		query.append("values (				 ");
		query.append("		 board_seq.nextval				 ");
		query.append("	  , ?				 ");
		query.append("	  , ?				 ");
		query.append("	  , ?				 ");
		query.append("	  , ?				 ");
		query.append("	  )					 ");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		Board temp = new Board(title, content, id);
		
		int idx = 1;			
		ps.setString(idx++, temp.getbTitle());
		ps.setString(idx++, temp.getbWriter());
		ps.setString(idx++, temp.getbContent());
		ps.setString(idx++, temp.getbDate());
		
		int cnt = ps.executeUpdate();

		if(ps!=null)ps.close();
		
		return cnt;
	}
	
	// 글 검색 
	public ArrayList<Board> boardSerch(Connection conn, int titleNum) throws SQLException {
		StringBuffer query = new StringBuffer();

		query.append("SELECT		           		");
		query.append("      board_num		     	");
		query.append("     ,board_title 			"); // SQL처럼 as 사용 가능
		query.append("     ,board_writer 			"); // SQL처럼 as 사용 가능
		query.append("     ,board_content      	");
		query.append("     ,board_date		      	");
		query.append("FROM								");
		query.append("			board			  		");
		query.append("WHERE 1=1				  		");
		query.append("AND 				  				");
		query.append("		board_num = ?			");
		
		

		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();

		ArrayList<Board> result = new ArrayList<Board>();

		while (rs.next()) {
			Board temp = new Board();

			// 각각에 대한 값을 set으로 넣어줌
			int idx = 1;		
			ps.setInt(idx++, titleNum);
			
			temp.setbNum(rs.getInt("board_num"));
			temp.setbTitle(rs.getString("board_title"));
			temp.setbContent(rs.getString("board_content"));
			temp.setbWriter(rs.getString("board_whriter"));
			temp.setbDate(rs.getString("board_date"));

			result.add(temp);

		}
		if (ps != null) {
			ps.close();
		}
		if (rs != null) {
			rs.close();
		}
		return result;
	}
	
}
