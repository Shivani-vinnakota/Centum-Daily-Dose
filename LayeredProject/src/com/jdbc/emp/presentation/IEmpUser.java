package com.jdbc.emp.presentation;

import java.sql.SQLException;

public interface IEmpUser 
{
  void insertRecord()throws SQLException;
  void deleteRecord()throws SQLException;
  void updateRecord()throws SQLException;
  void findRecordByEmpId()throws SQLException;
  void findAllRecords()throws SQLException; 
}
