package com.xworkz.example;

public class LenovoProvider extends Provider {
	
	private double profit;
	
	public LenovoProvider(double profit,String name, String ceoName) {
		super(name, ceoName);
		this.profit=profit;
		
	}


	@Override
	public void service() {
		System.out.println("running service in LenovoProvider");		
	}
}