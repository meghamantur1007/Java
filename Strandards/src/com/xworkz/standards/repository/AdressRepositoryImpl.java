package com.xworkz.standards.repository;

public class AdressRepositoryImpl implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("running save in AdressRepositoryImpl");
		return true;
	}

	@Override
	public int update() {
		System.out.println("running update in AdressRepositoryImpl");
		return 3;
	}

	@Override
	public void delete() {
		System.out.println("running delete in AdressRepositoryImpl");

	}

	@Override
	public String read() {
		System.out.println("running read in AdressRepositoryImpl");
		return "pqrs";
	}

}
