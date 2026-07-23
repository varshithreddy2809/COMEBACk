package com.array;

import java.util.Scanner;

public class selesctionSort {

	public static void main(String[] args) {
		int[] array = new int[6];
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					minIndex=j;
				}
			}
			temp=array[i];
			array[i]=array[minIndex];
			array[minIndex]=temp;
		}
		for (int a : array) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
