package com.collections;

import java.util.Vector;

public class VectorFive {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>();
		v1.add("Java");
		v1.add("Spring");
		v1.add("MySQL");
		v1.add("HTML");
		v1.add("CSS");

		System.out.println(v1);

		v1.setElementAt("Hibernet", 1);
		v1.setElementAt("Bootstrap", 3);

		System.out.println(v1);

	}

}
