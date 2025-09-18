package com.bankroi.calculate;

public class Bank {
	
	public double calculateROI(double roi, double amount) {
		
		double result = roi*amount/100;
		return result;
	}
	
}
