package com.loops;

import java.util.Scanner;

public class nthPrime {
	int count = 0;
	static boolean isPrime(int n) {
		boolean status = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
				
			}
			
		}
		return status;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto where you want to print :");
		int n = sc.nextInt();
		System.out.println("enter which you want to print :");
		int m = sc.nextInt();
		int count=0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);

			}
			while(count == m) {
				System.out.println(m);
			}
		}
		sc.close();
	}

}
