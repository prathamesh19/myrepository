package com.prathamesh.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utilities {
public static void databaseConnection() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement stmt=conn.createStatement();
	int resultset=stmt.executeUpdate("insert into employee values(103,'pqr')");
	System.out.println("Query Executed Successfully");
	
	System.out.println(resultset);
//	resultset.close();
	stmt.close();
	conn.close();
}

}
