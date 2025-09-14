package com.caltech.main;

import java.util.Scanner;

import com.caltech.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// Note : For a class we can have multiple objects .
		
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Employee No.: ");
		e.setEmpno(sc.nextInt());
		
		System.out.println("Enter the value of Employee Name: ");
		e.setName(sc.next());
		
		System.out.println("Enter the value of Employee Salary: ");
		e.setSalary(sc.nextDouble());
		
		System.out.println("Enter the value of Employee Email Id: ");
		e.setEmailId(sc.next());
		
		System.out.println("The Value of Employee is: " + e);

	}

}
