package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.RegistrationDTO;

public class RegistrationServiceImpl implements RegistrationService {

	@Override
	public boolean validAndSave(RegistrationDTO dto) {

		boolean valid = true;
		if (dto != null) {
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 45) {
				System.out.println("name is valid");
			}
			else {
			valid = false;
			System.out.println("name is invalid");
			}
		}

		String email = dto.getEmail();
		if (email != null && !email.isEmpty() && (email.endsWith(".com") || email.endsWith(".in"))
				&& (email.contains("@"))) {
			System.out.println("email is valid");
		} else {
			valid = false;
			System.out.println("email is inavalid");
		}

		int age = dto.getAge();
		if (age > 18) {
			System.out.println("age is valid");
		} else {
			valid = false;
			System.out.println("age is invalid");
		}
		
		
		String city = dto.getCity();
		if (city != null && !city.isEmpty() && city.length() >= 3 && city.length() < 45) {
			System.out.println("city name is valid");
		} else {
			valid = false;
			System.out.println("city name is invalid");
		}

		String state = dto.getState();
		if (state != null && !state.isEmpty() && state.length() >= 3 && state.length() < 45) {
			System.out.println("state is valid");
		} else {
			valid = false;
			System.out.println("state is invalid");
		}

		String country = dto.getCountry();
		if (country != null && !country.isEmpty() && country.length() >= 3 && country.length() < 45) {
			System.out.println("country is valid");
		} else {
			valid = false;
			System.out.println("country is invalid");
		}

		return valid;
	}

}
