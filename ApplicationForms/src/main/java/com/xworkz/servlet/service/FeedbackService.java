package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.FeedbackDTO;

public interface FeedbackService {

	
	boolean validateAndSave(FeedbackDTO dto);
}
