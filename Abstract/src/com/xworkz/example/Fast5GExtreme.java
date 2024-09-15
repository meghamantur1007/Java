package com.xworkz.example;

public class Fast5GExtreme extends ExtremeAirtelInternetProvider {
	public Fast5GExtreme(String name, String ceoName) {
		super(name, ceoName);
	}

	@Override
	public void service() {
		System.out.println("running service in Fast5GExtreme");
	}
}
