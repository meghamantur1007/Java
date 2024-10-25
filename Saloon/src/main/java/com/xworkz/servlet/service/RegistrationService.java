package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.RegistrationDTO;

public interface RegistrationService {

	boolean validAndSave(RegistrationDTO dto);
}
