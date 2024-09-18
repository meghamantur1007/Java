package com.xworkz.implement;

import com.xworkz.interfaces.MallRule;

public class MallRuleImpl implements MallRule {

	@Override
	public boolean validId() {
		System.out.println("running validId in MallRuleImpl");
		return true;
	}

}
