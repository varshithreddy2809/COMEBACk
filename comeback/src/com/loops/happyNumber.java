package com.loops;

import java.util.Scanner;

public class happyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int rem = 0;
		int temp = n;
		while(temp!=1 && temp!=4) {
			int sum = 0;
			while(temp>0) {
				rem=temp%10;
				temp=temp/10;
				sum=sum+rem*rem;
				
			}
			temp=sum;
		}
		if(temp==1) {
			System.out.println("the entered number " + n + " is a happy number");
		}
		else {
			System.out.println("the entered number " + n + " is not a happy number");

		}
		
		sc.close();
	}

}
