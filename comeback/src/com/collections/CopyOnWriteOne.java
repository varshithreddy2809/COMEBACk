package com.collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteOne {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> l1 = new CopyOnWriteArrayList<>();
		l1.add("Java");
		l1.add("HTML");
		l1.add("Css");
		l1.add("JDBC");
		
		System.out.println(l1);
		l1.addIfAbsent("JAVA");
		l1.addIfAbsent("Css");
		
		System.out.println(l1);
		CopyOnWriteArrayList<String> l2 = new CopyOnWriteArrayList<>();
		l2.add("Bootstrap");
		l2.add("Spring");
		l2.add("JDBC");
		l2.add("Css");
		System.out.println(l2);
		System.out.println(l1.remove("JAVA"));
		System.out.println(l1);
		
		l1.addAllAbsent(l2);
		System.out.println(l1);
		
		
				

	}

}
