package com.abstraction.main;

import com.abstraction.logic.CalculateSalary;

public class SalaryMain {
	
	public static void main(String[] args) {
		
		CalculateSalary cs = new CalculateSalary();
		System.out.println(cs.psalaryInc(25000, 10));
		System.out.println(cs.csalaryInc(25000, 5));
	}
}
