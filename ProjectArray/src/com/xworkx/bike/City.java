package com.xworkx.bike;

public class City {
	String[] city=new String[7];
	 int index=0;
	
	
	public void store(String cityName) {
		city[index]=cityName;
		index++;
		
	}
	public void display() {
		for(String ref:city) {
			System.out.println("Sweets Names: "+ref);
}
}
}
