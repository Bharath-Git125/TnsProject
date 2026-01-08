package com.tnsAssigments.java;

public class nestedTryCatch {

	public static void main(String[] args) {
		try { // OUTER TRY
			System.out.println("Outer try started");

			try { // INNER TRY
				int a = 10 / 0;   // ArithmeticException
				System.out.println(a);
			} catch (ArithmeticException e) {
				System.out.println("Inner catch: Cannot divide by zero");
			}

			int arr[] = {1, 2, 3};
			System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch: Array index error");
		}

		System.out.println("Program continues normally");
	}

}


