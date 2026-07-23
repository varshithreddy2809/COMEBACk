package com.array;

public class targetSum {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 7, 11, 15 };
		int target = 15;
		for(int i = 0;i<array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i] + array[j]==target) {
					System.out.print(" Pair found = " + "( "+array[i] + " , ");
					System.out.print(array[j] + " )");
				}
			}
		}
	}
}