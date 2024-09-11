package com.xworkz.polymorphism;

public class Circle extends Shape {
	//Run-time polymorphism:
	//*is achieved through the method overriding
	//*subclass overrides(change logic)inherited method
	//basically a compile time polymorphism but JVM decides whether executes the parent or child.
	
	
	@Override
	double area(int radius) {
		double areaOfCircle=Math.PI*radius*radius;
		System.out.println("Overriding the class shape by subclass Circle"+areaOfCircle);
		return 0;
	}
	
}
