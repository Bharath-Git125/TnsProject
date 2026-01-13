package com.Tns.javaPractices.CollectionConcpt;

import java.util.ArrayList;
import java.util.Collection;

public class DemoStd {

	public static void main(String[] args) {
		ArrayList<Student> ob = new ArrayList<Student>();
		Student st = new Student(101, "bharath", 100.0);
		ob.add(st);
		Student st1 = new Student(102, "sravan", 99.0);
		ob.add(st1);
		//System.out.print(ob);
		System.out.println("before sorting");
		System.out.println(ob);
		System.out.println("after sorting");
		System.out.println(ob);
		
		
		
		
	}

}
