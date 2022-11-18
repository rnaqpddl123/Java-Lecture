package mysql.player;

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

/**
 * DAO
 */



public class DAO {
	private String host;
	private String user;
	private String password;
	private String database; 
	private String port;
	
	DAO(){
		try {
			InputStream is = new FileInputStream("C://workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/"+ database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void createTable() {
		Connection conn = myGetConnection();
		String sql = "CREATE TABLE if NOT EXISTS player(\r\n"
				+ "	backnum INT NOT NULL PRIMARY KEY,\r\n"
				+ "	`name` VARCHAR(12) NOT NULL,\r\n"
				+ "	`position` VARCHAR(10) NOT NULL,\r\n"
				+ "	birthday DATE,\r\n"
				+ "	height INT,\r\n"
				+ "	isDeleted INT DEFAULT 0\r\n"
				+ "	);";
		try {
			Statement stmt = conn.createStatement();
			
			stmt.execute(sql);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public List<DTO> getPlayer(){
		Connection conn = myGetConnection();
		Statement  stmt =null;
		List<DTO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM player\r\n"
					+ " WHERE isDeleted=0 "
					+ "	ORDER BY FIELD (`position`, '투수', '포수', '내야수', '외야수');";
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				DTO d = new DTO();
				d.setBacknum(rs.getInt(1));
				d.setName(rs.getString(2));
				d.setposition(Position.valueOf(rs.getString(3)));
				d.setBirthday(LocalDate.parse(rs.getString(4)));
				d.setHeight(rs.getInt(5));
				d.setIsDeleted(rs.getInt(6));
				list.add(d);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public DTO getPlayer(int backnum) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM player WHERE backnum =?;";
		DTO dto = new DTO();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backnum);
			
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				dto.setBacknum(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setposition(Position.valueOf(rs.getString(3)));
				dto.setBirthday(LocalDate.parse(rs.getString(4)));
				dto.setHeight(rs.getInt(5));
				dto.setIsDeleted(rs.getInt(6));
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
	public void insertPlayer(DTO dto) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO player(backnum, `name`, position, birthday, height) VALUES(?,?,?,?,?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, dto.getBacknum());
			pStmt.setString(2, dto.getName());
			pStmt.setString(3, dto.getposition().toString());
			pStmt.setString(4, dto.getBirthday().toString());
			pStmt.setInt(5, dto.getHeight());
			
			pStmt.executeUpdate();
			pStmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void updatePlayer(DTO dto) {
		Connection conn = myGetConnection();
		String sql = "UPDATE player SET `name`=?, `position`=?, birthday=?, height=? WHERE backnum=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, dto.getName());
			pStmt.setString(2, dto.getposition().toString());
			pStmt.setString(3, dto.getBirthday().toString());
			pStmt.setInt(4, dto.getHeight());
			pStmt.setInt(5, dto.getBacknum());
			
			//업데이트 실행
			pStmt.executeUpdate();
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void deletePlayer(int backnum) {
		Connection conn = myGetConnection();
		String sql = "UPDATE player SET isdeleted=1 WHERE backnum = ?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backnum);
			
			//Delete대신 isDelete필드를 1로 변경
			pStmt.executeUpdate();
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
