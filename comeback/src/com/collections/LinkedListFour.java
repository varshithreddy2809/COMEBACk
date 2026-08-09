package com.collections;

import java.util.LinkedList;

public class LinkedListFour {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Java");
		l1.add("HTML");
		l1.add("CSS");
		l1.add("Spring");
		l1.add("Bootstrap");
		System.out.println(l1);

		l1.offer("Varshith");
		l1.offerFirst("Kumar");
		l1.offerLast("Reddy");

		System.out.println(l1);

	}

}
