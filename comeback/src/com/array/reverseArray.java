package com.array;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int s = n - 1;
		int temp=0;
		int[] array = new int[n];
		if (n != 0) {
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the " + (i + 1) + " element");
				array[i] = sc.nextInt();
			}
			System.out.println("Before reversing the array is :");
			for(int a:array) {
				System.out.print(a+"  ");
			}
			for (int i = 0; i < (double)array.length/2; i++) {
				 temp=array[i];
				 array[i]=array[s];
				 array[s]=temp;
				s--;
			}
			System.out.println();
			System.out.println("After reversing the array is :");

			for(int b:array) {
				System.out.print(+b+"  ");
			}
		} else {
			System.out.println("Entered size is invalid");
		}
		
		sc.close();

	}
}
