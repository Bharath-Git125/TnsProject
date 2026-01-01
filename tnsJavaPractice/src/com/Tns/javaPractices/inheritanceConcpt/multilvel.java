package com.Tns.javaPractices.inheritanceConcpt;

public class multilvel {
	 void grandfather() {
		 System.out.println("iam grandfather");
	 }
}
class Father extends multilvel{
	void father() {
		System.out.println("iam father of my GrandFather");
	}
}
class Son extends Father{
	void son() {
		System.out.println("iam son of my Father");
	}
}
