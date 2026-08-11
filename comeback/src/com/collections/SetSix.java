package com.collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetSix {

	public static void main(String[] args) {
		
		NavigableSet <String> n1 = new TreeSet<>();
		n1.add("Java");
		n1.add("HTML");
		n1.add("CSS");
		n1.add("Bootstrap");
		n1.add("SQL");
		n1.add("SPRING");
		System.out.println(n1);
		
		Iterator <String> itr = n1.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(n1.headSet("HTML", true));
		System.out.println(n1.tailSet("CSS",true));
		System.out.println(n1.reversed());

	}

}
