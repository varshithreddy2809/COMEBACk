package com.array;

public class secondMinMax {

	public static void main(String[] args) {
		int[] array = { 12, 3, 45, 6, 1, 89,3,3, 1, 7, 89, 1, 4, 89,45,6,4,45,4,45, 3, 8 };
		int min = array[0];
		int max = array[0];
		int minCount = 0;
		int maxCount = 0;
		int secMinCount = 0;
		int secMaxCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		int secMin = max;
		int secMax = min;
		for (int i = 0; i < array.length; i++) {
			if (min == array[i]) {
				minCount++;
			}
			if (max == array[i]) {
				maxCount++;
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (secMin > array[i] && array[i] != min) {
				secMin = array[i];
			}
			if (secMax < array[i] && array[i] != max) {
				secMax = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == secMin) {
				secMinCount++;
			}
			if (array[i] == secMax) {
				secMaxCount++;
			}
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(minCount);
		System.out.println(maxCount);
		System.out.println(secMin);
		System.out.println(secMax);
		System.out.println(secMinCount);
		System.out.println(secMaxCount);
	}
}
