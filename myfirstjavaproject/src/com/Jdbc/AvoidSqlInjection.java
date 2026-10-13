package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AvoidSqlInjection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/praveen","root","root");

				
	
			PreparedStatement ps=con.prepareStatement("select *from patient where pid=? or '1'='1'and age=? or '1'='1'");
		
//		ps.setInt(1, 8);
//		ps.setInt(2, 45);
//		ps.setString(3, "hiv4");
//		ps.setString(4, "praveen1");
	
//		int n=ps.executeUpdate();
//		if(n>0)
//			System.out.println(n+" rows affeccted");
//		else
//			System.out.println("no ");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getInt(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.println();
			}
		
		con.close();
	}

}
