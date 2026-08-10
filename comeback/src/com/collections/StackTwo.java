package com.collections;

import java.util.Stack;

public class StackTwo {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();
		s1.push("One");
		s1.push("Two");
		s1.push("Three");
		s1.push("Four");
		s1.push("Five");
		
		System.out.println(s1.search("One"));
		System.out.println(s1.search("Three"));
		System.out.println(s1.search("Five"));
		
		Stack <String> s2 = (Stack<String>) s1.clone();
		s2.add("Six");
		System.out.println(s1);
		System.out.println(s2);

	}
}
