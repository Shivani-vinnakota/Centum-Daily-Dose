package com.jdbc.emp.dao;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.emp.entity.Emp;

public interface IEmpDao {
	  String insertRecord(Emp emp) throws SQLException;
	  Integer deleteRecord(Integer eno)throws SQLException;
	  Integer updateRecord(Emp emp)throws SQLException;
	  Emp findRecordByEmpId(Integer eno)throws SQLException;
	  List<Emp>findAllRecords()throws SQLException; 
}
