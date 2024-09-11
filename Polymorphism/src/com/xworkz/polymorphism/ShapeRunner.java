package com.xworkz.polymorphism;

public class ShapeRunner {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(3);
		shape.area(2,8);
		
		Circle circle=new Circle();
		circle.area(5);
	}
}
