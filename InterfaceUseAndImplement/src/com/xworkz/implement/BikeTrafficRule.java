package com.xworkz.implement;

import com.xworkz.interfaces.TrafficRule;

public class BikeTrafficRule implements TrafficRule {

	@Override
	public String licenceNo() {
		System.out.println("running licenceNo in BikeTrafficRule");
		return null;
	}

}
