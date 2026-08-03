package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFour {

	public static void main(String[] args) {

		Collection <Integer> set1 = new ArrayList<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		Collection <Integer> set2 = new ArrayList<>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(50);
		set2.add(60);
		set2.add(70);
		set2.add(80);
		

		System.out.println(set2.containsAll(set1));
		

	}

}
