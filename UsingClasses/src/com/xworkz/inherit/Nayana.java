package com.xworkz.inherit;

public class Nayana {
	public void addFabricConditioner()
	{
		System.out.println("running addFabricConditioner");
		WashingMachine washingmachine=new WashingMachine("Haier","front load",12);
		washingmachine.rinse();
		washingmachine.show();

	}
}
