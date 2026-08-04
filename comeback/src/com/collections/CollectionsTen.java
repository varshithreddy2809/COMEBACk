package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsTen {

	public static void main(String[] args) {
		
		Collection <String> c1 = new ArrayList<>();
		c1.add("Java");
		c1.add("MYSQL");
		c1.add("JDBC");
		c1.add("HTML");
		c1.add("CSS");
		
		System.out.println(c1);
		System.out.println(c1.size());
		
		c1.remove("MYSQL");
		
		System.out.println(c1);
		System.out.println(c1.size());

	}

}
