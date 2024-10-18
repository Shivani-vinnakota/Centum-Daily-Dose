package com.centum.atm.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centum.atm.dao.UserDaoImpl;
import com.centum.atm.entity.Transaction;

@WebServlet("/deposit")
public class DepositController extends HttpServlet 
{ 
public void doPost(HttpServletRequest req ,HttpServletResponse res )throws ServletException,IOException
  {
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  ServletContext sc= getServletContext();
	  String accno=(String)sc.getAttribute("accno");
	  String amountStr = req.getParameter("amount");
	 
	  try
	  {
		 Transaction transaction = new Transaction(); 
			 UserDaoImpl userDao = new UserDaoImpl();	 
		
			 BigDecimal amount = new BigDecimal(amountStr);
			 transaction.setAmount(amount);
			 String resultPage = userDao.deposit(transaction, accno);

	            if ("deposit_1.html".equals(resultPage)) {
	                // Deposit was successful
	          
	            	// Set the success message as a request attribute
	            	req.setAttribute("successMessage", "Deposit of $" + amount.toString() + " was successful.");

	                req.getRequestDispatcher("Thanks.html").forward(req, res);
	            } else {
	                // Handle other cases (e.g., error page)
	                req.getRequestDispatcher(resultPage).forward(req, res);
	            }
	  }
	  catch(Exception e)
	  {
		  System.out.println(e); 
	  }
	  
	  
  }
}


