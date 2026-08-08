package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTwo {

	public static void main(String[] args) {
		
		Vector <Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		v1.add(70);
		System.out.println(v1);
		
		Enumeration <Integer> e1 = v1.elements();
		while(e1.hasMoreElements()){
			System.out.println(e1.nextElement());
		}

	}

}
