package com.xworkz.example;

public class AirtelInternetProvider extends InternetProvider {
	public AirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
	}

	@Override
	public void service() {
		System.out.println("running service in AirtelInternetProvider");
	}
}
