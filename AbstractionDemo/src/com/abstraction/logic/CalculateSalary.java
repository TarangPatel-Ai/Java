package com.abstraction.logic;

public class CalculateSalary extends SalaryOpration {

	@Override
	public String psalaryInc(float amount, double bonus) {

		double hikeAmount = amount * ( bonus/100);
		double FinalSalary = hikeAmount + amount;
		
		return ("The permanent employee Bonus is: " + (FinalSalary));
	}

	@Override
	public String csalaryInc(float amount, double bonus) {
		
		double hikeAmount = amount * ( bonus/100);
		double FinalSalary = hikeAmount + amount;
		
		return ("The Contract employee Bonus is: " + (FinalSalary));
	}
	
}
