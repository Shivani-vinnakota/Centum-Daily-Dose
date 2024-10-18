<%@page import="com.emp.dao.EmpDaoImpl"%>
<%@page import="com.emp.entity.Emp"%>
	<%
	if(request.getMethod().equals("GET"))
	{
		Integer empId = Integer.parseInt(request.getParameter("empId"));
		EmpDaoImpl empDao = new EmpDaoImpl();
		Emp emp = empDao.findEmployeeById(empId);
	%>	
	<html>
	<body bgcolor="wheat" text="red">
	<form method="post" action="updateRecord.jsp">
		<fieldset>
			<legend>Update Employee Record</legend>			
				ID : <br>
				<input type="text" name="empId" value="<%=emp.getEmpId()%>" readonly> <br><br>			
				Name : <br>
				<input type="text" name="name" value="<%=emp.getName()%>"> <br><br>			
				Dept : <br>
				<input type="text" name="dept" value="<%=emp.getDept()%>"> <br><br>			
				Salary : <br>
				<input type="number" name="salary" value="<%=emp.getSalary()%>"> <br><br>	
				<input type="submit"value="Update Record"><br><br>		
		</fieldset>
		</form>	
	</body>
	</html>
	<%
	}
	%>