package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsThree {

	public static void main(String[] args) {

		Collection <Integer> set1 = new ArrayList<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);

		System.out.println(set1.contains(100));
		System.out.println(set1.contains(30));

	}

}
