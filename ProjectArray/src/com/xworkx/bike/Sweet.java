package com.xworkx.bike;

public class Sweet {
	String[] sweets=new String[7];
	 int index=0;
	
	
	public void store(String sweet) {
		sweets[index]=sweet;
		index++;
		
	}
	public void display() {
		for(String ref:sweets) {
			System.out.println("Sweets Names: "+ref);
}
}
}