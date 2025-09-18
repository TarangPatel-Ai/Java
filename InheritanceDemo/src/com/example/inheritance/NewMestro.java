package com.example.inheritance;

public class NewMestro extends Bike{
	int speed = 300;
	
	public void speedofMestro() {
		
		System.out.println(super.speed + 120);
	}
	public void display() {
		super.display();
	}
}
