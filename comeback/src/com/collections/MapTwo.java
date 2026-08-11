package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTwo {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<>();
		m1.put(91, "India");
		m1.put(1, "USA");
		m1.put(44, "United kingdom");
		m1.put(61, "Australia");
		m1.put(49, "Germany");
		m1.put(89, "Japan");
		System.out.println(m1);

		System.out.println(m1.remove(89));
		System.out.println(m1.remove(1, "USA"));
		System.out.println(m1.containsKey(34));
		System.out.println(m1.containsValue("Varshith"));

		System.out.println(m1);

	}

}
