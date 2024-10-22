package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.CricketDTO;

public class CricketserviceImpl implements CricketService {

	@Override
	public boolean validateAndSave(CricketDTO dto) {

		boolean valid = true;
		String groundName = dto.getGroundName();
		if (groundName != null && !groundName.isEmpty() && groundName.length() >= 3 && groundName.length() <= 45) {
			System.out.println("Ground Name is valid");
		} else {
			valid = false;
			System.err.println("Inavalid Ground Name");
		}
		
        System.out.println("================");

		String customerName = dto.getCustomerName();
		if (customerName == null && customerName.isEmpty() && customerName.length() < 3
				&& customerName.length() > 100) {
			System.out.println("Customer Name is invalid");

		} else {
			valid = false;
			System.out.println("Customer Name is valid");
		}
		
        System.out.println("================");

		String customerEmail = dto.getCustomerEmail();
		if (customerEmail != null && !customerEmail.isEmpty()
				&& (customerEmail.contains("@") && (customerEmail.endsWith(".com") || customerEmail.endsWith(".in")))) {
			System.out.println("Email is valid");
		} else {
			valid = false;
			System.err.println("Inavlid Email");
			return valid = true;
		}
		
        System.out.println("================");

		int noOfTickets = dto.getNoOfTickets();
        if (noOfTickets <= 0) {
            System.out.println("Number of Tickets is invalid");
        } else {
            valid=false;
            System.err.println("Number of Tickets is valid");
        }
		return valid;
	}
}
