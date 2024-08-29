package com.xworkz.inheritance;

public class SmartPhone {
	public String brand;
	public String model;
	public int batteryCapacity;
	public int storage;
    
    
    public SmartPhone() {
    	System.out.println("Created SmartPhone with no arg const...");
    }
    public void displayDetails() {
        System.out.println("SmartPhone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("Storage: " + storage + "GB");
    }

    
    public void chargePhone() {
        System.out.println("Charging the " + brand + " " + model + "...");
    }

}
