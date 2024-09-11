package com.xworkz.superAndThisChaining;

public class Smartphone extends Device {
	String model;
	int storage;

	public Smartphone(String brand,String type, int storage) {
		super(brand,type);
		this.storage = storage;
	}
	@Override
    void deviceInfo() {
        super.deviceInfo();  // Calls the parent class method
        System.out.println("Storage: " + storage + "GB");
    }

}
