package com.Tns.javaPractices.CollectionConcpt.allCollectionConcpts;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		//  LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		//  TreeMap<Integer, String> tm = new TreeMap<>();
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "java");
		mp.put(2, "jdbc");
		mp.put(3, "spring");
		
		System.out.println(mp);
		System.out.println(mp.get(2));
	}

}
