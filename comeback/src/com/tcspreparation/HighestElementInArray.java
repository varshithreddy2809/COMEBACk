package com.tcspreparation;

public class HighestElementInArray {

	public static void main(String[] args) {

		int[] array = { 12, 45, 7, 89, 23 };
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);

	}
}