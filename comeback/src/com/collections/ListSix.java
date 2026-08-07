package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListSix {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("Spring");
		l1.add("MySQL");
		l1.add("Spring");
		l1.add("MySQL");
		l1.add("Java");
		l1.add("HTML");
		l1.add("Spring");
		l1.add("CSS");

		System.out.println(l1);

		String a = l1.remove(2);
		System.out.println(a);
		String b = l1.remove(2);
		System.out.println(b);

		System.out.println(l1);

	}

}
