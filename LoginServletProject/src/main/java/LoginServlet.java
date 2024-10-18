import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	  {
		res.setContentType("text/html");
	  	PrintWriter out = res.getWriter();
	  	
	  	String user = req.getParameter("user");
	  	String password = req.getParameter("password");
	  	
	  	out.println("<body bgcolor = 'lightblue'>");
	  	
	  	if(user.equals("admin")&& password.equals("centum"))
	  	{
	  		out.println("<h1>Welcome " +user +"</h1>");
	  	}
	  	else
	  	{
	  		out.println("<h1>Incorrect User Id or Password</h1>");
	  	}
	  	
	  	out.println("<br><br><br>");
		out.println("<a href = 'login.html'>Back</a>");
	  	
	  }
}
