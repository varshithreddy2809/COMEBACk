package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ThirdCollections {

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

		List<String> DC = new ArrayList<>();
		DC.add("Batman");
		DC.add("Superman");
		DC.add("Flash");
		DC.add("Wonder Women");
		DC.add("Joker");
		DC.add("Penguin");
		
		List<String> DCandA = new ArrayList<>();
		DCandA.addAll(DC);
		DCandA.addAll(A);
		System.out.println(DCandA.containsAll(A));
		
	}

}
