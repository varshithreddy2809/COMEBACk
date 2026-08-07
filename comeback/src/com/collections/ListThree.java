package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListThree {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("Spring");
		l1.add("MySQL");
		l1.add("HTML");
		l1.add("CSS");

		System.out.println(l1);

		l1.set(2, "Bootstrap");
		l1.set(4, "Oracle");

		System.out.println(l1);

	}

}
