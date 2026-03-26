package com.comeback;

public class Test {

	String accountHolderName;
	int accountNumber;
	int balance;
	static String bankName;
	static String branch;
	
	public static void main(String[] args) {
		
		Test name = new Test();
		name.accountHolderName="Varshith";
		System.out.println(name.accountHolderName);
		name.accountNumber=123456789;
		System.out.println(name.accountNumber);
		name.balance=123456789;
		System.out.println(name.balance);

		
	}

}
