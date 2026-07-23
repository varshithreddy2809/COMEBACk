package com.array;

import java.util.Scanner;

public class largestInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array :");
		int n=sc.nextInt();
		int[]array=new int[n];
		
		for(int i = 0;i<array.length;i++) {
			System.out.println("Enter the " +(i+1)+" in the array");
			array[i]=sc.nextInt();
		}
		int max=array[0];
		for(int i = 0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("the largest element in the array is :"+max);
		sc.close();
	}

}
