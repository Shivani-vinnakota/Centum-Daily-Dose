package com.training.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.emp.entity.User;

public class UserDaoImpl 
{
    private Connection connection;
    private String sql;
    private PreparedStatement pst;
    private ResultSet rs;
    	
    	public UserDaoImpl() throws ClassNotFoundException,SQLException{
    		connection = MyConnection.getConnection();
    	}
    	
    	public String validateLoginDetails(User user) throws SQLException{
    		sql= "select * from login where userid=? and password=?";
    		pst = connection.prepareStatement(sql);
    		pst.setString(1, user.getUserId());
    		pst.setString(2, user.getPassword());
    		
    		rs = pst.executeQuery();
    		if(rs.next()) {
    			return "EmpOperations.html";
    		}
    		else {
    			return "index.html";
    		}
    	}
    	public String registerUser(User user) throws SQLException
    	{
    		sql = "insert into login values(?,?)";
    		pst = connection.prepareStatement(sql);
    		pst.setString(1, user.getUserId());
    		pst.setString(2,user.getPassword());
    		pst.executeUpdate();
    		return "EmpOperations.html";
    	}
    }

