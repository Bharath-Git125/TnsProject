package com.Tns.javaPractices;

public class demo6Static {
	public static void main(String[] args) {
	System.out.println(staticexplain.a);	
	staticexplain.show();
	}
class staticexplain{	
		static int a = 10;//variable
		static void show() {//method
			System.out.println("hello world");
		}
		static {//block
			System.out.println("yoooo!");
		}
	}
}
