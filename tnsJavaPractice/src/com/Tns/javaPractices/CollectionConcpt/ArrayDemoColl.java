package com.Tns.javaPractices.CollectionConcpt;

import java.util.ArrayList;

public class ArrayDemoColl {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("bharath");
		al.add(2);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
	}

}
