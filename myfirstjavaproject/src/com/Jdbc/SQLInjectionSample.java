package com.Jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class SQLInjectionSample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/praveen","root","root");
		
		
		Statement st=con.createStatement();
		
		String s="Select * from patient where pid=1 or '1'='1' and age='22' or '1'='1'";
		ResultSet rs=st.executeQuery(s);
		
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
