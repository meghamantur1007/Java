package com.xworkz.examples.partialAbstraction;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.startEngine();
		vehicle.stopEngine();
	}

}
