package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionSix {

	public static void main(String[] args) {

		Collection<String> course = new ArrayList<>();

		System.out.println(course.isEmpty());

		if (course.isEmpty()) {
			course.add("Java");
			course.add("Spring");

		}
		System.out.println(course.isEmpty());

		if (!course.isEmpty()) {
			course.clear();
		}

		System.out.println(course.isEmpty());

	}

}
