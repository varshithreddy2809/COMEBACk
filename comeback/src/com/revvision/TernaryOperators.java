package com.revvision;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		String result = a>=35 ? "Pass":"Fail";
		System.out.println(result);
		System.out.println("Enter a number");
		int A= sc.nextInt();
		System.out.println("Enter a number");
		int B = sc.nextInt();
		int Result = A>B?A:B;
		System.out.println(Result +" is bigger");
		
		sc.close();
	}

}
