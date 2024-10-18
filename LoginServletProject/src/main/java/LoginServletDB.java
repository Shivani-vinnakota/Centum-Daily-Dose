import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServletDB extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	  {
		res.setContentType("text/html");
	  	PrintWriter out = res.getWriter();
	  	
	  	String user = req.getParameter("user");
	  	String password = req.getParameter("password");
	  	
	  	out.println("<body bgcolor = 'lightblue'>");
	  	
	  	try
	  	{
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
	  		PreparedStatement pst = conn.prepareStatement("select * from login where user=? and password=?");
	  		pst.setString(1, user);
	  		pst.setString(2, password);
	  		
	  		ResultSet rs = pst.executeQuery();
	  		if(rs.next()==true)
	  		{
	  			out.println("<h1>Welcome " +user+ "</h1");
	  		}
	  		else
	  		{
	  			out.println("<h1>Incorrect User Id or password</h1");
	  		}
	  	}
	  	catch(ClassNotFoundException e)
	  	{
	  		out.println(e);
	  	}
		catch(SQLException e)
	  	{
	  		out.println(e);
	  	}
	  	out.println("<br><br><br>");
	  	out.println("<a href='login.html'>Back</a>");
	  }
}
