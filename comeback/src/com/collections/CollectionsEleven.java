package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsEleven {

	public static void main(String[] args) {

		Collection<String> c1 = new ArrayList<>();
		c1.add("Java");
		c1.add("JDBC");
		c1.add("SPRING");
		c1.add("MYSQL");
		c1.add("HTML");

		Object[] arr = c1.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
