package com.Tns.javaPractices;

public class demo4Constructor {
	public static void main(String args[]) {
		demo4Constructor d4 = new demo4Constructor();
		d4.A();
		d4.A(20);
		d4.A(10, 200);
	}

	void A() {
		System.out.println("iam with 0 Constructor");
	}

	void A(int a) {
		System.out.println("A value is :"+a);

	}
	void A(int a,int b) {
		System.out.println("B value is :"+a+b);
	}
}


