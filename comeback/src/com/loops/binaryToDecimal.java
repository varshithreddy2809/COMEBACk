package com.loops;
import java.util.Scanner;
public class binaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a binary number :");
		int num = sc.nextInt(); 
		int dec = 0;
		int power = 0;
		while(num> 0) {
			int rem =num%10;
			dec=dec+(rem*(int)Math.pow(2,power));
			power++;
			num=num/10;
		}
		System.out.println(dec);
		sc.close();
		
	}

}
