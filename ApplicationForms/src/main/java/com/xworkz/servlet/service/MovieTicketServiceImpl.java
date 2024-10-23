package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.MovieTicketDTO;

public class MovieTicketServiceImpl implements MovieTicketService {

	@Override
	public boolean validateAndSave(MovieTicketDTO dto) {

		boolean valid = true;
		String name=dto.getName();
		if (name != null && !name.isEmpty() && name.length()> 2 && name.length() <= 100) {
            System.out.println("Movie name is valid");
        } else {
        	valid=false;
            System.out.println("Movie name is invalid");
        }

        System.out.println("================");

       
        int totalTickets = dto.getTotalTickets();
        if (totalTickets >0) {
            System.out.println("Total tickets is valid");
            
        } else {
        	valid=false;
            System.out.println("Total tickets is invalid");
        }

        System.out.println("================");

        
        String theaterName = dto.getTheaterName();
        if (theaterName != null && !theaterName.isEmpty()&& theaterName.length() >= 2 && theaterName.length() <= 100) {
            System.out.println("Theater name is valid");
            
        } else {
        	valid=false;
            System.out.println("Theater name is invalid");
        }


        System.out.println("================");

       
        double donation = dto.getDonation();
        if (donation >0) {
            System.out.println("Donation is valid");
            
        } else {
        	valid=false;
            System.out.println("Donation is invalid");
        }

        System.out.println("================");

 
		
		return valid;
		
	}

}
