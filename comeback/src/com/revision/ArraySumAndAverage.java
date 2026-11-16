package com.revision;

public class ArraySumAndAverage {
	
	public static void main(String[] args ) {
		
		int[] array = {10,20,30,40,50,60,70,80,90};
		
		int sum = 0; 
		
		for(int i = 0;i<array.length;i++) {
			sum = sum+array[i];
		}
		
		System.out.println("Sum of elements in the array is  :" + sum);
		
		double average =(double)sum/array.length;
		
		System.out.println("The Average is : "+average);

	}

}
