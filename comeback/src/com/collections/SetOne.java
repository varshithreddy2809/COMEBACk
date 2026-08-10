package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetOne {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<>();
		s1.add("Varshith");
		s1.add("Kumar");
		s1.add("Reddy");

		System.out.println(s1);

		System.out.println(s1.remove("Kumar"));
		System.out.println(s1.contains("Gowlla"));

		System.out.println(s1);

		System.out.println(s1.isEmpty());
	}

}
