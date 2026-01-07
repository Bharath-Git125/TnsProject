package com.Tns.javaPractices.ExceptionHandleConcpt;

import java.io.FileReader;

public class classThrowsConcpt {

	public static void main(String[] args) throws Exception {
		System.out.println("throws concept");
		FileReader fr = new FileReader("bharath.txt");
		fr.read();//throws exception becoz there is no file of name "Bharath.txt"
	}

}
