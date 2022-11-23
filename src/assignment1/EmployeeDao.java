package assignment1;

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

public class EmployeeDao {
	private String host;
	private String user;
	private String password;
	private String database; 
	private String port;
	
	EmployeeDao(){
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
	//테이블 생성코드
	public void createTable() {
		Connection conn = myGetConnection();
		String sql = "CREATE TABLE if NOT EXISTS employee\r\n"
				+ "(\r\n"
				+ "	id int(255) NOT NULL,\r\n"
				+ "	name varchar(4) NOT NULL,\r\n"
				+ "	position varchar(4) NOT NULL,\r\n"
				+ "	joinDate datetime,\r\n"
				+ "	PRIMARY KEY (id)\r\n"
				+ ");\r\n"
				+ "";
		try {
			Statement stmt = conn.createStatement();
			
			stmt.execute(sql);
			stmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertEmployee(Employee1 emp) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO employee(id, `name`, `position`, joinDate) VALUES(?,?,?,?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, emp.getId());
			pStmt.setString(2, emp.getName());
			pStmt.setString(3, emp.getPosition());
			pStmt.setString(4, emp.getJoinDate().toString());
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public void printAllEmployee() {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM employee ORDER BY joindate DESC;";
		List<Employee1> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee1 e = new Employee1();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPosition(rs.getString(3));
				System.out.println(rs.getString(4));
				e.setJoinDate(LocalDate.parse(rs.getString(4).substring(0,10)));
				list.add(e);
			}	
			for (Employee1 e : list)
				System.out.println(e);	
			
			rs.close(); stmt.close(); conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
