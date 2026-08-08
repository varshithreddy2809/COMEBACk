package com.collections;

import java.util.Vector;

public class VectorThree {

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		v1.add(70);
		System.out.println(v1);

		System.out.println(v1.size());
		System.out.println(v1.capacity());

		v1.add(80);
		v1.add(90);
		v1.add(100);
		v1.add(110);

		System.out.println(v1.size());
		System.out.println(v1.capacity());

	}

}
