package mysql.customer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * DAO(Data Access Object)
 */
public class DAO {
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			InputStream is = new FileInputStream("C://workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			String host = props.getProperty("host");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			String database = props.getProperty("database");
			String port = props.getProperty("port", "3306"); // key값이 없으면 디폴트값 3316을 준다
			String connStr = "jdbc:mysql://" + host + ":" + port + "/"+ database;
			conn = DriverManager.getConnection(connStr, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void insertCustomer(Customer customer) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO customer(uid, `name`) VALUES (?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, customer.getUid());	//sql문장 첫번째?에 값입력
			pStmt.setString(2, customer.getName()); //sql문장 두번째?에 값입력
			
			pStmt.executeUpdate();
			pStmt.close();
		} catch (Exception e) {
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
