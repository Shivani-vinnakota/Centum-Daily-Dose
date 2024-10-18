package com.training.emp.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.training.emp.dao.EmpDaoImpl;
import com.training.emp.entity.Emp;

@WebServlet("/findAllEmp")
public class FindAllEmployee extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	try {
		EmpDaoImpl empDao = new EmpDaoImpl();
		List<Emp> list = empDao.findAllEmp();
		
		if(list.size()!=0) {
		out.print("<table align = 'center' width='70%' border='1'>");
		out.print("<caption> Employee Information</caption>");
		out.print("<th> Emp ID </th>");
		out.print("<th> Name </th>");
		out.print("<th> Dept </th>");
		out.print("<th> Salary </th>");
		
		for(Emp emp : list)
		{
		   out.print("<tr>");
		   out.print("<td>" + emp.getEmpId()+"</td>");
		   out.print("<td>" + emp.getName()+"</td>");
		   out.print("<td>" + emp.getDept()+"</td>");
		   out.print("<td>" + emp.getSalary()+"</td>");
	      out.print("</tr>");
		}
	   out.print("</table");
	   out.print("<hr size='5' color='red'>");
	  out.print("<h3><a href = 'EmpOperations.html'> Back </a></h3>");
	}
		else
		{
			out.print("<h3 style='color:red' > No Record Found...");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
  }	
}
