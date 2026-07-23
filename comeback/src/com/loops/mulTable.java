package com.loops;

import java.util.Scanner;

import java.util.Scanner;
public class mulTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the table you want to print :");
		int m =sc.nextInt();
		System.out.println("enter you to where you want to print :");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(m + "x" + i + "=" +(m*i));
		}
		sc.close();
	}

}
