package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListFive {

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

		System.out.println(l1.lastIndexOf("Java"));
		System.out.println(l1.lastIndexOf("Spring"));
		System.out.println(l1.lastIndexOf("CSS"));
		System.out.println(l1.lastIndexOf("Varshith"));


	}

}
