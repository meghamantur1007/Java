package com.xworkz.examples.defaultMethod;

public interface PrintRepository {
	void print();

	default void printDocument() {
		System.out.println("printDocument in PrintRepository");
	}
}
