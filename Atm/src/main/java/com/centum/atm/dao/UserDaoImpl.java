package com.centum.atm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.centum.atm.entity.Transaction;
import com.centum.atm.entity.User;
import com.mysql.cj.xdevapi.Result;

public class UserDaoImpl 
{
  private Connection conn;
  private String sql;
  private PreparedStatement pst;
  
  public UserDaoImpl() throws ClassNotFoundException,SQLException
  {
	  conn=MyConnection.getConnection();
  }
  
  public String validateLoginDetails(User user) throws SQLException
  {
	  sql = "select * from atmCard where cardNo=? and pinNo=?";
	  pst = conn.prepareStatement(sql);
	  pst.setString(1,user.getCardNumber());
	  pst.setString(2,user.getPin());
	  
	  ResultSet rs = pst.executeQuery();
	  if(rs.next()) 
	  {
		  return "AtmOperations.html";
      }
	  else
	  {
		  return "index.html";
	  }
	
    }
  public String pinGenerationUser(User user) throws SQLException
  {  
	  sql = "select * from AccountHolder where accno=?";
	  pst = conn.prepareStatement(sql);
	  pst.setString(1,user.getAccNumber());
	  ResultSet accResult = pst.executeQuery();
	  if(accResult.next() && accResult.getInt(1) > 0)
	  {
		  String cardQuery = "SELECT * from AccountHolder WHERE accno = ? AND card_number = ?";
         pst = conn.prepareStatement(cardQuery);
          pst.setString(1, user.getAccNumber());
          pst.setString(2, user.getCardNumber());
          ResultSet cardResult = pst.executeQuery();

          if (cardResult.next() && cardResult.getInt(1) > 0) {
              // Card number exists, proceed to check valid_thru
              String validThruQuery = "SELECT valid_thru FROM AccountHolder WHERE accno = ? AND card_number = ?";
              pst = conn.prepareStatement(validThruQuery);
              pst.setString(1,user.getAccNumber() );
              pst.setString(2,user.getCardNumber() );
              pst.setString(3,user.getValidThru());
              ResultSet validThruResult = pst.executeQuery();


              
			
			 if (validThruResult.next()) {
	                String result = validThruResult.getString("valid_thru");
	                // Compare the fetched string with a string in your code
	                if (result.equals(valid_thru)) {
	                    System.out.println("The name is John.");
	                }
			//if (validThruResult.next() && validThruResult.getString("valid_thru").equals(valid_thru)) {
            	    // Valid_thru matches, proceed to check CVV
            	    String cvvQuery = "SELECT cvv FROM AccountHolder WHERE accno = ? AND card_number = ? AND valid_thru = ?";
            	    pst = conn.prepareStatement(cvvQuery);
            	    pst.setString(1, user.getAccNumber());
            	    pst.setString(2, user.getCardNumber());
            	    pst.setString(3, user.getValidThru());

            	    ResultSet cvvResult = pst.executeQuery();

            	    if (cvvResult.next()) {
                                return ("index.html");
                          } else {
                        	  return("error");
                         }
                   } else {
                	   return("valid_thru error");
                    }
              } else {
            	  return("card_number_error");
               }
           } else {
        	   return("account_number_error");
      }     
	
  }
  
  /*public String pinUser(User user) throws SQLException
  {
	  
	  sql = "Update sign set pin=? where accno=?";
	  pst = conn.prepareStatement(sql);
	  pst.setString(1,user.getPin());
	  pst.setString(2, user.getAccNumber());
	   pst.executeUpdate();
	   return "index.html";
	   =============
	    pst.setString(2,user.getCardNumber());
	  pst.setString(3,user.getValidThru());
	  pst.setString(4,user.getCvv());
	  pst.setString(5,user.getPin());
      
	
  }*/
  /*public String deposit(Transaction transaction) {
	    try {
	    	User user = new User();
	        sql = "UPDATE transaction SET amount = ? WHERE card_number = ?";
	        pst = conn.prepareStatement(sql);
	        pst.setString(1, transaction.getAmount()); // Assuming amount is a numeric type
	        pst.setString(2, user.getCardNumber());
	        Integer no = pst.executeUpdate();
	        if (no > 0) {
	            return "index.html";
	        } else {
	            return "deposit_1.html";
	        }
	    } catch (SQLException e) {
	        e.printStackTrace(); // Handle the exception or log it
	        return "error.html"; // Return an error page or message
	    }
	}*/
  public String deposit(Transaction transaction, String accno) throws SQLException {
	    sql = "INSERT INTO transactions (amount, accno, transaction_type) VALUES (?, ?, ?)";
	    pst = conn.prepareStatement(sql);

	    // Set the values for the prepared statement
	    pst.setBigDecimal(1, transaction.getAmount()); // Assuming transaction.getAmount() returns a BigDecimal
	    pst.setString(2, accno);
	    pst.setString(3, "deposit"); // Assuming this is a deposit transaction

	    int no = pst.executeUpdate();
	    
	    if (no > 0) {
	        return "deposit_1.html";
	    } else {
	        return "index.html";
	    }
	}	

  }
