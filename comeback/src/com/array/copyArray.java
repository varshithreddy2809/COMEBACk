package com.array;

import java.util.Scanner;

public class copyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mainArray = new int[5];
		int[] copyArray = new int[5];
		for (int i = 0; i < mainArray.length; i++) {
			System.out.println("enter the " + i + " element in the array");
			mainArray[i] = sc.nextInt();
		}
		for (int i = 0; i < mainArray.length; i++) {
			copyArray[i] = mainArray[i];
		}
		for (int i = 0; i < mainArray.length; i++) {
			System.out.print(mainArray[i] + "   ");
		}
		System.out.println();
		for (int i = 0; i < mainArray.length; i++) {
			System.out.print(copyArray[i] + "   ");
		}
		sc.close();
	}

}
