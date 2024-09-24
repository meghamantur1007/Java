package com.xworkz.examples.completeAbstraction;

public class Doctor implements HospitalStaff {

	@Override
	public void performDuty() {
		System.out.println("Doctor is diagnosing patients.");

	}

	@Override
	public void takeBreak() {
		System.out.println("Doctor is taking break.");

	}

}
