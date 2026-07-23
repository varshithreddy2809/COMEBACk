package com.array.gptquestion;

import java.util.ArrayList;
import java.util.List;

public class FourthCollecctions {

	public static void main(String[] args) {
		
		List<String> Fruits = new ArrayList<>();
		
		Fruits.add("Apple");
		Fruits.add("Banana");
		Fruits.add("Gauva");
		Fruits.add("Custard Apple");
		Fruits.add("Water Melon");

		
		if(Fruits.contains("Apple")) {
			System.out.println("the entered fruit is present");
		} else {
			System.out.println("the entered fruit is not in the list");
		}
	}

}
