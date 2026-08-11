package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapThree {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<>();
		m1.put(91, "India");
		m1.put(1, "USA");
		m1.put(44, "United kingdom");
		m1.put(61, "Australia");
		m1.put(49, "Germany");
		m1.put(89, "Japan");
		m1.put(2, "Varshith");
		System.out.println(m1);

		m1.replace(91, "Bharath");
		System.out.println(m1.replace(91, "Bharath"));
		
		m1.replace(2,"Varshith",  "Reddy");
		System.out.println(m1.replace(2,"Varshith",  "Reddy"));
		
		m1.replaceAll((key, value) -> value.toUpperCase());
		
		System.out.println(m1.size());
		System.out.println(m1);

	}

}
