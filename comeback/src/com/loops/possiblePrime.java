package com.loops;

import java.util.Scanner;

public class possiblePrime {
	static boolean isPrime(int n) {
		boolean Status = true;
		for (int i = 2; i <= n; i++) {
			if (i % n == 0) {
				Status = false;
				break;
			}
		}
		return Status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(n);
			}
		}
		sc.close();
	}
}
