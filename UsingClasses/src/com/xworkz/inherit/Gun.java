package com.xworkz.inherit;

public class Gun {
	private String name;
	private String countryMade;
	private String type;
	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}
	public void fire()
	{
		System.out.println("gun is used to fire");
		
	}
	public void display()
	{
		System.out.println("name: "+this.name);
		System.out.println("name: "+this.countryMade);
		System.out.println("name: "+this.type);
	}

}
