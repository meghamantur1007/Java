package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.MovieTicketDTO;

public class MovieTicketServiceImpl implements MovieTicketService {

	@Override
	public boolean validateAndSave(MovieTicketDTO dto) {

		boolean valid = true;
		String name=dto.getName();
		if (name == null && name.isEmpty() && name.length() < 2 && name.length() > 100) {
            System.out.println("Movie name is invalid");
        } else {
        	valid=false;
            System.out.println("Movie name is valid");
        }

        System.out.println("================");

       
        int totalTickets = dto.getTotalTickets();
        if (totalTickets <= 0) {
            System.out.println("Total tickets is invalid");
        } else {
        	valid=false;
            System.out.println("Total tickets is valid");
        }

        System.out.println("================");

        
        String theaterName = dto.getTheaterName();
        if (theaterName == null && theaterName.isEmpty()&& theaterName.length() < 2 && theaterName.length() > 100) {
            System.out.println("Theater name is invalid");
        } else {
            valid = false; 
            System.out.println("Theater name is valid");
        }


        System.out.println("================");

       
        double donation = dto.getDonation();
        if (donation < 0) {
            System.out.println("Donation is invalid");
        } else {
            valid = false; 
            System.out.println("Donation is valid");
        }

        System.out.println("================");

        String date = dto.getDate();
        if (date == null&& date.isEmpty()) {
            System.out.println("Date is invalid");
            valid = false; 
        } else {
            System.out.println("Date is valid");
        }

        System.out.println("================");

        
        String time = dto.getTime();
        if (time == null && time.isEmpty()) {
            System.out.println("Time is invalid");
        } else {
            valid = false; 
            System.out.println("Time is valid");
        }

		
		return valid;
		
	}

}
