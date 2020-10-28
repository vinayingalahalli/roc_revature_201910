package com.app.jdbc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostresSqlConnection {

	private static Connection connection;
	
	private PostresSqlConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/postgres";			
		String username="postgres";
		String password="postgres";
		connection=DriverManager.getConnection(url, username, password);
		return connection;
	}
}
//Single Ton - Single TON Java CLass.