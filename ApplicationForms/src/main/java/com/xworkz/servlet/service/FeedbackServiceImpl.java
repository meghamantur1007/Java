package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.FeedbackDTO;

public class FeedbackServiceImpl implements FeedbackService {

	@Override
	public boolean validateAndSave(FeedbackDTO dto) {

		boolean valid = true;
		String name = dto.getName();
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 45) {
			System.out.println("Name is valid");
		} else {
			valid = false;
			System.err.println("Inavlid Name");
		}
        System.out.println("================");

		String email = dto.getEmail();
		if (email != null && !email.isEmpty()
				&& (email.contains("@") &&(email.endsWith(".com") || email.endsWith(".in")))) {
			System.out.println("Email is valid");
		} else {
			valid = false;
			System.err.println("Inavlid Email");
		}
        System.out.println("================");

		String comments = dto.getName();
		if (comments != null && !name.isEmpty()) {
			System.out.println("Comments are valid");
		} else {
			valid = false;
			System.err.println("Inavlid Comments");
		}
        System.out.println("================");

		return valid;

	}

}
