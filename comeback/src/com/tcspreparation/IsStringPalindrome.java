package com.tcspreparation;

import java.util.Scanner;

public class IsStringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String reversed = reverseString(s1);
		String isPalin = isPalindrome(s1, reversed);
		System.out.println(isPalin);
		sc.close();
	}

	public static String reverseString(String s1) {
		String reverse = "";

		for (int i = 0; i < s1.length(); i++) {
			reverse = s1.charAt(i) + reverse;
		}
		return reverse;
	}
	
	public static String isPalindrome(String s1,String s2) {
		if(s1.equalsIgnoreCase(s2)) {
			return "Yes,The given string is palindrome";
		}else {
			return "No,The given string is not palindrome";
		}
	}

}
