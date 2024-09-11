package com.xworkz.finalClassAndMethod;

public class Laptop extends Computer {
	// void displayType() {
	// System.out.println("This is a laptop.");
	// }
	// This will cause a compile-time error
	// Error: Cannot override the final method from Computer

	// Overriding non-final method
	@Override
	void showSpecs() {
		System.out.println("Laptop with high-end specs.");
	}
}
