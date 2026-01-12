package com.Tns.javaPractices.CollectionConcpt;

import java.util.LinkedList;

public class LinkedListDemoColl {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(101);
		ll.add(102);
		ll.add(103);
		ll.addFirst(105);
		ll.addFirst("bharathTNS");
		ll.addLast("last");
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
	}

}
