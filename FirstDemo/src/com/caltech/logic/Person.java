package com.caltech.logic;

public class Person {
//	public int id = 5;
//	public double salary = 56000;
//	public String name = "Tony Stark";
//	public String gender = "Male";
//	
	/*
	 * public void Display() { System.out.println("The Person id is:" +id+
	 * ", Salary is:" + salary +", Name is:" + name + " and Gender is:"+gender); }
	 */
	
	//Here this is the method with return and with the args
//	public double finalSalary(double salary, double bonus) {
//		return salary+bonus;
//	}
	
	//Now lets see the method with return but without return
	//instance variables :these variables can be used in the class and also outside the class via object
	public double salary, bonus;
	public double finalSalary() {
		return salary + bonus;
	}
	
}
