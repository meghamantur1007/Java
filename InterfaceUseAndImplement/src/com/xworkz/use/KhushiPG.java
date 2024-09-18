package com.xworkz.use;

import com.xworkz.interfaces.PGRule;

public class KhushiPG {
	private PGRule pgRule;

	public void setPGRule(PGRule pgRule) {
		this.pgRule = pgRule;
	}
public void checkCostAndWifi() {
	if(pgRule!=null) {
		System.out.println("pgRule is not null");
		pgRule.costPerMonth();
		pgRule.wifi();
	}
	else {
		System.out.println("pgRule is not null");

	}
}
}
