package com.loops;
import java.util.Scanner;

public class evenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n =sc.nextInt();
		for(int i = 0;i<=n;i++) {
			if(i % 2==0) {
			int sumEven =i+n;
			System.out.println(sumEven);
			int sum = sumEven + i;
			System.out.println(sum);
		}
			
		sc.close();
	}
	}
}
