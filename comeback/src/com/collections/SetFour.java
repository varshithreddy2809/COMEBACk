package com.collections;


import java.util.SortedSet;
import java.util.TreeSet;

public class SetFour {

	public static void main(String[] args) {
		
		SortedSet <Integer> s1 = new TreeSet<>(); 
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		
		System.out.println(s1);
		System.out.println(s1.first());
		System.out.println(s1.last());
	    System.out.println(s1.comparator());
		

	}

}
