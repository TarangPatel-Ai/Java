package com.caltech.pojo;

public class Student {
	private int rollNo;
	private String name;
	private String address;
	private double totalMarks;
	
	
//	public int getRollNo() {
//		return rollNo;
//	}
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public double getTotalMarks() {
//		return totalMarks;
//	}
//	public void setTotalMarks(double totalMarks) {
//		this.totalMarks = totalMarks;
//	}
	
	//Now lets see the setting values via the constructors
	public Student(int rollNo, String name, String address, double totalMarks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.totalMarks = totalMarks;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", totalMarks=" + totalMarks
				+ "]";
	}



	
	
}
