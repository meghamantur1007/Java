package com.xworkz.servlet.dto.repo;

import com.xworkz.servlet.dto.TicketDTO;

public interface TicketRepository {
	int save(TicketDTO ticketDto);
}
