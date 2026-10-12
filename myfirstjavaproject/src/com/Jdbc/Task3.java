package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.cj.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/praveen","root","root");
		

		Statement st=con.createStatement();
		
		String s="SElect *from patinet";
		ResultSet rs=st.executeQuery(s);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
		con.close();
		
		
	}

}
