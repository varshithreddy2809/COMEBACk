package com.array.gptquestion;

import java.util.Scanner;

public class searchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n = sc.nextInt();
		System.out.println("Enter the element you want to search :");
		int target = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " element in the array");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (target == array[i]) {
				System.out.println("Element found at index :" + i);
				break;
			}
		}
		sc.close();
	}

}
