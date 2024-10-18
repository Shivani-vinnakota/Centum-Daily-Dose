package com.training.emp.dao;
import java.sql.SQLException;
import java.util.List;

import com.training.emp.entity.Emp;

public interface IEmpDao 
{
   String addEmployee(Emp emp) throws SQLException;
   String deleteEmployee(Integer empId)throws SQLException;
   String updateEmployee(Emp emp)throws SQLException;
   Emp findEmployeeById(Integer empId)throws SQLException;
   List<Emp> findAllEmp() throws SQLException;
}
