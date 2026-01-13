package com.Tns.javaPractices.CollectionConcpt.allCollectionConcpts;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(3, "C");
        tm.put(1, "Java");
        tm.put(2, "Python");

        System.out.println(tm);
	}

}
