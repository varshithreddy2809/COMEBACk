package com.loops;

import java.util.*;

public class isPrime {
	static boolean isPri(int n) {
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
		System.out.println("enter upto to where you want to print :");
		int n = sc.nextInt();
		for (int i = 2; i <=n; i++) {
			if (isPri(i)) {
				System.out.print(i + "  ");
			}
		}
		sc.close();
	}

}
