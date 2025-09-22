package com.example;

import java.util.Scanner;

public class BankATM {
	
	
	public void Withdrawal() throws Exception {
		
		double balance = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter withdrwal amount:");
		double amount = sc.nextDouble();
		if(amount<=balance) {
			double finalBalance = balance - amount;
			System.out.println("Your final balance is:" + finalBalance);
			
		}
		else {
			throw new LowBalanceException("Your Bank Balance is low");
		}
	}
}
