package com.abstraction.main;

import com.abstraction.logic.Operation_Implimentation;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Operation_Implimentation cal = new Operation_Implimentation();
		
		System.out.println(cal.sum(60, 30));
		System.out.println(cal.sub(60, 30));
		System.out.println(cal.multiply(60, 30));
		System.out.println(cal.devide(60, 30));
	}

}
