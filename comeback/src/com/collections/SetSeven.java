package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetSeven {

	public static void main(String[] args) {
		
		NavigableSet <Integer> n1 = new TreeSet<>();
		n1.add(10);
		n1.add(20);
		n1.add(30);
		n1.add(40);
		n1.add(50);
		n1.add(60);
		n1.add(70);
		
		System.out.println(n1.subSet(30, false, 70, false));
		System.out.println(n1.subSet(30, true, 70, false));
		System.out.println(n1.subSet(30, false, 70, true));
		System.out.println(n1.subSet(30, true, 70, true));

	}

}
