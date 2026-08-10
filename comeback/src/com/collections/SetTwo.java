package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTwo {

	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<>();
		s1.add("Varshith");
		s1.add("Kumar");
		s1.add("Reddy");
		s1.add("Gowlla");
		
		System.out.println(s1.size());
		Iterator <String> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		s1.clear();
		System.out.println(s1);
		
		

	}

}
