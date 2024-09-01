package com.xworkz.things;

public class Toothpaste {
	private String company;
	private boolean salt;

	public Toothpaste(String company) {
			this.company=company;
			
	}
	
	public Toothpaste(String company,boolean salt) {
		this.company=company;
		this.salt=salt;
	}
	public void display() {
		System.out.println("Company:"+company);
		System.out.println("salt:"+salt);
	}


}
