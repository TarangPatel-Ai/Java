package com.caltech.main;

import java.util.Scanner;

import com.caltech.logic.BaseLogic;
import com.caltech.logic.Box;
import com.caltech.logic.Person;

public class FirstDemoProgram {
	
	//first point to execution in java is going to be  always in main block
	//shortcut: write main + (ctrl+spacebar) and enter 
	public static void main(String[] args) {
		//shortcut for printing statement in java => write syso + (ctrl+spacebar) and enter 
		System.out.println("Hello World!!");
		
		//How to create an object
								 //constructor
//		BaseLogic  baseobj = new BaseLogic();
//		baseobj.b = 50;
//		baseobj.Display();
//		System.out.println("the value of c is: " + (baseobj.a + baseobj.b));
//	
		Person personobj = new Person();
//		personobj.salary = 75000; // Here this is the data manipulation so now you can check the output of salary is 75000
//		personobj.name = "Captain America";
//		personobj.Display();
		
		
		//Dynamic Input - Scanner
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Salary of the person");
//		double salary = sc.nextDouble();
//		System.out.println("Enter the given Bonus of the person");
//		double bonus = sc.nextDouble();
//		
//		System.out.println("The final salary for the person is: " + personobj.finalSalary(salary, bonus));
		
	
		//Now see here how to take inputs and get output without args
		//System.out.println("Enter the Final salary of the person is:");
		//personobj.salary = sc.nextDouble();
		//System.out.println("Enter the given Bonus for the person is:");
		//personobj.bonus = sc.nextDouble();
		
		//System.out.println("The finalry salary with Bonus for the person is: " + personobj.finalSalary());
		
		
		//Task Result: method with returntype with args
		Box boxObj = new Box();

//		System.out.println("Please enter the length of the box: ");
//		double length = sc.nextDouble();
//		
//		System.out.println("Please enter the height of the box: ");
//		double height = sc.nextDouble();
//		
//		System.out.println("Please enter the breadth of the box");
//		double breadth = sc.nextDouble();
//		
//		System.out.println("The volume of the box is: " + boxObj.calculationBox(length, height, breadth));
		
		
		//Task Result: method with returntype but without args
//		System.out.println("Please enter the length of the box: ");
//		boxObj.l = sc.nextDouble();
//		
//		System.out.println("Please enter the height of the box: ");
//		boxObj.h = sc.nextDouble();
//		
//		System.out.println("Please enter the breadth of the box");
//		boxObj.b = sc.nextDouble();
//		
//		System.out.println("The volume of the box is: " + boxObj.calculateBox());
		
		
		//Task Result: method without returntype and without args
//		System.out.println("Please enter the length of the box: ");
//		boxObj.ldata = sc.nextDouble();
//		
//		System.out.println("Please enter the height of the box: ");
//		boxObj.hdata = sc.nextDouble();
//		
//		System.out.println("Please enter the breadth of the box");
//		boxObj.bdata = sc.nextDouble();
//		
//		boxObj.calculateBoxData();
		
		System.out.println("Please enter the length of the box: ");
		double l_data = sc.nextDouble();
		
		System.out.println("Please enter the height of the box: ");
		double h_data = sc.nextDouble();
		
		System.out.println("Please enter the breadth of the box");
		double b_data = sc.nextDouble();
		
		boxObj.calculateBoxes(l_data, h_data, b_data);
		
		
		sc.close();
	}
}
