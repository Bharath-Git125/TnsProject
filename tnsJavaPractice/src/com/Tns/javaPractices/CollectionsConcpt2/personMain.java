package com.Tns.javaPractices.CollectionsConcpt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class personMain {

	public static void main(String[] args) {
		List <person>ob = new ArrayList<person>();
		person p = new person("bharath", "hyd");
		ob.add(p);
		person p1 = new person("suresh", "delhi");
		ob.add(p1);
		person p2 = new person("ramesh", "banglore");
		ob.add(p2);
		System.out.println(ob);
		System.out.println("sorting names");
		Collections.sort(ob,new sortNyName());
		System.out.println(ob);
		System.out.println("sorting city");
		Collections.sort(ob,new sortNyCity());
		System.out.println(ob);

	}

}
