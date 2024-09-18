package com.xworkz.runner;

import com.xworkz.implement.MallRuleImpl;
import com.xworkz.interfaces.MallRule;
import com.xworkz.use.OrionMall;

public class MallRuleRunner {

	public static void main(String[] args) {
		MallRule mallRule = new MallRuleImpl();
		OrionMall orionMall = new OrionMall(mallRule);
		orionMall.checkValidId();

	}

}
