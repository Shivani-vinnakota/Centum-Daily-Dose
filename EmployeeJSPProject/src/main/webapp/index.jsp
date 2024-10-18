<%@ page import="com.emp.entity.Emp"%>
<%@ page import= "com.emp.dao.EmpDaoImpl"%>
<!DOCTYPE html>
<html>

<body bgcolor="wheat" text="red">
	<form method="post" >
		<fieldset>
			<legend>Add Employee Record</legend>
			
			ID : <br>
			<input type="text" name="empId"> <br><br>
			
			Name : <br>
			<input type="text" name="name"> <br><br>
			
			Dept : <br>
			<input type="text" name="dept"> <br><br>
			
			Salary : <br>
			<input type="number" name="salary"> <br><br>
			
			<input type="submit"value="Save Record"><br><br>
		</fieldset>
	</form>
	<a href="findAll.jsp">Show All Records</a>
</body>
</html>	
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
		empDao.addEmployee(emp);
		response.sendRedirect("findAll.jsp");
   }
	%>

