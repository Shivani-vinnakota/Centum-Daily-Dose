
<%@ page import= "com.emp.dao.EmpDaoImpl"%>

<%
if(request.getMethod().equals("GET"))
{
	Integer empId = Integer.parseInt(request.getParameter("empId"));
	
	EmpDaoImpl empDao = new EmpDaoImpl();
	empDao.deleteRecord(empId);

	response.sendRedirect("findAll.jsp");
}
%>