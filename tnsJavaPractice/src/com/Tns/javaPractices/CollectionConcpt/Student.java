package com.Tns.javaPractices.CollectionConcpt;

public class Student {
	int sid;
	String sName;
	double marks;
	
	public Student(int sid, String sName, double marks) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.marks = marks;
	}
	@Override
	public  String toString(){
		return "Student details >> name="+sName+" " +"sid="+sid+" " +"marks="+marks;
		
	}

	
	

}
