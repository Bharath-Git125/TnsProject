package com.tnsAssigments.java;

public class reverseArray {

	public static void main(String[] args) {
		char [] word = {'m','e','e','t','u','p'};
		String rev="";
		for(int i=word.length-1;i>=0;i--) {
			rev=rev+word[i];
		}
		System.out.println(rev);
				
	}

}
