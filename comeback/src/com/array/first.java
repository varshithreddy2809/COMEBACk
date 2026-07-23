package com.array;

public class first {

	public static void main(String[] args) {
		int[] array = { 12, 56, 34, 24, 34, 56, 24, 3, 14, 56};
		int max =array[ 0];
		int min = array[0];
		int maxCount = 0;
		int minCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

			if (min > array[i]) {
				min = array[i];
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == max) {
				maxCount++;
			}
			if (array[i] == min) {
				minCount++;
			}

		}

		System.out.println(max);
		System.out.println(min);
		System.out.println(maxCount);
		System.out.println(minCount);
	}
}
