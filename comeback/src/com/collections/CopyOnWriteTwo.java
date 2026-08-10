package com.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteTwo {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> l1 = new CopyOnWriteArrayList<>();
		l1.add("Java");
		l1.add("HTML");
		l1.add("Css");
		l1.add("JDBC");
		l1.add("SQL");
		l1.add("Bootsrap");
		l1.add("MVC");
		System.out.println(l1);

		l1.removeIf(x -> x.startsWith("J"));
		System.out.println(l1);

		System.out.println("This is return value :" + l1.set(1, "Hibernet"));
		System.out.println(l1);

		System.out.println(l1.get(2));

		Iterator<String> itr = l1.iterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
			if (ele.equals("SQL")) {
				l1.add("VARSHITH");
			}

		}
		System.out.println(l1);

	}

}
