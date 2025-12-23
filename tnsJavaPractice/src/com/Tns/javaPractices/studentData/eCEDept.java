package com.Tns.javaPractices.studentData;

public class eCEDept {
	String StudentName;
	int StudentRollNo;
	
	public eCEDept(String StudentName, int StudentRollNo) {
		System.out.println("Student name is :"+StudentName);
		System.out.println("Student RollNO is :"+StudentRollNo);
	}
	
	
	public void Optical() {
		System.out.println("ECE department has OPTICAL Subject");
	}
	public void DigitalElectronics() {
		System.out.println("ECE department has DigitalElectronics Subject");
		
	}
	public void CompilerDesign() {
		System.out.println("ECE department has CompilerDesign Subject");
		
	}


}
