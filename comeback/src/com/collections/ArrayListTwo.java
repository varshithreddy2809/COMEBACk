package com.collections;

import java.util.ArrayList;

public class ArrayListTwo {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Spring");
		l1.add("Java");
		l1.add("JDBC");
		l1.add("CSS");

		System.out.println(l1);

		ArrayList<String> l2 = (ArrayList<String>) l1.clone();
		l2.add("Varshith");

		System.out.println(l2);

	}

}
