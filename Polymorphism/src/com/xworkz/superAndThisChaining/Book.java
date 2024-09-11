//this() is used to call another constructor from the same class.
package com.xworkz.superAndThisChaining;

public class Book {

	String title;
	int pages;

	// Constructor with one parameter
	Book(String title) {
		// Calls the constructor with two parameters
		this(title, 0);
		System.out.println("Book with title only: " + title);
	}

	// Constructor with two parameters
	Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
		System.out.println("Book with title: " + title + " and pages: " + pages);
	}
}
