package com.xworkx.bike;

public class Dam {
	String[] dam=new String[7];
	 int index=0;
	
	
	public void store(String damNames) {
		dam[index]=damNames;
		index++;
		
	}
	public void display() {
		for(String ref:dam) {
			System.out.println("Sweets Names: "+ref);
}
}
}
