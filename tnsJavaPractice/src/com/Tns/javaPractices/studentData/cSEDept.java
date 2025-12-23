package com.Tns.javaPractices.studentData;

public class cSEDept {
	String StudentName;
	int StudentRollNo;
	
	public cSEDept(String StudentName, int StudentRollNo) {
		System.out.println("Student name is :"+StudentName);
		System.out.println("Student RollNO is :"+StudentRollNo);
	}
	public void database() {
		System.out.println("CSE department has DataBase Subject");
	}
	public void javaSub() {
		System.out.println("CSE department has JAVA Subject");
		
	}
	public void SpringSub() {
		System.out.println("CSE department has SpringBoot Subject");
		
	}

}
