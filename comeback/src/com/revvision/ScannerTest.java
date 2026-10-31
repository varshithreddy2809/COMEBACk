package com.revvision;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your name ");
		String name = sc.nextLine();
		
		
		System.out.println("Enter your height :");
		float height = sc.nextFloat();
		
		System.out.println("Hii " + name + " Your age is "+ age + " and your "+ height + " tall");
		sc.close();
	}

}
