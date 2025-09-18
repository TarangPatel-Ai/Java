package com.bankroi.main;

import com.bankroi.calculate.Bank;

public class BankMain {

	public static void main(String[] args) {
			Bank HDFC = new Bank();
			double hdfc = HDFC.calculateROI(7.5,5000);
			System.out.println("HDFC ROI is: " + hdfc);
			
			Bank ICICI = new Bank();
			double icici = HDFC.calculateROI(8,10000);
			System.out.println("ICICI ROI is: " + icici);
		
	}

}
