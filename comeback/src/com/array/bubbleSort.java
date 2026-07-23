package com.array;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[6];
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("eneter the " + i + " element in the array");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		for (int i = 0; i < array.length; i++) {
			boolean status=false;
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					status=true;
				}
			}
			if(!status) {
				break;
			}
		}
		System.out.println("the bubble sorted array is ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		sc.close();
	}

}
