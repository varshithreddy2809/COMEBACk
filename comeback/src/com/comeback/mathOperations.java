package com.comeback;

public class mathOperations {
	static void add() {
		int a = 100;
		int b = 50;
		System.out.println("this is sum :" + (a + b));
	}
	static void sub() {
		int a = 100;
		int b = 50;
		System.out.println("this is diff :" + (a - b));
	}
	static void mul() {
		int a = 100;
		int b = 50;
		System.out.println("this is product :" + (a * b));
	}
	static void div() {
		int a = 100;
		int b = 50;
		System.out.println("this is qoutient :" + (a / b));
	}
	static void mod() {
		int a = 100;
		int b = 33;
		System.out.println("this is sum :" + (a % b));
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		add();
		sub();
		mul();
		div();
		mod();
		System.out.println("Main method ended");
	}

}
