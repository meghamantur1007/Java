package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.TicketDTO;
import com.xworkz.servlet.dto.repo.TicketRepository;
import com.xworkz.servlet.dto.repo.TicketRepositoryImpl;

public class TicketServiceImpl implements TicketService {

	@Override
	public boolean validAndSave(TicketDTO ticketDto) {

		boolean valid = true;
		if (ticketDto != null) {
			int tickets = ticketDto.getTickets();
			if (tickets > 0 && tickets <= 10) {
				System.out.println("number of tickets are valid");
			} else {
				valid = false;
				System.out.println("number of tickets are not valid");
			}

			String email = ticketDto.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
				System.out.println("email is valid");
			} else {
				valid = false;
				System.out.println("email is not valid");
			}
			if (valid) {
				TicketRepository ticketRepo = new TicketRepositoryImpl();
				int pk = ticketRepo.save(ticketDto);
				if (pk > 0) {
					System.out.println("data saved");
					return true;
				} else {
					System.out.println("data s not saved");

					return false;
				}
			}
		}
		return valid;
	}

}
