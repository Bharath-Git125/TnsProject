package com.Tns.javaPractices.JDBCconcpt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbcdemo {

	public static void main(String[] args)throws Exception {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver has been Loaded");
		
		String url="jdbc:postgresql://localhost:5432/SriIndu";
		String uname="postgres";
		String pwd="root";
		
		Connection con = DriverManager.getConnection(url,uname,pwd);
		System.out.println("connection has been established");

		Statement st = con.createStatement();
		//int i = st.executeUpdate("insert into Student values('bharath','20')");
		//int i = st.executeUpdate("insert into Student values('varun','21')");
		//System.out.println(i+" record updated successfully");
		ResultSet rs = st.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.println("name = "+rs.getString(1)+" age= "+rs.getString(2));
		}

		con.close();
		st.close();

	}
}
