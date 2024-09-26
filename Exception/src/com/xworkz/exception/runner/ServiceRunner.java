package com.xworkz.exception.runner;

import com.xworkz.exception.Service;
import com.xworkz.exception.ValidEmailException;

public class ServiceRunner {

	public static void main(String[] args) throws ValidEmailException {
		Service service = new Service();
		System.out.println("before run");
		service.run("meghamantur@gmail.com");
		System.out.println("after run");
		
		System.out.println("before saveEmail");
		service.saveEmail("meghamantur831@gmai.com");
		System.out.println("after saveEmail");
		
		System.out.println("before savePrice");
		service.savePrice(110);
		System.out.println("after savePrice");
		
	}

}
