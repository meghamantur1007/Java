package com.xworkz.custom.data;

public class SideDish {
	private String name;
	private double price;
	private String type;
	
	public SideDish(String name, double price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void display() {
		System.out.println("SideDish name: "+name);
		System.out.println("SideDish price: "+price);
		System.out.println("SideDish type: "+type);
	}
}
