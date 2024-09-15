package com.xworkz.example;

public class MovieBookingProvider extends BookingProvider {
	public MovieBookingProvider(String name, String ceoName) {
		super(name, ceoName);
	}
	
	public void book(){
		System.out.println("running book in MovieBookingProvider");
	}
	public void cancel() {
		System.out.println("running cancel in MovieBookingProvider");
	}
}
