package com.xworkz.standards.service;

import com.xworkz.standards.repository.MachineRepository;

public class MachineServiceImpl implements MachineService {

	private MachineRepository machineRepository;

	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository = machineRepository;
	}

	@Override
	public void save() {
		System.out.println("running save in MachineServiceImpl");
		if (machineRepository != null) {
			System.out.println("machineRepository is not null");
			machineRepository.save();
		} else {
			System.out.println("machineRepository is null");

		}
	}

	@Override
	public void update() {
		System.out.println("running update in MachineServiceImpl");
		if (machineRepository != null) {
			System.out.println("machineRepository is not null");
			int updated = machineRepository.update();
			if (updated > 1) {
				System.out.println("Updated Successfully");
			} else {
				System.out.println("Not Updated Successfully");
			}
		} else {
			System.out.println("machineRepository is null");

		}
	}

	@Override
	public void delete() {
		System.out.println("running delete in MachineServiceImpl");
		if (machineRepository != null) {
			System.out.println("machineRepository is not null");
			int deleted = machineRepository.delete();
			if (deleted > 2) {
				System.out.println("Deleted Successfully");
			} else {
				System.out.println("Not Deleted Successfully");

			}

		} else {
			System.out.println("machineRepository is null");

		}
	}

	@Override
	public void read() {
		System.out.println("running read in MachineServiceImpl");
		if (machineRepository != null) {
			System.out.println("machineRepository is not null");
			int deleted = machineRepository.delete();
			if (deleted < 6) {
				System.out.println("Not Read");
			} else {
				System.out.println("Read Successfully");

			}

		} else {
			System.out.println("machineRepository is null");

		}
	}

}
