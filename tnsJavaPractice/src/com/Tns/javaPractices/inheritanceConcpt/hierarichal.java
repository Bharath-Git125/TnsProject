package com.Tns.javaPractices.inheritanceConcpt;

public class hierarichal {
	void VolksWagen() {
		System.out.println("i have 3 companies in my under!");
	}
}
class Audi extends hierarichal{
	void audi() {
		System.out.println("iam under VolksWagen");
	}
}
class Bently extends hierarichal{
	void bently() {
		System.out.println("iam under VolksWagen");
	}
}

class Lamborgini extends hierarichal{
	void lamborgini() {
		System.out.println("iam under VolksWagen");
	}
}