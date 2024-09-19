package com.xworkz.standards.repository;

public class VehicleRepositoryImpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("running save in VehicleRepositoryImpl");
	}

	@Override
	public void update() {
		System.out.println("running update in VehicleRepositoryImpl");

	}

	@Override
	public boolean delete() {
		System.out.println("running delete in VehicleRepositoryImpl");
		return true;
	}

	@Override
	public String read() {
		System.out.println("running read in VehicleRepositoryImpl");
		return "abcd";
	}

}
