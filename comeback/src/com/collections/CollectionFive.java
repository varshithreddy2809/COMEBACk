package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFive {

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
	
		System.out.println(set2.equals(set1));
		set2.add(50);
		
		System.out.println(set2.equals(set1));
		
		Collection <Integer> set3 = new ArrayList<>();
		set3.add(10);
		set3.add(20);
		set3.add(30);
		set3.add(40);
		
		Collection <Integer> set4 = new ArrayList<>();
		set4.add(40);
		set4.add(20);
		set4.add(30);
		set4.add(10);

		System.out.println(set3.equals(set4));
		System.out.println(set3.hashCode());
		System.out.println(set4.hashCode());


	}

}
