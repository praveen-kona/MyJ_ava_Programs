package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/praveen","root","root");
		
		
		PreparedStatement ps=con.prepareStatement("insert into patient values(?,?,?,?)");
		
		ps.setInt(1,6);
		ps.setInt(2, 33);
		ps.setString(3, "hiv");
		ps.setString(4,"praveen");
		int n=ps.executeUpdate();
		if(n>0)
		{
			System.out.println(n+" rows affected");
		}
		else
		{
			System.out.println("something went wrong");
		}
	
		
		con.close();
		
		
		

	}

}
