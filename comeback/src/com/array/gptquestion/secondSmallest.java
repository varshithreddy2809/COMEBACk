package com.array.gptquestion;

import java.util.Scanner;

public class secondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the " + (i + 1) + " element in the array :");
			array[i] = sc.nextInt();
		}
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest)
			smallest = array[i];
		}
		int secondSmallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > smallest && array[i] < secondSmallest) {
				secondSmallest = array[i];
			}

		}
		System.out.println("The  smalest element in the array is :" + smallest);

		System.out.println("The second smalest element in the array is :" + secondSmallest);
		sc.close();
	}

}
