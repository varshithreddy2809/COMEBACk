package com.loops;

import java.util.Scanner;

public class neonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int temp = n;
		n = n * n;
		int a = 0;
		while (n > 0) {

			int rem = n % 10;
			n = n / 10;
			a = a + rem;
		}
		if (a == temp) {
			System.out.println("the enterd number " + temp + " is a neon number");
		}
		else {
			System.out.println("the enterd number " + temp + " is a not neon number");
		}

		sc.close();
	}

}
