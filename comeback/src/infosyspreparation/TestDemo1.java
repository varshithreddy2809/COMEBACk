package infosyspreparation;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {

		
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		for(int i= 0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		for(int i : array) {
			System.out.print( i + " ");
		}
		
		sc.close();
	}

}
