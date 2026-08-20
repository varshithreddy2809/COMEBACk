package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Varshith");
		Student s2 = new Student(102,"Reddy");
		Student s3 = new Student(101,"Varshith");
		
		Map<Student,String> m1 = new HashMap<>();
		m1.put(s1, "Student Deatails");
		m1.put(s2, "Student Deatails");
		m1.put(s3, "Student Deatails");
		
		System.out.println(m1.get(s1));
		System.out.println(m1.get(s2));
		System.out.println(m1.get(s3));
		
		System.out.println(s1.equals(s3));
	}

}
