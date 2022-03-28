package typing_battle.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

/**
 * ConnectionFactor로부터 maxConn만큼
 * Connection 객체를 생성해서 pool에 보관하는 클래스  
 * @author dev-ikae
 *pool이란 ArrayList를 사용하고싶지만 동기화를 지원하지 않아서 Vector 사용 
 */
public class ConnectionPool {
	
	// Vector는 동기화(Synchronized)가 적용되는 ArrayList
	private static Vector<Connection> pool = new Vector<Connection>(); 
	
	private static ConnectionPool instance = new ConnectionPool();
	
	public static ConnectionPool getInstance() {
		if(instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}
	
	private ConnectionPool() {
		try {
			initPool();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void initPool() throws SQLException {
		destroyPool(); // 보험
		
		ConnectionFactory factory = ConnectionFactory.getInstnace();
		int maxConn = factory.getMaxConn();
		
		for(int i = 0; i <maxConn; i++) {
			pool.add(factory.getConnection());
		}
		
	}
	
	private synchronized void destroyPool() throws SQLException {
		for(Connection conn : pool) { // pool안에 conn
			conn.close();
		}
		pool.clear();
	} 
	
	// 다른 사람에게 넘겨줄 함수가 있어야한다.
	public synchronized Connection getConnection() { // 넘겨줄 타입 Connection
		if(pool.size() == 0 ) { // wait을 걸어야함 
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Connection conn= pool.remove(pool.size() -1 );  // 0 1 2 3이 들어가 있음 max값이 4라 
		
		return conn;
	}
	
	// pool size가 0이 될 수도 있으니 다시 반환 받는다
	public synchronized void releaseConnection(Connection conn) {
		pool.add(conn);
		notify();
	}
}
