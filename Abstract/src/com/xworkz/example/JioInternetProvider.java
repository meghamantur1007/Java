package com.xworkz.example;

public class JioInternetProvider extends InternetProvider {
	public JioInternetProvider(String name, String ceoName) {

		super(name, ceoName);

	}

	@Override
	public void service() {
		System.out.println("running Service in JioInternetProvider");
}
}
