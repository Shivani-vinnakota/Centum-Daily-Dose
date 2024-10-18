import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet2 extends GenericServlet
{ 
  public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
  {
	res.setContentType("text/html");
  	PrintWriter out = res.getWriter();
  	out.println("welcome User...It GenericServlet class...");
  	
  	out.println("<br><br><br>");
	out.println("<a href = 'index.html'>Back</a>");
  }

}
