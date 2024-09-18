package com.xworkz.use;

import com.xworkz.interfaces.TrafficRule;

public class TrafficRuleProcessor {
	private TrafficRule trafficRule;

	public void setTrafficRule(TrafficRule trafficRule) {
		this.trafficRule = trafficRule;
	}

	public void start() {
		if (trafficRule != null) {
			System.out.println("trafficRule is not null");
			trafficRule.licenceNo();

		} else {
			System.out.println("trafficRule is null");
		}
	}
}