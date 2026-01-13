package com.Tns.javaPractices.CollectionConcpt.allCollectionConcpts;

import java.util.*;

public class setDemo {

	public static void main(String[] args) {
		  Set<String> set = new LinkedHashSet<>();

	        set.add("A");
	        set.add("B");
	        set.add("A");

	        System.out.println(set);
	}

}
