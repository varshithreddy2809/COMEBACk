package com.oops;

public class bookOne {

	public static void main(String[] args) {
		book b1 = new book();
			b1.setBookName("The 100 Days");
			b1.setBookPrice(500.69);
			b1.setAuthorName("Varshith");
			b1.setPublisherName("The Fine Publishers");
			
			System.out.println(b1.getBookName());
			System.out.println(b1.getBookPrice());
			System.out.println(b1.getAuthorName());
			System.out.println(b1.getPublisherName());
	}

}
