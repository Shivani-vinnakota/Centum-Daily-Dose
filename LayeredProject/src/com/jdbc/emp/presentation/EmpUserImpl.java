package com.jdbc.emp.presentation;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.jdbc.emp.dao.EmpDaoImpl;
import com.jdbc.emp.entity.Emp;

public class EmpUserImpl implements IEmpUser
{
    private Integer eno,sal;
    private String ename,dept; 
    Scanner scan = new Scanner(System.in);
    Emp emp = new Emp();
    EmpDaoImpl empDao = new  EmpDaoImpl();
	@Override
	public void insertRecord()throws SQLException {
		 System.out.println("Enter emp No:");
		 eno = scan.nextInt();
		 System.out.println("Enter emp Name:");
	     ename = scan.next();
		 System.out.println("Enter dept:");
		 dept = scan.next();
		 System.out.println("Enter salary:");
		 sal = scan.nextInt();
		 
		 emp.setEno(eno);
		 emp.setEname(ename);
		 emp.setDept(dept);
		 emp.setSal(sal);
		 System.out.println(empDao.insertRecord(emp));
		
	}
    
	@Override
	public void deleteRecord()throws SQLException {
		System.out.println("Enter emp No:");
		 eno = scan.nextInt();
		 if(empDao.deleteRecord(eno)!=0) 
		 {
			 System.out.println("Record Deleted");
		 }
		 else
		 {
			 System.out.println("Emp No Not Found");
		 }
		
	}

  @Override
	public void updateRecord()throws SQLException
  {
		System.out.println("Enter emp No:");
		 eno = scan.nextInt();
		 System.out.println("Enter salary:");
		 sal = scan.nextInt();
		 
		 emp.setEno(eno);
		 emp.setSal(sal);
		 if(empDao.updateRecord(emp)!=0) 
		 {
			 System.out.println("Record Updated");
		 }
		 else
		 {
			 System.out.println("Record Not Found");
		 }
	}

	@Override
	public void findRecordByEmpId()throws SQLException
	{
		System.out.println("Enter emp No:");
		 eno = scan.nextInt();
		 
		 emp.setEno(eno);
         emp = empDao.findRecordByEmpId(eno);
         if(emp!=null)
         {
        	 System.out.println("EmpNo\tName\tDept\tSalary");
        	 System.out.println("-------------------------------");
        	 System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getDept()+"\t"+emp.getSal());
         }
         else
         {
        	 System.out.println("Record Not Found");
         }
	}

	@Override
	public void findAllRecords()throws SQLException
	{
	  List<Emp>list = empDao.findAllRecords();
	  if(list.size()!=6)
	  {
		  System.out.println("EmpNo\tName\tDept\tSalary");
		  System.out.println("-------------------------------");
		  for(Emp emp:list)
		  {
			  System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getDept()+"\t"+emp.getSal());
		  }  
	  }
	  else
	  {
		  System.out.println("No Records Found");  
	  }
	} 

}
