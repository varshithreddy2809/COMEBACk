package com.collections;

import java.util.LinkedList;

public class LinkedListTwo {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Java");
		l1.add("HTML");
		l1.add("CSS");
		l1.add("Spring");
		l1.add("Bootstrap");
		System.out.println(l1);

		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.get(2));

	}

}
