package com.jdbc.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection 
{
	 private MyConnection() {}
	 
     private static Connection conn;
     public static Connection getConnection() 
     {
    	 try
    	 {
    		 if(conn==null)
    		 {
    			 Class.forName("com.mysql.cj.jdbc.Driver");
    			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
    		 }
    	 }
    	 catch(ClassNotFoundException e) {
    		 System.out.println(e);
    	 }
    	 catch(SQLException e) {
    		System.out.println(e); 
    	 }
    	 return conn;
}
}
