import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet1 implements Servlet
{
    public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException
    {
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter();
    	//out.println("welcome User...It Servlet interface..."); 
    	out.println("<h1> It Servlet class by implementing Servlet Interface...</h1>");
    	
    	out.println("<br><br><br>");
    	out.println("<a href = 'index.html'>Back</a>");
    }
    public void init(ServletConfig sc) {}

    public void destroy() {}


    public String getServletInfo()
    {
    	return null;
    } 
    
    public ServletConfig getServletConfig()
    {
    	return null;
    }
}

