package com.Tns.javaPractices;

public class Test {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.show();
	}
}
class Parent {
	int x = 10;

	Parent() {
		System.out.println("Parent constructor");
	}

	void show() {
		System.out.println("Parent show method");
	}
}

class Child extends Parent {
	int x = 20;

	Child() {
		super();   // calls parent constructor
		System.out.println("Child constructor");
	}

	void show() {
		super.show();                // parent method
		System.out.println("Child show method");

		System.out.println("this.x  = " + this.x);   // child variable
		System.out.println("super.x = " + super.x);  // parent variable
	}
}

