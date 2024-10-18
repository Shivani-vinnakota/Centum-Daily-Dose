package com.training.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.emp.dao.EmpDaoImpl;
@WebServlet("/deleteEmp")
public class DeleteEmpController extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		Integer empId = Integer.parseInt(req.getParameter("empId"));
		
		try 
		{
			 EmpDaoImpl empDao = new EmpDaoImpl();
			 req.getRequestDispatcher(empDao.deleteEmployee(empId)).forward(req,res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
   }
}
