package com.revision;

public class SecondLargestandSecondSmallest {

	public static void main(String[] args) {

		int[ ] numbers = {24,4,6,3,1,4,6,464,6,45,46,4,245,35,6465,75,7,4645,342,46,56,57,68,54};
		
		int max=numbers[0];
		int min=numbers[0];
		int secmax=numbers[0];
		int secmin=numbers[0];
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
			if(numbers[i]<min) {
				min = numbers[i];
			}
		}
		
		for(int i =0;i<numbers.length;i++) {
			if(numbers[i]<secmin && numbers[i]>min) {
				secmin =numbers[i];
			}
			
			if(numbers[i]>secmax && numbers[i]<max) {
				secmax = numbers[i];
				
			}
		}
		
		System.out.println("The second max element  is : "+secmax);
		System.out.println("The second min element  is : "+secmin);

				
	}

}
