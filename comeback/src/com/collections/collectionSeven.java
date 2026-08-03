package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionSeven {

	public static void main(String[] args) {

		Collection <String> cou = new ArrayList<>();
		cou.add("Java");
		cou.add("Spring");
		cou.add("Sql");
		cou.add("JDBC");
		
		Iterator <String> itr = cou.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}
}
