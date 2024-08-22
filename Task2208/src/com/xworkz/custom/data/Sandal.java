package com.xworkz.custom.data;

public class Sandal {
    private String brand;
    private char size;
    private double cost;
    private String color;
	
    
    public Sandal(String brand, char size, double cost, String color) {
		
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
    public void display() {
    	System.out.println("Sandal brand: "+brand);
    	System.out.println("Sandal Size: "+size);
    	System.out.println("Sandal Cost: "+cost);
    	System.out.println("Sandal Color: "+color);
    }
  
}
