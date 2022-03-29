package submit4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day16_jdbc.jdbc_jsp.model.Student;
import submit4.model.MemberVO;

public class MemberDao {

	private static MemberDao instatnce = new MemberDao();
	
	private MemberDao() {}
	
	public static MemberDao getInstance() {
		if(instatnce == null) {
			instatnce = new MemberDao();
		}
		return instatnce;
	}
	
	//회원 목록 조회
	public ArrayList<MemberVO> memList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();

		query.append("SELECT		          ");
		query.append("      mem_Num        	");
		query.append("     ,mem_Id  AS name "); // SQL처럼 as 사용 가능
		query.append("     ,mem_name      	");
		query.append("FROM						");
		query.append("			member  		");

		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();

		ArrayList<MemberVO> result = new ArrayList<MemberVO>();

		while (rs.next()) {
			MemberVO temp = new MemberVO();

			// 각각에 대한 값을 set으로 넣어줌

			temp.setMemId(rs.getString("mem_id"));
			temp.setMemName(rs.getString("mem_name"));

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
	
	
	// 멤버 가입 
	public int insertMem(Connection conn, MemberVO member) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO 				");
		query.append("				member   ");
		query.append("VALUES (					");
		query.append("		mem_num.NEXTVAL	");
		query.append("		,?					");  // 수정 여지가 있는 값들을 "?"로 넣고 아래 에서 넣어줄 수 있다.
		query.append("		,?					");
		query.append("		,?					");
		query.append("			)				");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, member.getMemId());
		ps.setString(idx++, member.getMemPw());
		ps.setString(idx++, member.getMemName());
		
		
		int cnt = ps.executeUpdate();
		
		if(ps!= null) {ps.close();}     // 사용하면 꼭 닫기.
		
		
		return cnt;
	}

	public MemberVO getMem(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT			   					");
		query.append("		 mem_id					");
		query.append("		,mem_pw					");
		query.append("		,mem_name					");
		query.append("FROM								");
		query.append("		member						");
		query.append("WHERE 	1=1							");
		query.append("AND		mem_id =  ?				");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		MemberVO temp = new MemberVO();
		
		while(rs.next()) {
			temp.setMemId(rs.getString("mem_id"));
			temp.setMemPw(rs.getString("mem_pw"));
			temp.setMemName(rs.getString("mem_name"));
			
			
		}
		
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return temp;
		
	}
	
	public int registMem(Connection conn, String id, String pw, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("Insert into			 ");
		query.append("			member		 ");
		query.append("values (				 ");
		query.append("		 ?				 ");
		query.append("	  , ?				 ");
		query.append("	  , ?				 ");
		query.append("	  )					 ");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		MemberVO temp = new MemberVO(id, pw, name);
		
		int idx = 1;			
		ps.setString(idx++, temp.getMemId());
		ps.setString(idx++, temp.getMemPw());
		ps.setString(idx++, temp.getMemName());
		
		int cnt = ps.executeUpdate();

		if(ps!=null)ps.close();
		
		return cnt;
	}
}
