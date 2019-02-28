package com.prathamesh.maven_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("oracle.jdbc.driver.OracleDriver");  
    	  
    	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");  
    	  
    	Statement stmt=con.createStatement();  
    	boolean rs=stmt.execute("drop table emp");
    	 stmt.close();
    	 con.close();
    	 System.out.println("query executed succesfully");
    
    }
}
