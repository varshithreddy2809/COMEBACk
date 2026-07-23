package com.array;

import java.util.Scanner;

public class avgOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySum=0;
		System.out.println("enter the size of the array :");
		int n=sc.nextInt();
		int[] array = new int [n];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the "+(i+1)+" element");
			array[i]=sc.nextInt();
		}
		for(int i = 0;i<array.length;i++) {
			arraySum =array[i]+arraySum;
		}
		double average=((double)arraySum/array.length);
		System.out.println(average);
		sc.close();
	}

}
