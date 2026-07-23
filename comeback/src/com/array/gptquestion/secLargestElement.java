package com.array.gptquestion;

import java.util.Scanner;

public class secLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element " + (i + 1) + " in the array");
			array[i] = sc.nextInt();
		}
		int maxElement = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > maxElement) {
				maxElement = array[i];
			}

		}
		int secondLargest = array[0];

		for (int i = 0; i < array.length; i++) {
				if (array[i] < maxElement && array[i]>secondLargest) {
					secondLargest = array[i];
				}
			}
		
		System.out.println("The second Largest element in the array is :" + secondLargest);
 
		sc.close();
	}

}
