package com.collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapFive {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(91, "India");
		m1.put(1, "USA");
		m1.put(44, "United kingdom");
		m1.put(61, "Australia");
		m1.put(49, "Germany");
		m1.put(89, "Japan");
		System.out.println(m1);
		
		Set <Map.Entry<Integer,String>> e1 = m1.entrySet();
		for(Entry<Integer, String> e : e1) {
			System.out.println(e.getKey()+" --> "+ e.getValue());
		}

	}

}
