package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTwo {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(50);
		l1.add(10);
		l1.add(40);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		l1.add(40);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		l1.add(40);
		l1.add(20);
		l1.add(30);

		System.out.println(Collections.max(l1));
		System.out.println(Collections.min(l1));
		System.out.println(Collections.frequency(l1, 10));
		
	}
}
