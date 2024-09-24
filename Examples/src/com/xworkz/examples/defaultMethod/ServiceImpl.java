package com.xworkz.examples.defaultMethod;

public class ServiceImpl {
	private PrintRepository printRepository;

	public ServiceImpl(PrintRepository printRepository) {
		this.printRepository = printRepository;
	}

	public void display() {
		if (printRepository != null) {
			System.out.println("printRepository is not null");
			printRepository.print();
		} else {
			System.out.println("printRepository is not null");

		}
	}
}
