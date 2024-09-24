package com.xworkz.examples.encapsulation.access;

import com.xworkz.examples.encapsulation.Book;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book();
		System.out.println(book.getPrice());
		System.out.println(book.setPrice(100));
	}

}
