package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.MovieTicketDTO;

public interface MovieTicketService {
	boolean validateAndSave(MovieTicketDTO dto);
	
}
