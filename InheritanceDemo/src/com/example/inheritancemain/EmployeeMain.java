package com.example.inheritancemain;

import com.example.inheritance.ContractEmployee;
import com.example.inheritance.PermanentEmployee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		PermanentEmployee pe = new PermanentEmployee();
		pe.hikeSalary();
		
	    ContractEmployee ce = new ContractEmployee();
		ce.hikeSalary();
		
		
	}
}
