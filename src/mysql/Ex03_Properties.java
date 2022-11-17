package mysql;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Ex03_Properties {

	public static void main(String[] args) {
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
			String connStr = "jdbc:mysql://" + host + ":" + "/"+ database;
			System.out.println(connStr);
			conn = DriverManager.getConnection(connStr, user, password);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
