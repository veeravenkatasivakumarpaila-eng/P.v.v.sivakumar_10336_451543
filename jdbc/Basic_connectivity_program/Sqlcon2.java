package jdbc;

import java.sql.*;
public class sqlcon2 {
	public static void main(String args[]) throws Exception{
		Connection con=sqlcon1.getCon()	;
		String query="insert into info values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,101);
		ps.setString(2, "siva");
		ps.setString(3, "abc");
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Done successfully");
		}
		else {
			System.out.println("Not done successfully");
		}
		PreparedStatement sp = con.prepareStatement("SELECT * FROM info");
		ResultSet rs = sp.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));	
		}
		con.close();
		}
}







