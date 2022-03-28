package typing_battle.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private String driver;
	private String url;
	private String user;
	private String password;
	private int maxConn;   
	
	// 싱긑톤 패턴 적용 
	
	// 본인 객체 
		private static ConnectionFactory instance = new ConnectionFactory();
		
		public static ConnectionFactory getInstnace() {
			if(instance == null) { // 혹시 몰라서 안담길 수 있으니 안전하게 담는 과정 
				instance = new ConnectionFactory();
			}
			return instance;
		}
	
	// 생성자 제한
	private ConnectionFactory() {
	

		try {
			Properties prop = new Properties(); // java.util import (ArrayList라 java.util 안에 있음)

			// Properties 읽어오기                                               
			InputStream reader = getClass().getClassLoader()
					.getResourceAsStream("typing_battle/db.properties"); // java.io import , ()안에 경로 정확하게 넣어야 한다.
			
			
			prop.load(reader); // try안에 넣어야한다 
			
			// Properties안의 내용으로 필드변수에 할당 
			driver = prop.getProperty("driver");   // .getProperty
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			maxConn = Integer.parseInt(prop.getProperty("maxConn"));  // Properties 안에 내용들은 전부 스트링이기 때문에 형 변환 
			
			//드라이버 로딩 
			Class.forName(driver);
			System.out.println("====================드라이버 로딩 성공====================");
			
			
		} catch (IOException e) { // 
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	} 
	
	// DB와의 Connection 객체를 내어주는 메소드
	public Connection getConnection() throws SQLException {   // java.sql
		Connection conn = DriverManager.getConnection(url, user, password);   // add throws
		return conn;
	}

	public int getMaxConn() {
		return maxConn;
	}

	// try catch 와 throw Exception 
	
	
	
	
	
	

}
