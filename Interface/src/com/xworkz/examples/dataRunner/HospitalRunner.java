package com.xworkz.examples.dataRunner;

import com.xworkz.examples.data.ESI;
import com.xworkz.examples.data.HospitalRule;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalRule hospitalRule = new ESI();
		hospitalRule.patientPrivacy();
		hospitalRule.infectionControl();
		hospitalRule.patientSafety();
	}

}
