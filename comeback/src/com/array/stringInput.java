package com.array;

import java.util.Scanner;

public class stringInput {

	public static void main(String[] args) {
		String[] names = new String[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {
			System.out.println("enter the " + i + " name");
			names[i] = sc.next();
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println("the " + i + " name is :" + names[i]);
		}
		String big = names[0];
		String small = names[0];
		for (int i = 0; i < names.length; i++) {
			if (big.length() < names[i].length()) {
				big = names[i];
			}
			if (small.length() > names[i].length()) {
				small = names[i];
			}
		}
		System.out.println("the smallest in String is : " + small);
		System.out.println("the biggest in String is : " + big);
		sc.close();
	}

}
