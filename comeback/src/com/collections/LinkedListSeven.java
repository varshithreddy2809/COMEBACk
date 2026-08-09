package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSeven {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Java");
		l1.add("HTML");
		l1.add("CSS");
		l1.add("Spring");
		l1.add("Bootstrap");
		System.out.println(l1);

		System.out.println(l1.pop());
		l1.push("Varshith");
		Iterator <String> itr = l1.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(l1);

	}

}
