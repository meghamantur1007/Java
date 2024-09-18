package com.xworkz.runner;

import com.xworkz.implement.BikeTrafficRule;
import com.xworkz.interfaces.TrafficRule;
import com.xworkz.use.TrafficRuleProcessor;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		TrafficRule trafficRule = new BikeTrafficRule();
		TrafficRuleProcessor trafficRuleProcessor = new TrafficRuleProcessor();
		trafficRuleProcessor.setTrafficRule(trafficRule);
		trafficRuleProcessor.start();

	}

}
