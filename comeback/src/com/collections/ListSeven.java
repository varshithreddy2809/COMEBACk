package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListSeven {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("Spring");
		l1.add("MySQL");
		l1.add("HTML");
		l1.add("Spring");
		l1.add("CSS");

		System.out.println(l1);

		ListIterator <String> itr = l1.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------------------------------");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
