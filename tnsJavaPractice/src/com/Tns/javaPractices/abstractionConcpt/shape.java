package com.Tns.javaPractices.abstractionConcpt;

public abstract class shape {
	int area;
	 public abstract void calcArea();
	 public void display() {
		 System.out.println("Area="+area);
	 }
}
