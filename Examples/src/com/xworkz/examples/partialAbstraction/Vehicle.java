package com.xworkz.examples.partialAbstraction;

public abstract class Vehicle {
	public abstract void startEngine();

	public void stopEngine() {
		System.out.println("Engine stopped.");
	}
}
