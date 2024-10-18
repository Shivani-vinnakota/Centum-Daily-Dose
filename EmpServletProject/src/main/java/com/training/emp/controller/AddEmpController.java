package com.training.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.training.emp.dao.EmpDaoImpl;
import com.training.emp.entity.Emp;

@WebServlet("/addEmp")
public class AddEmpController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	Integer empId = Integer.parseInt(req.getParameter("empId"));
	String name = req.getParameter("name");
	String dept = req.getParameter("dept");
	Integer salary = Integer.parseInt(req.getParameter("salary"));
	
	try
	{
		Emp emp = new Emp();
		EmpDaoImpl empDao = new EmpDaoImpl();
		
		emp.setEmpId(empId);
		emp.setName(name);
		emp.setDept(dept);
		emp.setSalary(salary);
		req.getRequestDispatcher(empDao.addEmployee(emp)).forward(req,res);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
