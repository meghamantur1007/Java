package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.ConcertTiketDTO;

public interface ConcertTicketService {

	boolean validateAndSave(ConcertTiketDTO dto);
}
