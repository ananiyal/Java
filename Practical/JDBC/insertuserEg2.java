package com.ananiyal.JDBCeg1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertuserEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			   
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "#Ana2846");
	    	
	    	PreparedStatement st = con.prepareStatement("insert into student2 values(?,?,?)");
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	do {
	    		
	    	 System.out.println("Enter Id");
	    	 int id = Integer.parseInt(br.readLine());
	    	
	    	 System.out.println("Enter Name");
	    	 String studentname = br.readLine();
	    	
	    	 System.out.println("Enter Age");
	    	 int studentage = Integer.parseInt(br.readLine());
	    	
	    	 st.setInt(1, id);
	    	 st.setString(2, studentname);
	    	 st.setInt(3, studentage);
	    	
	         st.executeUpdate();
	         System.out.println("Insert successfully");
	    
	         System.out.println("Do you want to contiune: y/n");
	         String s = br.readLine();
	        
	        if(s.startsWith("n")) {
	        	break;	
	        	}
	        	}while(true);
	        	
			con.close();
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    }

	}

}