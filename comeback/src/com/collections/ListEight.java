package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEight {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("Spring");
		l1.add("MySQL");
		l1.add("HTML");
		l1.add("Spring");
		l1.add("CSS");
		l1.add("Bootstrap");
		l1.add("JDBC");

		System.out.println(l1);

		List<String> l2 = l1.subList(2, 6);

		System.out.println(l2);
		l2.add("Varshith");
		l2.add("Reddy");

		System.out.println(l2);
		System.out.println(l1);

	}

}
