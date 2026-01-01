package com.Tns.javaPractices.polymorphismConcpt;

public class methodOLconcpt {
	
	void A() {
		System.out.println("no paramter passing");
	}
	void A(int a) {
		System.out.println("One paramter passing"+a);
	}
	void A(int a,int b) {
		System.out.println("two paramter passing"+a+" "+b);
	}
	void A(int a,double b) {
		System.out.println("two diff DataType paramter passing"+a+" "+b);
	}
	void A(double a,int b) {
		System.out.println("two change sides of  paramter passing"+a+" "+b);
	}
}
