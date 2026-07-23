package com.array.gptquestion;

import java.util.Scanner;

public class countMinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oddCount = 0;
		int evenCount = 0;
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " element in the array");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("The odd elements in the array are : " + oddCount);
		System.out.println("The even elements in the array are : " + evenCount);
		sc.close();
	}

}
