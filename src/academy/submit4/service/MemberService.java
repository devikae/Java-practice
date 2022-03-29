package submit4.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import submit4.connection.ConnectionPool;
import submit4.dao.MemberDao;
import submit4.model.MemberVO;

public class MemberService {

	private static MemberService instance = new MemberService();
	private MemberDao dao = MemberDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private MemberService() {}
	
	public static MemberService getInstance() {
		if(instance == null) {
			instance = new MemberService();
		}
		
		return instance;
	}
	
	
		public ArrayList<MemberVO> memList() {
			Connection conn= cp.getConnection();
			
			try {
				return dao.memList(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(conn != null) {cp.releaseConnection(conn);}
			}
			
			return new ArrayList<MemberVO>();
		}
		
		public MemberVO getMem(String id) {
			Connection conn = cp.getConnection();
			try {
				return dao.getMem(conn, id);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (conn != null)
					cp.releaseConnection(conn);
			}

			return new MemberVO();
		}		
		// 회원가입 
		public int registMem(String id, String name, String pw) {
			Connection conn = cp.getConnection();
			
			try {
				return dao.registMem(conn, id, name, pw);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(conn != null)cp.releaseConnection(conn);
			}
			
			return 0;
		}
		
	
}
