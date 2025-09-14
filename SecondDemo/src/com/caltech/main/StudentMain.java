package com.caltech.main;

import java.util.Scanner;

import com.caltech.pojo.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Student RollNo: ");
		int rollNo =  sc.nextInt();
		
		System.out.println("Enter the value of Student Name: ");
		String name  =  sc.next();
		
		System.out.println("Enter the value of Student Address: ");
		String address =  sc.next();
		
		System.out.println("Enter the value of Student Total Marks: ");
		double totalMarks =  sc.nextDouble();
		
//		System.out.println("Enter the value of Student RollNo: ");
//		stud.setRollNo(sc.nextInt());
//		System.out.println("Enter the value of Student Name: ");
//		stud.setName(sc.next());
//		System.out.println("Enter the value of Student Address: ");
//		stud.setAddress(sc.next());
//		System.out.println("Enter the value of Student Total Marks: ");
//		stud.setTotalMarks(sc.nextDouble());
		
		Student stud = new Student(rollNo, name, address, totalMarks);
		
		System.out.println("The Details of Student is: " + stud);
		

	}

}
