package com.array;

import java.util.Scanner;

public class zeroLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int temp = 0;
		int last = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i <=last; i++) {
			if (array[i] == 0) {

				temp = array[i];
				array[i] = array[last];
				array[last] = temp;
				last--;
				i--;
			}

		}
		for (int y : array) {
			System.out.print(y + "  ");
		}
		sc.close();
	}

}
