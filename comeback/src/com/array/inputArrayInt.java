package com.array;

import java.util.Scanner;

public class inputArrayInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[10];
		for(int i = 0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int i =0;i<numbers.length;i++) {
		System.out.println("the "+ i +"number in array is :"+ numbers[i]);
		}
		sc.close();
	}

}
