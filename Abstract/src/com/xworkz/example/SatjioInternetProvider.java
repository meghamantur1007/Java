package com.xworkz.example;

public class SatjioInternetProvider extends JioInternetProvider {
	private double cost;
	private int launchDate;

	public SatjioInternetProvider(double cost, int launchDate, String name, String ceoName) {

		super(name, ceoName);
		this.cost = cost;
		this.launchDate = launchDate;

	}

	@Override
	public void service() {
		System.out.println("run Service in SatJioInternet");

	}

}
