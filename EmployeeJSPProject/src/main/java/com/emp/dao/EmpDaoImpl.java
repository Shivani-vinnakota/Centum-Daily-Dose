package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.dao.MyConnection;
import com.emp.entity.Emp;

public class EmpDaoImpl 
{
	 private Connection connection;
	    private String sql;
	    private PreparedStatement pst;
	    private ResultSet rs;
	    
	    public EmpDaoImpl() throws ClassNotFoundException,SQLException
	    {
	    	connection = MyConnection.getConnection();
	    }
	    
	    public void addEmployee(Emp emp)throws SQLException
	    {
	    	sql = "insert into emp1 values(?,?,?,?)";
	    	pst = connection.prepareStatement(sql);
	    	pst.setInt(1, emp.getEmpId());
	    	pst.setString(2, emp.getName());
	    	pst.setString(3, emp.getDept());
	    	pst.setInt(4, emp.getSalary());
	    	pst.executeUpdate();

	    }
	    public List<Emp> findAllEmp() throws SQLException
	    {
	    	List<Emp> list = new ArrayList<Emp>();
	    	sql = "select * from emp1";
	    	pst = connection.prepareStatement(sql);
	    	rs = pst.executeQuery();
	    	
	    	while(rs.next())
	    	{
	    		Emp emp = new Emp();
	    		emp.setEmpId(rs.getInt(1));
	    		emp.setName(rs.getString(2));
	    		emp.setDept(rs.getString(3));
	    		emp.setSalary(rs.getInt(4));
	    		list.add(emp);
	    	}
	    	return list;
	    }
	    
	    public void updateRecord(Emp emp) throws SQLException
		{
			System.out.println("Emp = " + emp);
			sql = "update emp1 set ename=?,dept=?, salary=? where empId =?";
			pst = connection.prepareStatement(sql);
			pst.setString(1,emp.getName());
			pst.setString(2,emp.getDept());
			pst.setInt(3,emp.getSalary());
			pst.setInt(4,emp.getEmpId());
			pst.executeUpdate();		
		
		}
	    
	    public Emp findEmployeeById(Integer empId) throws SQLException
	    {
	    	sql = "select * from emp1 where empId = ?";
	    	pst = connection.prepareStatement(sql);
	    	pst.setInt(1, empId);
	    	rs = pst.executeQuery();
	    	
	    	if(rs.next()) {
	    		Emp emp = new Emp();
	    		emp.setEmpId(rs.getInt(1));
	    		emp.setName(rs.getString(2));
	    		emp.setDept(rs.getString(3));
	    		emp.setSalary(rs.getInt(4));
	    		return emp;
	    	}
	    	else
	    	{
	    		return null;
	    	}
	    }
	    
	    public String deleteRecord(Integer empId)throws SQLException
	    {
	    	sql="delete from emp1 where empId = ? ";
	    	pst = connection.prepareStatement(sql);
	    	pst.setInt(1, empId);
	    	pst.executeUpdate();
	    	
	    	return "EmpOperations.html";
	    }
}
