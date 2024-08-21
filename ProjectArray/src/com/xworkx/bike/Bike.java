package com.xworkx.bike;

public class Bike {
	String[] bikes=new String[7];
	 int index=0;
	
	
	public void store(String bikeName) {
		bikes[index]=bikeName;
		index++;
		
	}
	public void display() {
		for(String ref:bikes) {
			System.out.println("Bike Names: "+ref);
		}
	}

}
