package mysql.erd;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ReplyDao {
	
	private String host;
	private String user;
	private String password;
	private String database; 
	private String port;
	
	// myGetConnection() 에서 일일이 불러오는 작업을 DAO()(생성자)에서 처리해서 속도를 빠르게 해준다.
	ReplyDao(){
		try {
			InputStream is = new FileInputStream("C://workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306"); // key값이 없으면 디폴트값 3316을 준다
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/"+ database;
			conn = DriverManager.getConnection(connStr, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//리플 달기
	public void registerReply(Reply r) {
		
	}
	
	//리플 수정
	public void updateReply(Reply r){
	}
	
	// 리플 삭제
	public void deleteReply(String uid) {
		
	}

}
