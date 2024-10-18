package com.jdbc.emp.entity;
public class Emp {
  private Integer eno,sal;
  private String ename,dept;
    public Integer getEno() {
	   return eno;
   }
  public void setEno(Integer eno) {
	this.eno = eno;
}
public Integer getSal() {
	return sal;
}
public void setSal(Integer sal) {
	this.sal = sal;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}  
}
