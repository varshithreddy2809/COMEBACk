package com.tcspreparation;
import java.util.Scanner;
public class FibannociSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int fib ;
		
		for(int i = 1; i<=n;i++) {
			
			System.out.println(a + " ");
			fib = a+b;
			a = b;
			b = fib;
		}
		sc.close();
	}
}
