package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.ConcertTiketDTO;

public class ConcertTicketServiceImpl implements ConcertTicketService {

    @Override
    public boolean validateAndSave(ConcertTiketDTO dto) {

        boolean valid = true;

 
        String location = dto.getLocation();
        if (location == null || location.isEmpty() || location.length() < 3 || location.length() > 100) {
            System.out.println("Location is invalid");
            valid = false;  
        } else {
            System.out.println("Location is valid");
        }

        System.out.println("================");

       
        String artistName = dto.getArtistName();
        if (artistName == null || artistName.isEmpty() || artistName.length() < 3 || artistName.length() > 100) {
            System.out.println("Artist Name is invalid");
            valid = false; 
        } else {
            System.out.println("Artist Name is valid");
        }

        System.out.println("================");

        
        int noOfTickets = dto.getTotalTickets();
        if (noOfTickets <= 0) {
            System.out.println("Number of Tickets is invalid");
            valid = false;  
        } else {
            System.out.println("Number of Tickets is valid");
        }

        System.out.println("================");

        return valid; 
    }
}
