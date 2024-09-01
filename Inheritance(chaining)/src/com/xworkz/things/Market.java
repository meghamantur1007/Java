package com.xworkz.things;

public class Market {
	String name;
	String location;
	int shops;
	String type;

	public Market(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public Market(String name, String location, int shops, String type) {
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}

	public void display() {
		System.out.println("Market Name: " + name);
		System.out.println("Location: " + location);
	}
	public void displayDetails() {
		System.out.println("Market Name: " + name);
		System.out.println("Location: " + location);
		System.out.println("Number of Shops: " + shops);
		System.out.println("Type: " + type);
	}
}