package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.CollegeAdmissionDTO;

public class CollegeAdmissionImpl implements CollegeAdmissionService {

	@Override
	public boolean validateAndSave(CollegeAdmissionDTO admissionDTO) {

		boolean valid = true;
		String name = admissionDTO.getName();
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 45) {
			System.out.println("Name is valid");
		} else {
			valid = false;
			System.err.println("Inavlid Name");
		}

        System.out.println("================");

		String email = admissionDTO.getEmail();
		if (email != null && !email.isEmpty()
				&& (email.contains("@") && (email.endsWith(".com") || email.endsWith(".in")))) {
			System.out.println("Email is valid");
		} else {
			valid = false;
			System.err.println("Inavlid Email");
		}
        System.out.println("================");

		String address = admissionDTO.getAddress();
		if (address != null && !address.isEmpty() && address.length() >= 10 && address.length() <= 500) {
			System.out.println("Address is valid.");
		} else {
			valid = false;
			System.out.println("Address is invalid");

		}
        System.out.println("================");

		String fatherName = admissionDTO.getFatherName();
		if (fatherName != null && !fatherName.isEmpty() && fatherName.length() >= 3 && fatherName.length() <= 45) {
			System.out.println("Father Name is valid");
		} else {
			valid = false;
			System.err.println("Father Name is invalid");
		}

        System.out.println("================");

		String motherName = admissionDTO.getMotherName();
		if (motherName != null && !motherName.isEmpty() && motherName.length() >= 3 && motherName.length() <= 45) {
			System.out.println("Mother Name is valid");
		} else {
			valid = false;
			System.err.println("Mother Name is invalid");
		}
        System.out.println("================");

		
		double percentage = admissionDTO.getPercentage();
		if (percentage >= 0 && percentage <= 100) {
			System.out.println("Percentage is valid");
			valid = false;
		} else {
			System.out.println("Percentage is invalid");

		}
		
        System.out.println("================");

		
		int ageConverted = admissionDTO.getAge();
		if (ageConverted > 18) {
			System.out.println("age is valid");
		} else {
			valid = false;
			System.out.println("invalid age");
		}

		return valid;

	}

}
