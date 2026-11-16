package com.tcspreparation;

import java.util.Scanner;

public class IsPalindrone2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();

		String reverse = "";
		
		for(int i =0;i<s1.length();i++) {
			reverse=s1.charAt(i)+reverse;
		}
		
		if(s1.equalsIgnoreCase(reverse)) {
			System.out.println("Yes t is palindrome");
		}else {
			System.out.println("No it is not Palindrome");
		}
	}

}
