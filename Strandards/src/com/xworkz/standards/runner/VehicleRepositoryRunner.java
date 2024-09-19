package com.xworkz.standards.runner;

import com.xworkz.standards.repository.VehicleRepository;
import com.xworkz.standards.repository.VehicleRepositoryImpl;
import com.xworkz.standards.service.VehicleService;
import com.xworkz.standards.service.VehicleServiceImpl;

public class VehicleRepositoryRunner {

	public static void main(String[] args) {
		VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
		VehicleService vehicleService=new VehicleServiceImpl(vehicleRepository);
		vehicleService.persist();
		vehicleService.merge();
		vehicleService.clear();
		vehicleService.search();
	}

}
