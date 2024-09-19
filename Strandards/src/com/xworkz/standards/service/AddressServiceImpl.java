package com.xworkz.standards.service;

import com.xworkz.standards.repository.AddressRepository;

public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public void push() {
		System.out.println("running push in AddressServiceImpl");
		if (addressRepository != null) {
			System.out.println("addressRepository is not null");

			boolean saved = addressRepository.save();
			if (saved) {
				System.out.println("saved success");

			} else {
				System.out.println("saved failure");

			}
		} else {
			System.out.println("addressRepository is null");

		}
	}

	@Override
	public void refresh() {
		System.out.println("running refresh in AddressServiceImpl");
		if (addressRepository != null) {
			System.out.println("addressRepository is not null");
			int updated = addressRepository.update();
			if (updated > 1) {
				System.out.println("Success");
			} else {
				System.out.println("Failure");
			}
		} else {
			System.out.println("addressRepository is  null");

		}

	}

	@Override
	public void remove() {
		System.out.println("running remove in AddressServiceImpl");
		if (addressRepository != null) {
			System.out.println("addressRepository is not null");
			addressRepository.delete();
		} else {
			System.out.println("addressRepository is  null");
		}
	}

	@Override
	public void load() {
		System.out.println("running load in AddressServiceImpl");
		if (addressRepository != null) {
			System.out.println("addressRepository is not null");
			String store = addressRepository.read();
			if (store == "pqrs") {
				System.out.println("Successfully read");
			} else {
				System.out.println("reading failure");
			}
		} else {
			System.out.println("addressRepository is  null");

		}
	}

}
