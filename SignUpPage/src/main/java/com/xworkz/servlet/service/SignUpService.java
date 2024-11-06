package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.SignUpDTO;

public interface SignUpService {

	boolean validAndSave(SignUpDTO signUpDTO);
}
