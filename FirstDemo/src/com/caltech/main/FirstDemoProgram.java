package com.caltech.main;

import com.caltech.logic.BaseLogic;
import com.caltech.logic.Person;

public class FirstDemoProgram {
	
	//first point to execution in java is going to be  always in main block
	//shortcut: write main + (ctrl+spacebar) and enter 
	public static void main(String[] args) {
		//shortcut for printing statement in java => write syso + (ctrl+spacebar) and enter 
		System.out.println("Hello World!!");
		
		//How to create an object
								 //constructor
		BaseLogic  baseobj = new BaseLogic();
		System.out.println("the value of c is: " + baseobj.c);
	
		Person personobj = new Person();
		personobj.salary = 75000; // Here this is the data manipulation so now you can check the output of salary is 75000
		personobj.name = "Captain America";
		personobj.Display();
	}
}
