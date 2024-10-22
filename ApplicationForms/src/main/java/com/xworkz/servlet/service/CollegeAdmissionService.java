package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.CollegeAdmissionDTO;

public interface CollegeAdmissionService {

	
	boolean validateAndSave(CollegeAdmissionDTO admissionDTO);
}
