package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetFive {

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
		
		SortedSet <Integer> s2 = s1.headSet(50);
		s2.add(4);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.tailSet(60));
		SortedSet <Integer> s3 = s1.tailSet(40);
		s3.add(80);
		System.out.println(s3);
		System.out.println(s1);

	}

}
