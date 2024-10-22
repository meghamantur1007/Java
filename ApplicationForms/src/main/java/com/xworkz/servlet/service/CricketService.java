package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.CricketDTO;

public interface CricketService {
	boolean validateAndSave(CricketDTO dto);
}
