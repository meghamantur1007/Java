package com.xworkz.standards.repository;

public class MachineRepositoryImpl implements MachineRepository {

	@Override
	public void save() {
		System.out.println("running save in MachineRepositoryImpl");
	}

	@Override
	public int update() {
		System.out.println("running update in MachineRepositoryImpl");
		return 2;
	}

	@Override
	public int delete() {
		System.out.println("running delete in MachineRepositoryImpl");
		return 3;
	}

	@Override
	public int read() {
		System.out.println("running read in MachineRepositoryImpl");
		return 6;
	}

}
