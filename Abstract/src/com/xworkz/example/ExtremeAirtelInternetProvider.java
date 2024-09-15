package com.xworkz.example;

public class ExtremeAirtelInternetProvider extends AirtelInternetProvider {
	public ExtremeAirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
	}

	@Override
	public void service() {
		System.out.println("running service in ExtremeAirtelInternetProvider");
	}
}
