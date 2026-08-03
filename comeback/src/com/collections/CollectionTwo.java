package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTwo {

	public static void main(String[] args) {

		Collection<Integer> numb = new ArrayList<>();

		numb.add(10);
		numb.add(20);
		numb.add(30);
		numb.add(40);
		numb.add(50);
		numb.add(60);

		Collection<Integer> numbe = new ArrayList<>();
	
		numbe.addAll(numb);
		numbe.add(70);
		numbe.add(80);

		
		System.out.println(numb);
		System.out.println(numbe);
		
	}
}