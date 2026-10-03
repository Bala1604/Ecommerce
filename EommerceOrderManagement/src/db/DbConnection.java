package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String url="jdbc:mysql://localhost:3306/ecommerce_db";
	private static final String user="root";
	private static final String password="admin";
	
	 public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection("url", "user", "password");
	    }

}
 