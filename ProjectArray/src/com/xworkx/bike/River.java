package com.xworkx.bike;

public class River {
	String[] river=new String[7];
	 int index=0;
	
	
	public void store(String riverNames) {
		river[index]=riverNames;
		index++;
		
	}
	public void display() {
		for(String ref:river) {
			System.out.println("Sweets Names: "+ref);
}
}
}
