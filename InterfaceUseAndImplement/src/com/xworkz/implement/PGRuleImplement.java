package com.xworkz.implement;

import com.xworkz.interfaces.PGRule;

public class PGRuleImplement implements PGRule{

	@Override
	public double costPerMonth() {
		System.out.println("running costPerMonth in PGRuleImplement");
		return 0;
	}

	@Override
	public boolean wifi() {
		System.out.println("running wifi in PGRuleImplement");
		return false;
	}

}
