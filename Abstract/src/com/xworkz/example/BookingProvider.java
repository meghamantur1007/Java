package com.xworkz.example;

public  class BookingProvider extends Provider {
	public BookingProvider(String name, String ceoName) {
		super(name, ceoName);

	}

	@Override
	public void service() {
		System.out.println("running service in BookingProvider");
	}

}
