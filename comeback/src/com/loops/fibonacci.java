package com.loops;

import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int fib = 0;
		for (int i = 1; i < n; i++) {
			fib = a + b;
			a = b;
			b = fib;
		}
			System.out.println(fib);
		sc.close();
	}
}
