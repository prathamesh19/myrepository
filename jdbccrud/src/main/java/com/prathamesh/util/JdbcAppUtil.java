package com.prathamesh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAppUtil {

public static void getJdbcConnection(String QueryString){
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	try {
		Class.forName("org.hsqldb.jdbcDriver");
		con=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","SA","");
		stmt=con.createStatement();
		 rs=stmt.executeQuery("create table STUDENT_INFO(ROLL_NO int, STUDENT_NAME varchar(20))");
		 rs=stmt.executeQuery(QueryString);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
}
