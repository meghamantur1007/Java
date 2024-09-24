package com.xworkz.examples.completeAbstraction;

public class HospitalStaffRunner {

	public static void main(String[] args) {
		HospitalStaff hospitalStaff = new Doctor();
		Doctor doctor = new Doctor();
		doctor.performDuty();
		doctor.takeBreak();
	}

}
