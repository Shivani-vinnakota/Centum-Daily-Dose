package com.centum.atm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centum.atm.dao.UserDaoImpl;
import com.centum.atm.entity.User;
@WebServlet("/pin")
public class PinController extends HttpServlet 
{
 

public void doPost(HttpServletRequest req ,HttpServletResponse res )throws ServletException,IOException
  {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  
	  String pin = req.getParameter("pin");
	  String cpin = req.getParameter("cpin");
	  
	  if(pin.equals(cpin))
	  {
	    try
	     {
		   User user = new User(); 
			 UserDaoImpl userDao = new UserDaoImpl(); 
			 
			 user.setPin(pin);
			 
			 req.getRequestDispatcher(userDao.pinUser(user)).forward(req, res);
	     }
        catch(Exception e)
        {
	      System.out.println(e); 
        }
	  }

   }
}