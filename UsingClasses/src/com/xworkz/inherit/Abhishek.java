package com.xworkz.inherit;

public class Abhishek {
	private WashingMachine washingmachine;
	public Abhishek( WashingMachine washingmachine) {
		this.washingmachine=washingmachine;
	}
	public void powerOn()
	{
		System.out.println("running powerOn");
		if(washingmachine!=null)
		{
			washingmachine.show();
		}
		else
		{
			System.out.println("washingmachine is null");
		}
	}

}

