package com.revision;

import java.util.Scanner;

public class IsLeapYear {

	public static boolean isLeapYearorNoT(int a) {
		boolean status = false;
		
		if(a % 400 == 0 || (a% 4== 0 && a %100 !=0)) {
			 status = true;
		}

		

		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Year :");
		int n = sc.nextInt();

		boolean result = isLeapYearorNoT(n);
		if(result) {
			System.out.println("Entered Year is Leap Year");
		}else {
			System.out.println("Entered Year is not a Leap Year");
		}
		sc.close();
	}

}
