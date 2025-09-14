package com.caltech.logic;

public class Box {
	
	//Methos One
	public double calculationBox(double length, double height, double breadth) {
		return length*height*breadth;
	}
	
	//Method Two
	public double l,h,b;
	public double calculateBox() {
		return l*h*b;
	}
	
	//Method Three
	public double ldata, hdata, bdata;
	public void calculateBoxData() {
		
		double finalcalculate = ldata*hdata*bdata;
		System.out.println("The Box volume is: " + finalcalculate);
	}
	
	//Method Four
	public void calculateBoxes(double l_data, double h_data, double d_data) {
		
		double volumeBox = l_data * h_data * d_data;
		System.out.println("The volume of Box is: " + volumeBox);
	}
	
	
}
