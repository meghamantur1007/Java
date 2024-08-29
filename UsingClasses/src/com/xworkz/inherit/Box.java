package com.xworkz.inherit;

public class Box {
	private String brand;
	private double cost;
	private String color;

	public Box(String brand, double cost, String color) {
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}

	public void pack() {
		System.out.println("Box is used for packing items.");
	}

	public void display() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Cost: " + this.cost);
		System.out.println("Color: " + this.color);
	}
}
