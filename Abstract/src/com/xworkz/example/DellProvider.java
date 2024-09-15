package com.xworkz.example;

public class DellProvider extends Provider {
	
	public DellProvider(String name, String ceoName) {
		super(name, ceoName);
	
	}
	@Override
	public void service() {
		System.out.println("run Service in DellProvider");
		
	}

}