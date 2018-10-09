package br.com.bruno.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConfig {

	 public static Connection getConnection() throws SQLException, ClassNotFoundException {
	        Class.forName("com.mysql.jdbc.Driver");
	        return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/notas_db", "root", "");
	    }
	
}
