package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DB{
	private static DB instance;
	private Connection conn;
	
	public DB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wtw", "wtw", "Javajava2");
	}
	
	public static DB getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new DB();
		}
		return instance;

	}

	public Connection getConnection() {
		return this.conn;
	}

}