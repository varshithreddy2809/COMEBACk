package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTwo {

	public static void main(String[] args) {

		List <Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);

		l1.get(2);
		System.out.println(l1.get(0));
		System.out.println(l1.get(2));
		System.out.println(l1.get(3));
		System.out.println(l1.get(l1.size() - 1));

	}

}
