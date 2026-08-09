package com.collections;

import java.util.LinkedList;

public class LinkedListThree {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Java");
		l1.add("HTML");
		l1.add("CSS");
		l1.add("Spring");
		l1.add("Bootstrap");
		System.out.println(l1);

		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		System.out.println(l1.remove(2));
		
		System.out.println(l1);
		

	}

}
