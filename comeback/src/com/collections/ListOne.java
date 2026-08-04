package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOne {

	public static void main(String[] args) {

		List <String> l1 = new ArrayList<>();
		
		l1.add("Java");
		l1.add("Spring");
		l1.add("MySQL");
		l1.add("HTML");
		l1.add("CSS");
		
		System.out.println(l1);
		
		l1.add(2, "JDBC");
		l1.add(5, "Bootstarp");
		
		System.out.println(l1);

		
		
	}

}
