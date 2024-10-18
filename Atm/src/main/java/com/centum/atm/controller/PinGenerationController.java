package com.centum.atm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.centum.atm.dao.UserDaoImpl;
import com.centum.atm.entity.User;

@WebServlet("/pingeneration")
public class PinGenerationController extends HttpServlet 
{
 

public void doPost(HttpServletRequest req ,HttpServletResponse res )throws ServletException,IOException,NumberFormatException
  {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  
	  
	  
	  String cardNumber = req.getParameter("cardNo");
	  String pin = req.getParameter("pinNo");
	  String validThru = req.getParameter("expiryDate");
	  String cvv = req.getParameter("cvv");	  
	  String accNumber = req.getParameter("accno");
	  String cpin = req.getParameter("cpin");
	 
	  if(pin.equals(cpin))
	  {
	     try
	     {
			 User user = new User(); 
			 UserDaoImpl userDao = new UserDaoImpl();
			 
			
			 user.setAccNumber(accNumber);
			 user.setCardNumber(cardNumber);
			 user.setCvv(cvv);
			 user.setValidThru(validThru);
			 user.setPin(pin);
			 ServletContext sc= getServletContext();
			 sc.setAttribute("accno", accNumber);
			 req.getRequestDispatcher(userDao.pinGenerationUser(user)).forward(req, res);
				
	       }
	      catch(Exception e)
	     {
		  System.out.println(e); 
	     }
	  }
	  else
	  {
		  out.println("<h3 style=color:red>Both passwords are doesnot match</h3>");
	  }
  }

}

