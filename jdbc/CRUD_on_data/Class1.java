package jdbc2;

import java.sql.*;
public class Class1 {
	static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/one";
	static  String DB_USERNAME = "root";
	static String DB_PASSWORD = "Akhila@4234";
	public static Connection getcon() throws Exception {
		
			Class.forName(DB_DRIVER);
			Connection con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			if(con!=null) {
				System.out.println("Done");
			}
			else {
				System.out.println("Not done");
			}
		return con;
	}
}
