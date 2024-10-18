<%@page import="com.emp.dao.EmpDaoImpl"%>
<%@page import="org.eclipse.jdt.internal.compiler.lookup.InvocationSite.EmptyWithAstNode"%>
<%@page import="com.emp.entity.Emp"%>
<%
if(request.getMethod().equals("POST"))
{
	Integer empId = Integer.parseInt(request.getParameter("empId"));
	String name = request.getParameter("name");
	String dept = request.getParameter("dept");
	Integer salary = Integer.parseInt(request.getParameter("salary"));


	
	Emp emp = new Emp();
	emp.setEmpId(empId);
	emp.setName(name);
	emp.setDept(dept);
	emp.setSalary(salary);

	EmpDaoImpl empDao = new EmpDaoImpl();
	empDao.updateRecord(emp);
	response.sendRedirect("findAll.jsp");
}
%>