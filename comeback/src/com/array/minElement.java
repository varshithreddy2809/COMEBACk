package com.array;

import java.util.Scanner;

public class minElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array :");
		int n=sc.nextInt();
		int[]array=new int[n];
		
		for(int i = 0;i<array.length;i++) {
			System.out.println("Enter the " +(i+1)+" in the array");
			array[i]=sc.nextInt();
		}
		int min=array[0];
		for(int i = 0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("the smallest element in the array is :"+min);
		sc.close();
	}
}
