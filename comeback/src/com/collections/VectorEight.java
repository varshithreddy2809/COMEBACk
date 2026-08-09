package com.collections;

import java.util.Vector;

public class VectorEight {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.add("Java");
		v1.add("Spring");
		v1.add("MySQL");
		v1.add("HTML");
		v1.add("CSS");

		System.out.println(v1);
		
		System.out.println("Size = " + v1.size());
		System.out.println("Capacity = " + v1.capacity());
		v1.ensureCapacity(20);
		System.out.println("Size = " + v1.size());
		System.out.println("Capacity = " + v1.capacity());
		
		v1.trimToSize();
		System.out.println("Size = " + v1.size());
		System.out.println("Capacity = " + v1.capacity());
		v1.setSize(3);
		System.out.println("Size = " + v1.size());
		System.out.println("Capacity = " + v1.capacity());
		
		
	}

}
