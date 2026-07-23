package com.loops;

import java.util.Scanner;

public class strongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		
		while (n > 0) {
		int r = n % 10;
			n = n / 10;
			int su = 1;
			for (int i = 1; i <=r; i++) {
				
				su = su * i;

			}
			sum=su+sum;
		}
		

		System.out.println(sum);
		if (sum == temp) {
			System.out.println("the number is " + temp + " a strong number");
		} else {
			System.out.println("the number is " + temp + " not a strong number");
		}
		sc.close();
	}

}
