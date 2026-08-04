package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsNine {

	public static void main(String [] args) {
		
		Collection <Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);
		c1.add(60);
		Collection <Integer> c2 = new ArrayList<>();

		c2.add(20);
		c2.add(40);
		c2.add(60);
		c2.add(80);
		c2.add(30);
		
		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c1.retainAll(c2));
		c1.retainAll(c2);
		
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
	
}
