package com.tcspreparation;

public class ReverseString {

	public static void main(String[] args) {

		
		String s1 = "Good-Morning";
		
		String reverse ="";
		
		for(int i= 0 ; i<s1.length();i++) {
			reverse = s1.charAt(i)+reverse;
		}
		System.out.println(reverse);
		
		byte[] bytes = s1.getBytes();
		
		for(int i = bytes.length-1;i>=0;i--) {
			System.out.print((char)bytes[i]);
		}
	}

}
