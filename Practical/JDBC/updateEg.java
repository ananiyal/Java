package com.ananiyal.JDBCeg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class updateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			   
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "#Ana2846");
	    	Statement st = con.createStatement();
	    	
	    	st.executeUpdate("update student2 set studentname = 'NAIROBI' where id=3 ");
	    	System.out.println("Updated Succesfully");
	    	
	    	
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

