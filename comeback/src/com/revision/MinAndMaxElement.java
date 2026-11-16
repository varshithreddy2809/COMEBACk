package com.revision;

public class MinAndMaxElement {

	public static void main(String[] args) {

		int[] array = { 23, 5, 6, 3, 24, 345, 42, 323456, 32, 24 };

		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}

		}
		
		System.out.println("The max element in the array is  :" + max);
		System.out.println("The min element in the array is  :" + min);

	}

}
