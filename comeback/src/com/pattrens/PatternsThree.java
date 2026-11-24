package com.pattrens;

import java.util.Scanner;

public class PatternsThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		
		for(int i =1; i<=a;i++) {
			for(int j =a-i+1 ;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
