package com.abstraction.logic;

public class Operation_Implimentation extends CalculatorOperation{

	@Override
	public String sum(int value1, int value2) {
		
		return ("The Output of above input is: " + (value1+value2));
	}

	@Override
	public String sub(int value1, int value2) {
		
		return ("The Output of above input is: " + (value1-value2));
	}

	@Override
	public String multiply(int value1, int value2) {

		return ("The Output of above input is: " + (value1*value2));
	}

	@Override
	public String devide(int value1, int value2) {
 
		return ("The Output of above input is: " + (value1/value2));
		
	}
	
}
