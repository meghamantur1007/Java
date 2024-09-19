package com.xworkz.standards.runner;

import com.xworkz.standards.repository.MachineRepository;
import com.xworkz.standards.repository.MachineRepositoryImpl;
import com.xworkz.standards.service.MachineService;
import com.xworkz.standards.service.MachineServiceImpl;

public class MachineRepositoryRunner {

	public static void main(String[] args) {
		MachineRepository machineRepository = new MachineRepositoryImpl();
		MachineService machineService=new MachineServiceImpl(machineRepository);
		machineService.save();
		machineService.update();
		machineService.delete();
		machineService.read();
	}

}
