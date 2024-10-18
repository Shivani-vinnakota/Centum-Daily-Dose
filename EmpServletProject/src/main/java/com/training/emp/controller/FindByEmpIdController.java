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
@WebServlet("/findByEmpId")
public class FindByEmpIdController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		Integer empId = Integer.parseInt(req.getParameter("empId"));
		
		try {
			EmpDaoImpl empDao = new EmpDaoImpl();
			Emp emp = empDao.findEmployeeById(empId);
			
			out.print("<table align = 'center' width='70%' border='1'>");
			out.print("<caption> Employee Information</caption>");
			out.print("<th> Emp ID </th>");
			out.print("<th> Name </th>");
			out.print("<th> Dept </th>");
			out.print("<th> Salary </th>");
			
			out.print("<tr>");
			   out.print("<td>" + emp.getEmpId()+"</td>");
			   out.print("<td>" + emp.getName()+"</td>");
			   out.print("<td>" + emp.getDept()+"</td>");
			   out.print("<td>" + emp.getSalary()+"</td>");
		out.print("</tr>");
		
		out.print("</table");
		out.print("<hr size='5' color='red'>");
		out.print("<h3><a href = 'EmpOperations.html'> Back </a></h3>");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
