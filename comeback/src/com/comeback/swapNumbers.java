package com.comeback;

public class swapNumbers {

	public static void main(String[] args) {
		
		int x=2;
		int y = x++ + ++x + x++ + x + --x + x++ + ++x;
		System.out.println(x);
		System.out.println(y);
		int a=4;
		int b = x++ + ++x + x++ + ++x + x-- + --x;
		System.out.println(a);
		System.out.println(b);
	}

}
 