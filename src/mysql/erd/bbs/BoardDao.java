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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;

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
	
	/* 부가기능들 */
	// 게시글 조회수 +하는메소드
	public void incrementViewCount(int bid) {
		Connection conn = myGetConnection();
		String sql = "UPDATE board SET viewcount=viewcount +1 WHERE bid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();		
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	//게시글 갯수
	public int getCount() {
		Connection conn = myGetConnection();
		String sql = "SELECT COUNT(*) FROM board;";
		int count=0;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				count = rs.getInt(1);
			}
			
			rs.close(); stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	// 게시판 리스트
	public List<Bbs> getBbsList(int offset){
		Connection conn = myGetConnection();
		String sql = "SELECT b.bid, b.btitle, u.uname, b.modeTime, b.viewCount, b.replyCount FROM board AS b\r\n"
				+ "	JOIN users AS u\r\n"
				+ "	ON b.uid = u.uid\r\n"
				+ "	LIMIT 10 OFFSET ?;";
		List<Bbs> list = new ArrayList<>();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, offset);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				Bbs b = new Bbs();
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setUname(rs.getString(3));
				b.setModTime(LocalDateTime.parse(rs.getString(4).replace(" ", "T")));
				b.setViewCount(rs.getInt(5));
				b.setReplyCount(rs.getInt(6));
				list.add(b);
			}
			rs.close(); pStmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/* 부가기능끝  */
	
	
	// 게시글 삭제
	public void deleteBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "DELETE FROM board WHERE bid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//게시글 수정
	public void updateBoard(Board b) {
		Connection conn = myGetConnection();
		String sql = "UPDATE board SET btitle=?, bcontent=?, uid=?, modTime=NOW(), viewCount=?, replyCount=?"
				+ "	WHERE bid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, b.getBtitle());
			pStmt.setString(2, b.getBcontent());
			pStmt.setString(3, b.getUid());
			pStmt.setInt(4, b.getViewCount());
			pStmt.setInt(5, b.getReplyCount());
			pStmt.setInt(6, b.getBid());
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//게시글 찾기
	public Board getBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM board WHERE bid=?;";
		Board b = new Board();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
			}
			rs.close(); pStmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	//게시판 목록
	public List<Board> listBoard() {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM board ORDER BY bid DESC;";
		List<Board> list = new ArrayList<>();
		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				Board b = new Board();
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
				list.add(b);
			}
			rs.close(); pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//게시글 작성
	public void insertBoard(Board b) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO board(btitle, bcontent, uid) VALUES(?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, b.getBtitle());
			pStmt.setString(2, b.getBcontent());
			pStmt.setString(3, b.getUid());
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
