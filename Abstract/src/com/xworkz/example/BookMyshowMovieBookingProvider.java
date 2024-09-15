package com.xworkz.example;

public class BookMyshowMovieBookingProvider extends MovieBookingProvider {
	int totalHalls;

	public BookMyshowMovieBookingProvider(String name, String ceoName, int totalHalls) {
		super(name, ceoName);
		this.totalHalls = totalHalls;

	}

	@Override
	public void book() {
		super.book();
	}

	@Override
	public void cancel() {
		super.cancel();
	}

	@Override
	public void service() {
		System.out.println("running service in BookMyshowMovieBookingProvider.......");
	}
}
