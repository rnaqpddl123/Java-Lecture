package mysql.erd.bbs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mindrot.jbcrypt.BCrypt;

import mysql.customer.Customer;

public class UsersDao {
	private String host;
	private String user;
	private String password;
	private String database; 
	private String port;
	
	// myGetConnection() 에서 일일이 불러오는 작업을 DAO()(생성자)에서 처리해서 속도를 빠르게 해준다.
	UsersDao(){
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
	//연결
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
	//유저 정보 삭제
	public void deleteCustomer(String uid) {
		Connection conn = myGetConnection();
		String sql = "DELETE FROM users WHERE uid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, uid);
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	// 유저 정보 수정
	public void updateUser(Users u){
		Connection conn = myGetConnection();
		String sql = "UPDATE users SET pwd=?, uname=?, email=?, regDate=? WHERE uid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, u.getPwd());
			pStmt.setString(2, u.getUname());	//데이터 타입맞춰주기
			pStmt.setString(3, u.getEmail());
			pStmt.setString(4, u.getRegDate().toString());
			pStmt.setString(5, u.getUid());
			
			//Update 실행
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// case1 : uid가 없는경우
	// case2 : pwd가 틀린경우
	// case3 : uid, pwd 일치 ==> login
	// 로그인
	public Users login(String uid, String pwd) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM Users WHERE  uid =?;";
		Users u = new Users();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			ResultSet rs = pstmt.executeQuery();
			System.out.println(rs.getString(1));
			
//			if(rs.getString(1) == null) {
//				System.out.println("아이디가 틀렸습니다.");
//			}
//			if(rs.getString(2) == null) {
//				System.out.println("비밀번호가 틀렸습니다");
//			}
//			if (uid == rs.getString(1) & pwd == rs.getString(2)) {
//				System.out.println("로그인되었습니다.");
//			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	// 유저 정보 보여주기
	public Users getUserinfo(String uid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM Users WHERE  uid =?;";
		Users u = new Users();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			//Select 실행
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				u.setUid(rs.getString(1));
				u.setPwd(rs.getString(2));
				u.setUname(rs.getString(3));
				u.setEmail(rs.getString(4));		
				u.setRegDate(LocalDate.parse(rs.getString(5)));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return u;
	}
		
	public List<Users> listUsers(){
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM Users  ORDER BY regDate, uid;";
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
				u.setRegDate(LocalDate.parse(rs.getString(5)));	
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
	
	// 유저목록 및 내용보여주기
	public void registerUser(Users u) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO users VALUES (?, ?, ?, ?, DEFAULT);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, u.getUid());	
			String cryptedPwd = BCrypt.hashpw(u.getPwd(), BCrypt.gensalt());
			pStmt.setString(2, cryptedPwd); 
			pStmt.setString(3, u.getUname()); 
			pStmt.setString(4, u.getEmail());

			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
