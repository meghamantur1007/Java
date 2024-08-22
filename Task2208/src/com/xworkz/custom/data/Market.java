package com.xworkz.custom.data;

public class Market {
	private String name;
    private String location;
    
	
    
    public Market(String name,String location){
		
		this.name = name;
		this.location = location;
	
	}
    public void display() {
    	System.out.println("Martket name: "+name);
    	System.out.println("Market location: "+name);
    }
}
