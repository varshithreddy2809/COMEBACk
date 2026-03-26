package com.comeback;

public class Garbage {

	public static void main(String[] args) {
	
		        System.out.println("Object is garbage collected");
		        // 1. Nullifying reference
		        Garbage obj1 = new Garbage();
		        obj1 = null;   // now eligible for GC

		        // 2. Reassigning reference
		        Garbage obj2 = new Garbage();
		        obj2 = new Garbage();  // old object becomes eligible

		        // 3. Anonymous object
		        new Garbage();  // no reference, directly eligible

		        // Requesting JVM for garbage collection
		        System.gc();
		    }
		}
