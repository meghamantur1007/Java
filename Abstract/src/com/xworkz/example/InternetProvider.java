package com.xworkz.example;

public class InternetProvider extends Provider {
	public InternetProvider(String name, String ceoName) {
		super(name, ceoName);
	}

	@Override
	public void service() {
		System.out.println("running service in InternetProvider");
	}
}
