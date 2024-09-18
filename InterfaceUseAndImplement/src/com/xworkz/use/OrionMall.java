package com.xworkz.use;

import com.xworkz.interfaces.MallRule;

public class OrionMall {
	private MallRule mallRule;

	public OrionMall(MallRule mallRule) {
		this.mallRule = mallRule;
	}

	public void checkValidId() {
		if (mallRule != null) {
			System.out.println("Id is not null");
			mallRule.validId();
			;

		} else {
			System.out.println("Id is null");

		}
	}
}
