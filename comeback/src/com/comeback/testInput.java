package com.comeback;
import java.util.Scanner;

public class testInput {
	static void areaTriangle(Scanner sc) {
	
		System.out.println("Enter the value of height:");
		double height = sc.nextDouble();
		System.out.println("Enter the value of breadth:");
		double breadth = sc.nextDouble();
		double area = 0.5 * height * breadth;
		System.out.println("the area of triangle is :" + (area) );
		
	}
	static void areaSquare(Scanner sc) {
		
		System.out.println("Enter the value of side:");
		int side = sc.nextInt();
		int area = side * side;
		System.out.println("the area of square is :" + area );
		
	}
	static void areaRectangle(Scanner sc) {
	
		System.out.println("Enter the value of height:");
		int height = sc.nextInt();
		System.out.println("Enter the value of breadth:");
		int breadth = sc.nextInt();
		int area = height * breadth;
		System.out.println("the area of rectangle is :" + area );
		
	}
	static void areaCircle(Scanner sc) {
		
		System.out.println("Enter the value of radius:");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("the area of circle is :" + area );
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		areaTriangle(sc);
		areaSquare(sc);
		areaRectangle(sc);
		areaCircle(sc);
		System.out.println("main method ended");
		sc.close();
	}

}
