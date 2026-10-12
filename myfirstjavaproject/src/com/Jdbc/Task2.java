package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Task2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/praveen","root","root");
		
		
		Statement st=con.createStatement();
		
		int n=st.executeUpdate("insert into patient values(5,23,'hiv2','kiran')");
		
		if(n>0)
		{
			System.out.println(n+" rows affected");
		}
		else
		{
			System.out.println("something wrong");
		}
		
		con.close();
		
		
		
		

	}

}
