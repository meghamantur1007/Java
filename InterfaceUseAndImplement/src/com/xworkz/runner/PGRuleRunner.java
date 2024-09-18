package com.xworkz.runner;

import com.xworkz.implement.PGRuleImplement;
import com.xworkz.interfaces.PGRule;
import com.xworkz.use.KhushiPG;

public class PGRuleRunner {

	public static void main(String[] args) {
		PGRule pgRule = new PGRuleImplement();
		KhushiPG khushiPg=new KhushiPG();
		khushiPg.setPGRule(pgRule);
		khushiPg.checkCostAndWifi();
	}

}
