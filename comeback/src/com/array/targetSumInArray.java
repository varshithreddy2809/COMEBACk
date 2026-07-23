package com.array;

import java.util.Scanner;

public class targetSumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target value :");
		int n=sc.nextInt();
		int[] array=new int[10];
		for(int i = 0;i<array.length;i++) {
			System.out.println("enter the  "+ (i+1)+" in the array");
			array[i]=sc.nextInt();
			}
		for(int i = 0;i<array.length;i++) {
			for(int j =i+1;j<array.length;j++) {
				if(array[i]+array[j]==n) {
					System.out.print(array[i]+" ");
					System.out.print(array[j]+"   ");
				}
			}
		}
		sc.close();
	}

}
