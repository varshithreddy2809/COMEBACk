package com.array.gptquestion;

import java.util.Scanner;

public class sortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the "+(i+1)+"  element in the array");
			array[i]=sc.nextInt();
		}
		if(isSorted(array)) {
			System.out.println("The Array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}
		sc.close();
	}
	static boolean  isSorted(int [] array) {
		boolean status = true;
		for(int i = 0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				status= false;
			}
		}
		return status;
	}

}
