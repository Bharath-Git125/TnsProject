package com.Tns.javaPractices.inheritanceConcpt;

public class A {
	void show() {
		System.out.println("iam Parent");
	}
}
	class B extends A{
		void showB() {
			System.out.println("iam {B}son of A");
		}
	}
	class C extends B{
		void showC() {
			System.out.println("iam {C}son of B");
		}
	}
	class D extends A{
		void showD() {
			System.out.println("iam {D}son of A");
		}
	}
	class E extends A{
		void showE() {
			System.out.println("iam {E}son of A");
		}
	}

	

