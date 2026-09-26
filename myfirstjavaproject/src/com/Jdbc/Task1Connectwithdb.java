package com.Jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task1Connectwithdb {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded successfully !");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/praveen","root","root");
		
		System.out.println("Database connected successfully");
		
		Statement stmt=con.createStatement();
		 System.out.println("Statement created successfully");
		 
		 String sql="Select *from stu";
		 ResultSet rs=stmt.executeQuery(sql);
		 
		 
		 System.out.println("quesry succesfully exceuted");
		 
		 while(rs.next())
		 {
			 System.out.print(rs.getString(1)+" ");
			 System.out.println();
			 System.out.print(rs.getInt(2)+" ");
			 System.out.println();
			 System.out.print(rs.getString(3)+" ");
			 System.out.println();
			 System.out.print(rs.getString(4)+" ");
		 }
		

	}

}
