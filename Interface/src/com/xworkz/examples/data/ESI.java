package com.xworkz.examples.data;

public class ESI implements HospitalRule {
	@Override
	public void patientPrivacy() {
		System.out.println("running patientPrivacy");
	}

	@Override
	public void infectionControl() {
		System.out.println("running infectionControl");
	}

	@Override
	public void patientSafety() {
		System.out.println("running patientSafety");
	}
}
