package com.Tns.javaPractices.CollectionConcpt.allCollectionConcpts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("bharath");
		al.add("gopinadh");
		al.add("shivaganesh");

		System.out.println(al);
		//in sorting order
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			//Collections.sort(al);
			//System.out.println(al);
		}
	}
}


