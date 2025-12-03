package jdbc2;

import java.sql.*;
import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) throws Exception {
		Connection con=Class1.getcon();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of users data to insert:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter details for user"+i);
			String query="insert into one1 values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter the id:");
			int id=sc.nextInt();
			ps.setInt(1, id);
			sc.nextLine();
			
			System.out.println("Enter the name:");
			String name=sc.nextLine();
			ps.setString(2, name);

			System.out.println("Enter the password:");
			String password=sc.nextLine();
			ps.setString(3, password);
			int j = ps.executeUpdate();
			if (j > 0) {
	            System.out.println("User inserted succesfully");
	        } else {
	            System.out.println("User not inserted successfully");
	        }
		}
        con.close();
	}
}
