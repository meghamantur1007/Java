//super() is a special keyword used to call constructors.
//calls the constructor of the immediate parent class
package com.xworkz.superAndThisChaining;

public class Device {

	String brand;
	String type;

	public Device(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}

	void deviceInfo() {
		System.out.println("Brand: " + brand + ", Type: " + type);
	}
}
