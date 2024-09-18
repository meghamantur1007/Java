package com.xworkz.implement;

import com.xworkz.interfaces.HotelRule;

public class CanaraHotelRuleImplement implements HotelRule {
	@Override
	public boolean cleanPremises() {
		System.out.println("running cleanPremises in CanaraHotelRuleImpl ");
		return false;
	}
}
