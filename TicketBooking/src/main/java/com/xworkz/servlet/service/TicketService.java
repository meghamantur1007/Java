package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.TicketDTO;

public interface TicketService {

	boolean validAndSave(TicketDTO ticketDto);
}
