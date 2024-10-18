import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet3 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	  {
		res.setContentType("text/html");
	  	PrintWriter out = res.getWriter();
	  	out.println("welcome User...It Http Servlet class...");
	  	
	  	out.println("<br><br><br>");
		out.println("<a href = 'index.html'>Back</a>");
	  }

}
