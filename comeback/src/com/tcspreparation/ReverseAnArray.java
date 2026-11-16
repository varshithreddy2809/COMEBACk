package com.tcspreparation;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] array = {2,3,4,5,6,7,8,9};
		
		int left = 0;
		int right = array.length-1;
		int temp = array[0];
		
		while(left<right) {
			temp=array[right];
			array[right]=array[left];
			array[left] = temp;
			left++;
			right--;
		}
		
		System.out.print(" { ");
		for(int a:array) {
			System.out.print(a + " , ");
		}
		System.out.print(" } ");

	}

}
