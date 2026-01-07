package com.Tns.javaPractices.ConditionConcpt;

public class classCondtn {
	public static void main(String[] args) {
		System.out.println("-------For loop condition-------");
		int a = 5;
		for(int i=1;i<=a;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("-------While loop condition-------");
		int b = 10;
		while(b<20) {
			System.out.println(b);
			b++;
		}
		System.out.println("------- Do While loop condition-------");
		int c = 10;
		do {
			System.out.println(c);
			c++;
		} while (c<20);

	}
}
