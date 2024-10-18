package com.jdbc.emp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.emp.entity.Emp;
public class EmpDaoImpl implements IEmpDao 
{    
	String sql;
	PreparedStatement pst;
    Connection conn;
    ResultSet result;
    
    public EmpDaoImpl()
    {
    	conn = MyConnection.getConnection();
    }
	@Override
	public String insertRecord(Emp emp) throws SQLException {
		sql = "insert into emp values( ?,?,?,?)";
	    pst = conn.prepareStatement(sql);
	    pst.setInt(1, emp.getEno());
	    pst.setString(2, emp.getEname());
	    pst.setString(3, emp.getDept());
	    pst.setInt(4, emp.getSal());
	    pst.executeUpdate();
	    return "Record Added";
	}

	@Override
	public Integer deleteRecord(Integer eno)throws SQLException {
		 sql = "delete from emp where eno = ?";
		 pst = conn.prepareStatement(sql);
	     pst.setInt(1, eno);
	     return pst.executeUpdate();
	     
	}

	@Override
	public Integer updateRecord(Emp emp)throws SQLException {
		sql = "update emp1 set salary =?  where eno= ?";
		 pst = conn.prepareStatement(sql);
		 pst.setInt(2, emp.getSal());
		 pst.setInt(1,emp.getEno());
		 return pst.executeUpdate();
	}

	@Override
	public Emp findRecordByEmpId(Integer eno)throws SQLException {
		
		 sql = "select * from emp where eno = ? ";
		   pst = conn.prepareStatement(sql);
		   pst.setInt(1,eno);
		   result = pst.executeQuery();
		   Emp emp = null;
		   if(result.next()) 
		   {
			   emp=new Emp();
			   emp.setEno(result.getInt(1));
			   emp.setEname(result.getString(2));
			   emp.setDept(result.getString(3));
			   emp.setSal(result.getInt(4));
		   }
		return emp;
	}

	@Override
	public List<Emp> findAllRecords()throws SQLException 
	{
		sql = "select * from emp1";
		pst = conn.prepareStatement(sql);
		result = pst.executeQuery();
		List<Emp> list = new ArrayList<Emp>();
		
		 while(result.next()) {
			Emp emp=new Emp();
			   emp.setEno(result.getInt(1));
			   emp.setEname(result.getString(2));
			   emp.setDept(result.getString(3));
			   emp.setSal(result.getInt(4));
			   list.add(emp);
		  }	 
		return list;
	}   

}
