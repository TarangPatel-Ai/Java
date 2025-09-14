package com.caltech.pojo;

public class Employee {
	
	//default : scope is within the class -> and behave like private mode 
	private int empno;
	private String name;
	private double salary;
	private String emailId;
	
	//Setter and Getter
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	//whenever we need the validate whether the object data is assigned to the instance variables/objects
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", emailId=" + emailId + "]";
	}
	
	
	

}
