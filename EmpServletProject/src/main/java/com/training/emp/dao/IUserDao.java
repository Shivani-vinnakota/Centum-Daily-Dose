package com.training.emp.dao;

import java.sql.SQLException;

import com.training.emp.entity.User;

public interface IUserDao 
{
  String validateLoginDetails(User user)throws SQLException;
  String regiterUser(User user)throws SQLException;
}
