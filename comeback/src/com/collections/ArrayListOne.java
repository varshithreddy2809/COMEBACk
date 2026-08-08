package com.collections;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {

		ArrayList <Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		
		ArrayList <Integer> l2 = new ArrayList<>(20);
		l2.add(100);
		l2.add(200);
		l2.add(300);
		System.out.println(l2);
		
		ArrayList <Integer> l3 = new ArrayList<>(l1);
		l3.add(50);
		System.out.println(l3);
		
	}

}
