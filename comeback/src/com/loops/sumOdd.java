package com.loops;
import java.util.Scanner;
public class sumOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number upto where you want to print : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
			
		}
		System.out.println(sum);
	}

}
