package com.array;

import java.util.Scanner;

public class noOfTwo {

	public static void main(String[] args) {
		int[] array = new int[8];
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int rem = 1;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("eneter the " + i + " element in the array");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			rem = rem % 10;
			num = array[i] / 10;
			if (rem == 2) {
				count++;
			}

		}
		System.out.println(count);
		sc.close();
	}

}
