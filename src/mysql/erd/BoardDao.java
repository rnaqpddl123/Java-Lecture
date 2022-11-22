package mysql.erd;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BoardDao {
	private String host;
	private String user;
	private String password;
	private String database; 
	private String port;
	
	// myGetConnection() 에서 일일이 불러오는 작업을 DAO()(생성자)에서 처리해서 속도를 빠르게 해준다.
	BoardDao(){
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
	
	//게시글 작성
	public void registerReply(Reply r) {
			
	}
	
	//게시글 수정
	public void updateBoard(Board b){
		//modTime = NOW()를 하면 수정한 시간이나옴
		String sql = "UPDATE board SET pwd=?, uname=?, email=?, modTime=NOW() where uid = ?";
		
	}
	
	//게시글 삭제
	public void deleteCustomer(String uid) {
		
	}
	
	//게시글 목록
	public List<Users> listBoard(){
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM board  ORDER BY regDate, uid;";
		List<Users> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Users u = new Users();
				u.setUid(rs.getString(1));
				u.setPwd(rs.getString(2));
				u.setUname(rs.getString(3));
				u.setEmail(rs.getString(4));
				//수정
				u.setRegDate(LocalDate.parse(rs.getString(5).replace(" ", "T")));	
				list.add(u);
			}
			rs.close();	
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}

}
