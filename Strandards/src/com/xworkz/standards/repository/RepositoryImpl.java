package com.xworkz.standards.repository;

public class RepositoryImpl implements Repository {

	@Override
	public boolean save() {
		System.out.println("running dave in RepositoryImpl ");
		return true;
	}

}
