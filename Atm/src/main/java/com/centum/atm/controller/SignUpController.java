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

@WebServlet("/register")
public class SignUpController extends HttpServlet 
{
 

public void doPost(HttpServletRequest req ,HttpServletResponse res )throws ServletException,IOException
  {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  
	  String accHolderName =req.getParameter("accholder_name");
	  String accNumber = req.getParameter("accno");
	  String cardNumber = req.getParameter("card_Number");
	  String cvv = req.getParameter("cvv");
	  String validThru = req.getParameter("valid_Thru");
	 
	  try
	  {
		 User user = new User(); 
		 UserDaoImpl userDao = new UserDaoImpl();
		 
		 user.setAccHolderName(accHolderName);
		 user.setAccNumber(accNumber);
		 user.setCardNumber(cardNumber);
		 user.setCvv(cvv);
		 user.setValidThru(validThru);
		
		 
		 req.getRequestDispatcher(userDao.registerUser(user)).forward(req, res);
			
	  }
	  catch(Exception e)
	  {
		  System.out.println(e); 
	  }
	  
	  
  }


}
