package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Student {

	public static void main(String[] args) {
		try {
			//1. Load The Drivers
			Class.forName("org.postgresql.Driver");
			//2.Create the Connection
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Practice","postgres","admin");
			//3.Create a statement
			PreparedStatement p= con.prepareStatement("SELECT * from students");
			//4.Execute Query
			ResultSet rs=p.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
