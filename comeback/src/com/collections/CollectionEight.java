package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEight {

	public static void main(String[] args) {

		Collection<Integer> set1 = new ArrayList<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);

		System.out.println(set1);
		System.out.println(set1.remove(20));
		System.out.println(set1.remove(30));
		System.out.println(set1.remove(100));

		System.out.println(set1);

	}

}
