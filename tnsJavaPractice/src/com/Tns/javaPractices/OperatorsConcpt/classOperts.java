package com.Tns.javaPractices.OperatorsConcpt;

public class classOperts {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//Arthimetic Operation
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("----------------------");
		//relation Operation
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		//logical Operation
		int c= 40;
		int d = 50;
		if(c<d&&c==d)
			System.out.println(true);
		else
			System.out.println(false);
		System.out.println(" And Condition  ");
		if(c>d||d>=c)
			System.out.println("False");
		else
			System.out.println("True");
		System.out.println("OR Condition");
		//unary Operators
		System.out.println(a);
		System.out.println(a++);//or a--
		System.out.println(a);
		System.out.println(++b);//or--b
		System.out.println(b);
	}


}
