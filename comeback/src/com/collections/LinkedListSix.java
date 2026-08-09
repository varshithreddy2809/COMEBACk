package com.collections;

import java.util.LinkedList;

public class LinkedListSix {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Java");
		l1.add("HTML");
		l1.add("CSS");
		l1.add("Spring");
		l1.add("Bootstrap");
		System.out.println(l1);

		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());

		System.out.println(l1);

	}

}
