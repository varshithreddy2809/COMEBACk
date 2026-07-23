package com.collections;

import java.util.ArrayList;
import java.util.List;

public class SecondCollections {

	public static void main(String[] args) {
		List<String> A = new ArrayList<>();
		A.add("Spider Man");
		A.add("Iron Man");
		A.add("Captain America");
		A.add("Thor");
		A.add("Black Widow");
		A.add("Hulk");
		A.add("Hawkeye");
		A.add("Deadpool");
		System.out.println(A);
		System.out.println("------------- This is for each loop -------------");
		for(String Aveng:A) {
			System.out.println(Aveng);
		}
		List<String> DC = new ArrayList<>();
		DC.add("Batman");
		DC.add("Superman");
		DC.add("Flash");
		DC.add("Wonder Women");
		DC.add("Joker");
		DC.add("Penguin");
		
		System.out.println("------------- This is for each loop -------------");
		for(String D:DC) {
			System.out.println(D);
		}
		List<String> DCandA = new ArrayList<>();
		DCandA.addAll(DC);
		DCandA.addAll(A);
		System.out.println("Both DC and Marvel : "+DCandA);
		for(String DA:DCandA) {
			System.out.println(DA);
		}
		DC.clear();
		System.out.println(DC);
		System.out.println(A.get(0));
	}

}
