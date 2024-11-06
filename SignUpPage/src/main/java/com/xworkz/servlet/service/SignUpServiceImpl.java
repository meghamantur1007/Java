package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.SignUpDTO;

public class SignUpServiceImpl implements SignUpService {

	@Override
	public boolean validAndSave(SignUpDTO signUpDto) {

		boolean valid = true;
		if (signUpDto != null) {
			String userId = signUpDto.getUserId();
			if (userId != null && !userId.isEmpty() && userId.length() > 3 && userId.length() < 45) {
				System.out.println("userId is valid");
			} else {
				valid = false;
				System.out.println("userId is invalid");
			}
		}
		if (signUpDto != null) {
			String email = signUpDto.getEmail();
			if (email != null && !email.isEmpty() && (email.endsWith(".com")) && (email.contains("@"))) {
				System.out.println("email is valid");
			} else {
				valid = false;
				System.out.println("email is inavalid");
			}

		}
		if (signUpDto != null) {
			String password = signUpDto.getPassword();
			String confirmPassword = signUpDto.getConfirmPassword();
			if (password != null && !password.isEmpty() && password.length() > 3 && password.length() < 45
					&& confirmPassword.equals(password)) {
				System.out.println("password is valid");
			} else {
				valid = false;
				System.out.println("password is invalid");
			}

		}
		return valid;

	}
}
