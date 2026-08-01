package com.array;

public class targetNotFound {

	public static void pair(int pfirst, int psecond, int ptarget) {
		if (pfirst + psecond == ptarget) {
			System.out.print(" Pair found = " + "( " + pfirst + " , ");
			System.out.print(psecond + " )");

		} else {
			System.out.println("Pair Not Found !!");
		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		int target = 9;
		int first = array[0];
		int second = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					first = array[i];
					second = array[j];

				}
			}

		}
		pair(first, second, target);
	}

}
