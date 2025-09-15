package com.example.inheritance;

public class ContractEmployee extends Employee{
	
	double salary = 100000;
	double percentage = 5;
	
	public void hikeSalary() {
		
		double hikeAmount = salary * ( percentage/100);
		double FinalSalary = hikeAmount + salary;
		System.out.println("The Contract Employee Final Salary is: " + FinalSalary);
	}
}
