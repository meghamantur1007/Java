package com.xworkz.exception;

public class Service {

	public void run(String validEmailException) throws ValidEmailException {
		if (validEmailException == null || validEmailException.equals("")) {
			System.out.println("invalid email");
			throw new ValidEmailException();
		} else {
			System.out.println("valid Email");
		}
	}
	
	public void saveEmail(String mail) throws ValidEmailException{
		if(mail.equals("") || mail.equals("meghamantur831@gmai.com")) {
			System.out.println("valid email");
		}
		else {
			throw new ValidEmailException();
		}
	}
	
	public void savePrice(double price){
		if(price<100) {
			throw new ValidPriceException();
		}
		else {
			System.out.println("valid price");
		}
	}
}
