package com.pattrens;

import java.util.Scanner;

public class PatterrnDour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0;i<=n;i++) {
			for(int j = n-i+1;j<=n;j++ ) {
				if(j<n-i) {
					System.out.print("  ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		
	}

}
