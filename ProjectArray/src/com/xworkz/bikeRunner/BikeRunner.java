package com.xworkz.bikeRunner;

import com.xworkx.bike.Bike;


public class BikeRunner {

	public static void main(String[] args) {
		Bike bike=new Bike();
		
		bike.store("KTM");
		bike.store("Pulser");
		bike.store("Yamaha");
		bike.store("Hero");
		bike.store("Honda");
		bike.store("Royal Enfield");
		bike.store("Suzuki");
		
		
		bike.display();

	}

}
