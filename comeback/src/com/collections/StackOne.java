package com.collections;

import java.util.Stack;

public class StackOne {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<>();
		s1.push("One");
		s1.push("Two");
		s1.push("Three");
		s1.push("Four");
		s1.push("Five");

		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.empty());

		System.out.println(s1);
	}

}
