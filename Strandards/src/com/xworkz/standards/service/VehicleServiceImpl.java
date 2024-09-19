package com.xworkz.standards.service;

import com.xworkz.standards.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {
	private VehicleRepository vehicleRepository;

	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public void persist() {
		System.out.println("running persist in VehicleServiceImpl");
		if (vehicleRepository != null) {
			System.out.println("vehicleRepository is not null");
			vehicleRepository.save();
		} else {
			System.out.println("vehicleRepository is null");

		}
	}

	@Override
	public void merge() {
		System.out.println("running merge in VehicleServiceImpl");
		if (vehicleRepository != null) {
			System.out.println("vehicleRepository is not null");
			vehicleRepository.update();
		} else {
			System.out.println("vehicleRepository is null");

		}
	}

	@Override
	public void clear() {
		System.out.println("running clear in VehicleServiceImpl");
		if (vehicleRepository != null) {
			System.out.println("vehicleRepository is not null");
			boolean deleted = vehicleRepository.delete();
			if (deleted) {
				System.out.println("Success");
			} else {
				System.out.println("failure");
			}
		} else {
			System.out.println("vehicleRepository is null");

		}
	}

	@Override
	public void search() {
		System.out.println("running search in VehicleServiceImpl");
		if (vehicleRepository != null) {
			System.out.println("vehicleRepository is not null");
			String value = vehicleRepository.read();
			if (value == "abcd") {
				System.out.println("Success");
			} else {
				System.out.println("failure");
			}
		} else {
			System.out.println("vehicleRepository is null");

		}
	}

}
