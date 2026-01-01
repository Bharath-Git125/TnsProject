package com.Tns.javaPractices.polymorphismConcpt;

public class methodOR {
	void show() {
		System.out.println("iam parent");
	}

}
class demo extends methodOR{
	
	void show() {
		System.out.println("iam son");
	}
}
