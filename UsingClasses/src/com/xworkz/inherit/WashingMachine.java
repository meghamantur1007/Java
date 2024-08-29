package com.xworkz.inherit;

public class WashingMachine {
	private String brand;
	private String type;
	private int capacity;
	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}
	public void rinse()
	{
		System.out.println("running rinse in washing machine");
	}
	public void show()
	{
		System.out.println("brand: "+this.brand);
		System.out.println("type: "+this.type);
		System.out.println("capacity: "+this.capacity);
	}



}
 