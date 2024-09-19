package com.xworkz.standards.runner;

import com.xworkz.standards.repository.AddressRepository;
import com.xworkz.standards.repository.AdressRepositoryImpl;
import com.xworkz.standards.service.AddressService;
import com.xworkz.standards.service.AddressServiceImpl;

public class AddressRepositoryRunner {

	public static void main(String[] args) {
		AddressRepository addressRepository = new AdressRepositoryImpl();
		AddressService addressService = new AddressServiceImpl(addressRepository);
		addressService.push();
		addressService.refresh();
		addressService.remove();
		addressService.load();
	}

}
