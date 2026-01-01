package com.Tns.javaPractices;

import java.util.Scanner;

public class demo7Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("yure name:");
		String name = sc.next();
		System.out.println("yure age:");
		int age = sc.nextInt();
		System.out.println("yure name is :"+name);
		System.out.println("yure age is :"+age);
		sc.close();
	}

}
