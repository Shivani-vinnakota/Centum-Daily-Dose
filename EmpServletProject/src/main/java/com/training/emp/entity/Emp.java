package com.training.emp.entity;

public class Emp 
{
	Integer EmpId,salary;
	String name,dept;
	public Integer getEmpId()
	{
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
