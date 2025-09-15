package com.example.inheritance;

public class PermanentEmployee extends Employee{
	
	double salary = 100000;
	double percentage = 10;
	
	public void hikeSalary() {
		
		double hikeAmount = salary * ( percentage/100);
		double FinalSalary = hikeAmount + salary;
		System.out.println("The Permanent Employee Final Salary is: " + FinalSalary);
	}
}
