package com.revision;

import java.util.Scanner;



public class IfNumPN {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("Entered number is positive");
		}else if(n<0) {
			System.out.println("Entered number is Negative");
		}else {
					System.out.println("Entered number is 0");
		}
		sc.close();
	}

}
