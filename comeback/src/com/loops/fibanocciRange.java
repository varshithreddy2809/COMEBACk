package com.loops;

import java.util.*;

public class fibanocciRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int a=2;
		int b= 3;
		System.out.println(a + " " + b);
		for(int i = 0;i<=5;i++) {
			int c = a+b;
			a=b;
			b =c;
			System.out.print(c + " ");
			
		}
		sc.close();
	}

}
