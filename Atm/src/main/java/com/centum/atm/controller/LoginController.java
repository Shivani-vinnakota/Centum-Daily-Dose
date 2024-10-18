package com.centum.atm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centum.atm.dao.UserDaoImpl;
import com.centum.atm.entity.User;
@WebServlet("/login")
public class LoginController extends HttpServlet 
{
 

public void doPost(HttpServletRequest req ,HttpServletResponse res )throws ServletException,IOException
  {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  
	  String cardNumber = req.getParameter("card_Number");
	  String pin = req.getParameter("pin");
	  
	  /*Integer cardno = null;
	  Integer pin1 = null;*/
	  
	  try
	  {
		 /* if (cardNumber != null && pin != null) {
	            cardno = Integer.parseInt(cardNumber);
	            pin1 = Integer.parseInt(pin);
	        }*/
		 User user = new User(); 
		 UserDaoImpl userDao = new UserDaoImpl();
		 
		 user.setCardNumber(cardNumber);
		 user.setPin(pin);
		 
		 /*String a = userDao.validateLoginDetails(user);
		 RequestDispatcher rd = req.getRequestDispatcher(userDao.validateLoginDetails(user));
		 rd.forward(req, res);*/
		 
		 //userDao.validateLoginDetails(user);
		 req.getRequestDispatcher(userDao.validateLoginDetails(user)).forward(req, res);
		 
	  }
	  /*catch (NumberFormatException e) {
		  System.out.println(e);
	  }*/
	  catch(Exception e)
	  {
		  System.out.println(e); 
	  }
	  
	  
  }
}
