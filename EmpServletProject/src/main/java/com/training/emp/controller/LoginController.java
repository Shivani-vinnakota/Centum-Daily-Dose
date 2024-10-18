package com.training.emp.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.training.emp.entity.User;
import com.training.emp.dao.UserDaoImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet
{
     public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
     {
    	 res.setContentType("text/html");
    	 PrintWriter out = res.getWriter();
    	 String userId = req.getParameter("userid");
    	 String password = req.getParameter("password");
    	 
    	 try
    	 {
    		 User user = new User();
    		 UserDaoImpl userDao = new UserDaoImpl();
    		 
    		 user.setUserId(userId);
    		 user.setPassword(password);
    		 
    		 req.getRequestDispatcher(userDao.validateLoginDetails(user)).forward(req,res);
    		 
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
     }
}

