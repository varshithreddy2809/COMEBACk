package com.collections;

import java.util.Vector;

public class VectorSeven {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>();
		v1.add("Java");
		v1.add("Spring");
		v1.add("MySQL");
		v1.add("HTML");
		v1.add("CSS");

		System.out.println(v1);

		v1.removeElementAt(2);
		
		System.out.println(v1);
		
		String[] arr = new String[v1.size()];
		v1.copyInto(arr);
		
		for(String a:arr) {
			System.out.println(a);
		}
		
		v1.removeAllElements();
		System.out.println(v1);
		v1.addElement("Varshith");
		
		
		for(String a:arr) {
			System.out.println(a);
		}

	}

}
