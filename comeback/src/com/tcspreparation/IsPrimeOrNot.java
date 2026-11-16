package com.tcspreparation;
import java.util.Scanner;

public class IsPrimeOrNot {

	public static boolean isPrime(int n)  {
		boolean status = true;
		if(n<=1) {
			return false;
		}else {
			for(int i =2;i<n;i++) {
				if(n%i == 0) {
					status = false;
					break;
				}
			}
		}
		return status;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Boolean isPrim = isPrime(n);
		if(isPrim) {
			System.out.println("Entered number is prime");
		}else {
			System.out.println("Entered number is not prime");
		}
		sc.close();
	}

}
