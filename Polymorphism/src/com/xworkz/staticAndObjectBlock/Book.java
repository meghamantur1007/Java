package com.xworkz.staticAndObjectBlock;

public class Book {
	public Book() {
		System.out.println("created a book with no argument const...");
	}

	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}

}
