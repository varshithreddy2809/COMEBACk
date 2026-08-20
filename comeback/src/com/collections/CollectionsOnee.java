package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsOnee {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();

        l1.add(50);
        l1.add(10);
        l1.add(40);
        l1.add(20);
        l1.add(30);
		
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println("This is reversed before Sorting : "+l1);
        Collections.sort(l1);
        Collections.reverse(l1);
        System.out.println(l1);
        System.out.println("This is reversed after Sorting : "+l1);
        System.out.println(l1);
        
        Collections.shuffle(l1);
        System.out.println(l1);
        

	}

}
