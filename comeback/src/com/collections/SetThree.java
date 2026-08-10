package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetThree {

	public static void main(String[] args) {

		TreeSet <Integer> s1 = new TreeSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		
		Iterator <Integer> it = s1.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
