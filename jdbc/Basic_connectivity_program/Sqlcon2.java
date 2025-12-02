package jdbc;

import java.sql.*;
public class Sqlcon2 {
	public static void main(String args[]) throws Exception{
		Connection con=Sqlcon1.getcon()	;
		String query="insert into one1 values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,101);
		ps.setString(2, "akhi");
		ps.setString(3, "abc");
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Done successfully");
		}
		else {
			System.out.println("Not done successfully");
		}
		}
}
