package com.Tns.javaPractices.ConstructorConcpt;

public class classConstr {
	public static void main(String args[]) {
		classConstr d4 = new classConstr();
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

