package com.prathamesh.jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println("insert into student values(104,'nbv')");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","SYSTEM");
		Statement stmt=conn.createStatement();
		int resultset=stmt.executeUpdate("insert into student values(105,'qwe')");
		System.out.println("table created successfully");
		
	//resultset.close();
		stmt.close();
		conn.close();
	}

}
