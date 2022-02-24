package com.ananiyal.JDBCeg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertEg 
{
    public static void main( String[] args )
   {    
    	try {
   
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "#Ana2846");
    	Statement st = con.createStatement();
    	
    	st.executeUpdate("insert into student2 values(2,'JOHNSON',25)");
    	    	
    	ResultSet rs = st.executeQuery("select * from student2");
    	while(rs.next()) {
    		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
    		
    	}
    	con.close();
    }
    catch(Exception e) {
    	System.out.println(e);
    }
    
   }
}