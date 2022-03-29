package submit4.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import day16_jdbc.jdbc_jsp.model.Student;
import submit4.connection.ConnectionPool;
import submit4.dao.BoardDao;
import submit4.model.Board;

public class BoardService {

	private static BoardService instance = new BoardService();
	
	private BoardDao dao = BoardDao.getInstance();
	
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private BoardService() {}
	
	public static BoardService getInstance() {
		if(instance == null) {
			instance = new BoardService();
		}
		
		return instance;
	}
	
	
	// 글 조회 (SELECT)
		public ArrayList<Board> boardList() {
			Connection conn= cp.getConnection();
			
			try {
				return dao.boardList(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(conn != null) {cp.releaseConnection(conn);}
			}
			
			return new ArrayList<Board>();
		}
		
		public int write(String title, String content, String id) {
			Connection conn= cp.getConnection();
			try {
				return dao.write(conn,title,content,id);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(conn != null) {cp.releaseConnection(conn);}
			}
			
			return 0;
		}
		
		public ArrayList<Board> boardSerch(int titleNum) {
			Connection conn= cp.getConnection();
			
			try {
				return dao.boardSerch(conn, titleNum);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(conn != null) {cp.releaseConnection(conn);}
			}
			
			return new ArrayList<Board>();
		}
		
		public void printList(String title, String writer, String date, String content) {
			System.out.println("=========================================================================");
			System.out.println("제목: " + title);
			System.out.println("작성자: " + writer);
			System.out.println("작성일: " + date );
			System.out.println("글 내용: " + content );
			System.out.println("=========================================================================");
		}
		
}
