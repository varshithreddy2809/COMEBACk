package com.tcspreparation;

public class CountOddAndEven {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,5,6,3,4,2,4,35,46,575,78,9,1,11,21,130,10};
		int oddCount=0;
		int evenCount=0;
		
		for(int i= 0;i<array.length;i++) {
			if(i%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("The number of odd numbers in the array are : "+oddCount);
		System.out.println("The number of even numbers in the array are : "+evenCount);

		

	}

}
