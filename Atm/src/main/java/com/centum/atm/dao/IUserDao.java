package com.centum.atm.dao;

import java.sql.SQLException;

import com.centum.atm.entity.User;

public interface IUserDao {
	String validateLoginDetails(User user)throws SQLException;
	String registerUser(User user)throws SQLException;
}
