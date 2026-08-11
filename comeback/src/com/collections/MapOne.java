package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapOne {

	public static void main(String[] args) {
		
		Map <Integer,String> m1 = new HashMap<>();
		m1.put(91, "India");
		m1.put(1, "USA");
		m1.put(44, "United kingdom");
		m1.put(61, "Australia");
		m1.put(49, "Germany");
		m1.put(89, "Japan");
		System.out.println(m1);
		
		m1.putIfAbsent(66, "Varshith");
		m1.putIfAbsent(66, "Varshith");
		m1.putIfAbsent(67, "Reddy");
		System.out.println(m1);
		
		System.out.println(m1.get(66));
		System.out.println(m1.get(67));
		
		System.out.println(m1.getOrDefault(0,"Varshith"));
		m1.getOrDefault(66,"");

	}

}
