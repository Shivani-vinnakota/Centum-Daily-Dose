<%@ page import="com.emp.entity.Emp"%>
<%@ page import= "com.emp.dao.EmpDaoImpl"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat" text="red">
 <a href="index.jsp">Add New Record</a>
</body>
</html>
<%
if(request.getMethod().equals("GET"))
{
	EmpDaoImpl empDao = new EmpDaoImpl();
	List<Emp> list = empDao.findAllEmp();
	
	if(list.size()!=0) {
	out.print("<table align = 'center' width='70%' border='1'>");
	out.print("<caption> Employee Information</caption>");
	out.print("<th> Emp ID </th>");
	out.print("<th> Name </th>");
	out.print("<th> Dept </th>");
	out.print("<th> Salary </th>");
	
	for(Emp emp : list)
	{
	   out.print("<tr>");
	   out.print("<td>" + emp.getEmpId()+"</td>");
	   out.print("<td>" + emp.getName()+"</td>");
	   out.print("<td>" + emp.getDept()+"</td>");
	   out.print("<td>" + emp.getSalary()+"</td>");
	   out.print("<td><a href= update.jsp?empId="+ emp.getEmpId() +"&name="+emp.getName() + "&dept="+ emp.getDept() + "&salary=" +emp.getSalary()+">Update </a></td>");
	   out.print("<td><a href= delete.jsp?empId="+ emp.getEmpId() + ">Delete </a></td>");
      out.print("</tr>");
	}
     out.print("</table");
     out.print("<hr size='5' color='red'>");
 
}
	else
	{
		out.print("<h3 style='color:red' > No Record Found...");
	}

}
    %>